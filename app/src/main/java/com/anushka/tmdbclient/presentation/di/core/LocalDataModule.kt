package com.anushka.tmdbclient.presentation.di.core

import com.anushka.tmdbclient.data.db.ArtistDao
import com.anushka.tmdbclient.data.db.MovieDao
import com.anushka.tmdbclient.data.db.TvShowsDao
import com.anushka.tmdbclient.data.repository.artist.datasource.ArtistLocalDataSource
import com.anushka.tmdbclient.data.repository.artist.datasourceImpl.ArtistLocalDataSourceImpl
import com.anushka.tmdbclient.data.repository.movie.datasource.MovieLocalDataSource
import com.anushka.tmdbclient.data.repository.movie.datasourceImpl.MovieLocalDataSourceImpl
import com.anushka.tmdbclient.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.anushka.tmdbclient.data.repository.tvshow.datasourceImpl.TvShowLocalDataSourceImpl
import dagger.Module
import dagger.Provides

@Module
class LocalDataModule {

    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao): MovieLocalDataSource {
        return MovieLocalDataSourceImpl(movieDao)
    }

    @Provides
    fun provideArtistLocalDataSource(artistDao: ArtistDao): ArtistLocalDataSource {
        return ArtistLocalDataSourceImpl(artistDao)
    }

    @Provides
    fun provideTvShowLocalDataSource(tvShowsDao: TvShowsDao): TvShowLocalDataSource {
        return TvShowLocalDataSourceImpl(tvShowsDao)
    }
}