package com.anushka.tmdbclient.presentation.di.artist

import com.anushka.tmdbclient.domain.use_cases.artist_usecases.GetArtistUsecase
import com.anushka.tmdbclient.domain.use_cases.artist_usecases.UpdateArtistUsecase
import com.anushka.tmdbclient.presentation.artist.ArtistViewModel
import dagger.Module
import dagger.Provides

@Module
class ArtistModule {
    @ArtistScope
    @Provides
    fun provideArtistViewModelFactory(
        getArtistUsecase: GetArtistUsecase,
        updateArtistUsecase: UpdateArtistUsecase
    ): ArtistViewModel {
        return ArtistViewModel(getArtistUsecase, updateArtistUsecase)
    }
}