package com.anushka.tmdbclient.data.repository.movie

import android.util.Log
import com.anushka.tmdbclient.data.model.movie.Movie
import com.anushka.tmdbclient.data.repository.movie.datasource.MovieCacheDataSource
import com.anushka.tmdbclient.data.repository.movie.datasource.MovieLocalDataSource
import com.anushka.tmdbclient.data.repository.movie.datasource.MovieRemoteDataSource
import com.anushka.tmdbclient.domain.repository.MovieRepository

class MovieRepositoryImpl(
    private val movieRemoteDataSource: MovieRemoteDataSource,
    private val movieLocalDataSource: MovieLocalDataSource,
    private val movieCacheDataSource: MovieCacheDataSource
) : MovieRepository {
    override suspend fun getMovies(): List<Movie>? {
        return getMoviesFromCache()
    }

    override suspend fun updateMovies(): List<Movie>? {
        val newListOfMovie = getMoviesFromAPI()
        movieLocalDataSource.clearAll()
        movieLocalDataSource.saveMoviesToDB(newListOfMovie)
        movieCacheDataSource.saveMoviesToCahce(newListOfMovie)
        return newListOfMovie
    }


    suspend fun getMoviesFromAPI(): List<Movie> {
         lateinit var movieList: List<Movie>
        try {
            val response = movieRemoteDataSource.getMovies()
            val body = response.body()
            if (body != null) {
                movieList = body.movies!!
            }
        } catch (e: Exception) {
            Log.i("MyTag", e.message.toString())
        }
        return movieList
    }

    suspend fun getMoviesFromDB(): List<Movie> {
        lateinit var movieList: List<Movie>
        try {
            movieList = movieLocalDataSource.getMoviesFromLocalDB()
        } catch (e: Exception) {
            Log.i("MyTag", e.message.toString())
        }
        if (movieList.size > 0) {
            return movieList
        } else {
            movieList = getMoviesFromAPI()
            movieLocalDataSource.saveMoviesToDB(movieList)
        }
        return movieList
    }

    suspend fun getMoviesFromCache(): List<Movie> {
        lateinit var movieList: List<Movie>
        try {
            movieList = movieCacheDataSource.getMoviesFromCache()
        } catch (e: Exception) {
            Log.i("MyTag", e.message.toString())
        }
        if (movieList.size > 0) {
            return movieList
        } else {
            movieList = getMoviesFromDB()
            movieLocalDataSource.saveMoviesToDB(movieList)
        }
        return movieList
    }
}