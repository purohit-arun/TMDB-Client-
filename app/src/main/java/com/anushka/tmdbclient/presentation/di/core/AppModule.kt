package com.anushka.tmdbclient.presentation.di.core

import android.content.Context
import com.anushka.tmdbclient.presentation.di.artist.ArtistModule
import com.anushka.tmdbclient.presentation.di.artist.ArtistSubComponent
import com.anushka.tmdbclient.presentation.di.movie.MovieModule
import com.anushka.tmdbclient.presentation.di.movie.MovieSubComponent
import com.anushka.tmdbclient.presentation.di.tvshow.TvShowModule
import com.anushka.tmdbclient.presentation.di.tvshow.TvShowSubComponent
import dagger.Module
import dagger.Provides
import dagger.Subcomponent
import javax.inject.Singleton

@Module
    (
    subcomponents = [
        MovieSubComponent::class,
        ArtistSubComponent::class,
        TvShowSubComponent::class
    ]
)
class AppModule(private val context: Context) {

    @Singleton
    @Provides
    fun provideApplicationContext(): Context {
        return context.applicationContext
    }
}