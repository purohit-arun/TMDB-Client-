package com.anushka.tmdbclient.presentation.di.artist

import com.anushka.tmdbclient.presentation.artist.ArtistActivity
import dagger.Provides
import dagger.Subcomponent

@ArtistScope
@Subcomponent(modules = [ArtistModule::class])
interface ArtistSubComponent {
    @Provides
    fun inject(artistActivity: ArtistActivity)


    @Subcomponent.Factory
    interface Factory{
        fun create():ArtistSubComponent
    }

}