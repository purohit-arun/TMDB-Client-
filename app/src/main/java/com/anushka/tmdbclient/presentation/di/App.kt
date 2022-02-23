package com.anushka.tmdbclient.presentation.di

import android.app.Application
import com.anushka.tmdbclient.presentation.di.artist.ArtistSubComponent
import com.anushka.tmdbclient.presentation.di.core.AppComponent
import com.anushka.tmdbclient.presentation.di.core.AppModule
import com.anushka.tmdbclient.presentation.di.core.Injector
import com.anushka.tmdbclient.presentation.di.movie.MovieSubComponent
import com.anushka.tmdbclient.presentation.di.tvshow.TvShowSubComponent

class App : Application(),Injector {
    private lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext))
    }

    override fun createMovieSubComponent(): MovieSubComponent {
        TODO("Not yet implemented")
    }

    override fun createTvShowSubComponent(): TvShowSubComponent {
        TODO("Not yet implemented")
    }

    override fun createArtistSubComponent(): ArtistSubComponent {
        TODO("Not yet implemented")
    }
}