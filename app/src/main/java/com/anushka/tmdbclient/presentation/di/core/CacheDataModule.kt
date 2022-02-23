package com.anushka.tmdbclient.presentation.di.core

import com.anushka.tmdbclient.data.db.ArtistDao
import com.anushka.tmdbclient.data.db.MovieDao
import com.anushka.tmdbclient.data.db.TvShowsDao
import com.anushka.tmdbclient.data.repository.artist.datasource.ArtistCacheDataSource
import com.anushka.tmdbclient.data.repository.artist.datasourceImpl.ArtistCacheDataSourceImpl
import com.anushka.tmdbclient.data.repository.artist.datasourceImpl.ArtistLocalDataSourceImpl
import com.anushka.tmdbclient.data.repository.movie.datasource.MovieCacheDataSource
import com.anushka.tmdbclient.data.repository.movie.datasourceImpl.MovieCacheDataSourceImpl
import com.anushka.tmdbclient.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.anushka.tmdbclient.data.repository.tvshow.datasourceImpl.TvShowCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {

    @Provides
    @Singleton
    fun provideMovieCacheDataSource(): MovieCacheDataSource {
        return MovieCacheDataSourceImpl()
    }

    @Provides
    @Singleton
    fun provideTvShowCacheDataSource(): TvShowCacheDataSource {
        return TvShowCacheDataSourceImpl()
    }

    @Provides
    @Singleton
    fun provideArtistCacheDataSource(): ArtistCacheDataSource {
        return ArtistCacheDataSourceImpl()
    }
}