package com.anushka.tmdbclient.presentation.di.tvshow

import com.anushka.tmdbclient.presentation.artist.ArtistActivity
import com.anushka.tmdbclient.presentation.tv.TvShowActivity
import dagger.Provides
import dagger.Subcomponent

@TvShowScope
@Subcomponent(modules = [TvShowModule::class])
interface TvShowSubComponent {
    @Provides
    fun inject(tvShowActivity: TvShowActivity)


    @Subcomponent.Factory
    interface Factory {
        fun create(): TvShowSubComponent
    }

}