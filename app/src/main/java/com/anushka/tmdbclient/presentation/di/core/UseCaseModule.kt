package com.anushka.tmdbclient.presentation.di.core

import com.anushka.tmdbclient.domain.repository.ArtistRepository
import com.anushka.tmdbclient.domain.repository.MovieRepository
import com.anushka.tmdbclient.domain.repository.TvShowRepository
import com.anushka.tmdbclient.domain.use_cases.artist_usecases.GetArtistUsecase
import com.anushka.tmdbclient.domain.use_cases.artist_usecases.UpdateArtistUsecase
import com.anushka.tmdbclient.domain.use_cases.movie_usecases.GetMoviesUsecase
import com.anushka.tmdbclient.domain.use_cases.movie_usecases.UpdateMoviesUsecase
import com.anushka.tmdbclient.domain.use_cases.tvshow_usecases.GetTvShowsUsecase
import com.anushka.tmdbclient.domain.use_cases.tvshow_usecases.UpdateTvShowsUsecase
import dagger.Module
import dagger.Provides

@Module
class UseCaseModule {

    @Provides
    fun provideGetMovieUseCase(movieRepository: MovieRepository): GetMoviesUsecase {
        return GetMoviesUsecase(movieRepository)
    }

    @Provides
    fun provideUpdateMovieUseCase(movieRepository: MovieRepository): UpdateMoviesUsecase {
        return UpdateMoviesUsecase(movieRepository)
    }


    @Provides
    fun provideGetTvShowUseCase(tvShowRepository: TvShowRepository): GetTvShowsUsecase {
        return GetTvShowsUsecase(tvShowRepository)
    }

    @Provides
    fun provideUpdateTvShowUseCase(tvShowRepository: TvShowRepository): UpdateTvShowsUsecase {
        return UpdateTvShowsUsecase(tvShowRepository)
    }


    @Provides
    fun provideGetArtistUseCase(artistRepository: ArtistRepository): GetArtistUsecase {
        return GetArtistUsecase(artistRepository)
    }

    @Provides
    fun provideUpdateArtistUseCase(artistRepository: ArtistRepository): UpdateArtistUsecase {
        return UpdateArtistUsecase(artistRepository)
    }
}