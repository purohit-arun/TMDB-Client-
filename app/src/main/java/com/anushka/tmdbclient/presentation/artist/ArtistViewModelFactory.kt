package com.anushka.tmdbclient.presentation.artist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.anushka.tmdbclient.domain.use_cases.artist_usecases.GetArtistUsecase
import com.anushka.tmdbclient.domain.use_cases.artist_usecases.UpdateArtistUsecase

class ArtistViewModelFactory(
    private val getArtistUsecase: GetArtistUsecase,
    private val updateArtistUsecase: UpdateArtistUsecase
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ArtistViewModel(getArtistUsecase, updateArtistUsecase) as T
    }
}