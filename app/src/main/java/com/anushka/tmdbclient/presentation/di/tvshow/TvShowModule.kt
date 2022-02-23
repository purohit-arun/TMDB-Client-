package com.anushka.tmdbclient.presentation.di.tvshow

import com.anushka.tmdbclient.domain.use_cases.artist_usecases.GetArtistUsecase
import com.anushka.tmdbclient.domain.use_cases.artist_usecases.UpdateArtistUsecase
import com.anushka.tmdbclient.domain.use_cases.tvshow_usecases.GetTvShowsUsecase
import com.anushka.tmdbclient.domain.use_cases.tvshow_usecases.UpdateTvShowsUsecase
import com.anushka.tmdbclient.presentation.artist.ArtistViewModel
import com.anushka.tmdbclient.presentation.tv.TvShowViewModel
import dagger.Module
import dagger.Provides

@Module
class TvShowModule {
    @TvShowScope
    @Provides
    fun provideTvShowViewModelFactory(
        getTvShowsUsecase: GetTvShowsUsecase,
        updateTvShowsUsecase: UpdateTvShowsUsecase
    ): TvShowViewModel {
        return TvShowViewModel(getTvShowsUsecase, updateTvShowsUsecase)
    }
}