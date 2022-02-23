package com.anushka.tmdbclient.presentation.di.core

import com.anushka.tmdbclient.presentation.di.artist.ArtistSubComponent
import com.anushka.tmdbclient.presentation.di.movie.MovieSubComponent
import com.anushka.tmdbclient.presentation.di.tvshow.TvShowSubComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        NetModule::class,
        DataBaseModule::class,
        RepositoryModule::class,
        UseCaseModule::class,
        RemoteDataModule::class,
        LocalDataModule::class,
        CacheDataModule::class
    ]
)
interface AppComponent {
    fun moviesSubComponent():MovieSubComponent.Factory
    fun tvShowComponent(): TvShowSubComponent.Factory
    fun artistSubComponent(): ArtistSubComponent.Factory
}