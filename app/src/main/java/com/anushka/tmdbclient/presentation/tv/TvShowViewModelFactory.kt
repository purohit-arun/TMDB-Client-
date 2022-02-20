package com.anushka.tmdbclient.presentation.tv

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.anushka.tmdbclient.domain.use_cases.tvshow_usecases.GetTvShowsUsecase
import com.anushka.tmdbclient.domain.use_cases.tvshow_usecases.UpdateTvShowsUsecase

class TvShowViewModelFactory(
    private val getTvShowsUsecase: GetTvShowsUsecase,
    private val updateTvShowsUsecase: UpdateTvShowsUsecase
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return TvShowViewModel(getTvShowsUsecase, updateTvShowsUsecase) as T
    }
}