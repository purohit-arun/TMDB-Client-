package com.anushka.tmdbclient.presentation.di.core

import com.anushka.tmdbclient.presentation.di.artist.ArtistSubComponent
import com.anushka.tmdbclient.presentation.di.movie.MovieSubComponent
import com.anushka.tmdbclient.presentation.di.tvshow.TvShowSubComponent

interface Injector {
    fun createMovieSubComponent(): MovieSubComponent
    fun createTvShowSubComponent(): TvShowSubComponent
    fun createArtistSubComponent(): ArtistSubComponent
}