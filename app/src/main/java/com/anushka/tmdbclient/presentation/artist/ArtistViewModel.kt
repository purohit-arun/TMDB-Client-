package com.anushka.tmdbclient.presentation.artist

import androidx.lifecycle.liveData
import com.anushka.tmdbclient.domain.use_cases.artist_usecases.GetArtistUsecase
import com.anushka.tmdbclient.domain.use_cases.artist_usecases.UpdateArtistUsecase

class ArtistViewModel(
    private val getArtistUsecase: GetArtistUsecase,
    private val updateArtistUsecase: UpdateArtistUsecase
) {
    fun getArtist() = liveData {
        val artistList = getArtistUsecase.execute()
        emit(artistList)
    }

    fun updateArtist() = liveData {
        val artistList = updateArtistUsecase.execute()
        emit(artistList)
    }
}