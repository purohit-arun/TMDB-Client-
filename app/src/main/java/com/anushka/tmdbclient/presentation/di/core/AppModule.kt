package com.anushka.tmdbclient.presentation.di.core

import android.content.Context
import com.anushka.tmdbclient.presentation.di.artist.ArtistModule
import com.anushka.tmdbclient.presentation.di.movie.MovieModule
import com.anushka.tmdbclient.presentation.di.tvshow.TvShowModule
import dagger.Module
import dagger.Provides
import dagger.Subcomponent
import javax.inject.Singleton

@Module
    (
    subcomponents = [
        MovieModule::class,
        ArtistModule::class,
        TvShowModule::class
    ]
)
class AppModule(private val context: Context) {

    @Singleton
    @Provides
    fun provideApplicationContext(): Context {
        return context.applicationContext
    }

}