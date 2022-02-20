package com.anushka.tmdbclient.presentation.tv

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.anushka.tmdbclient.domain.use_cases.tvshow_usecases.GetTvShowsUsecase
import com.anushka.tmdbclient.domain.use_cases.tvshow_usecases.UpdateTvShowsUsecase

class TvShowViewModel(
    private val getTvShowsUsecase: GetTvShowsUsecase,
    private val updateTvShowsUsecase: UpdateTvShowsUsecase
) : ViewModel() {
    fun getTvShows() = liveData {
        val tvShowList = getTvShowsUsecase.execute()
        emit(tvShowList)
    }

    fun updateTvShows() = liveData {
        val tvShowList = updateTvShowsUsecase.execute()
        emit(tvShowList)
    }
}