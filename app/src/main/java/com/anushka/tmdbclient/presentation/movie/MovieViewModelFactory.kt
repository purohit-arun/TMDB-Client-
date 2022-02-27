package com.anushka.tmdbclient.presentation.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.anushka.tmdbclient.domain.use_cases.movie_usecases.GetMoviesUsecase
import com.anushka.tmdbclient.domain.use_cases.movie_usecases.UpdateMoviesUsecase
import javax.inject.Inject

class MovieViewModelFactory @Inject constructor(
    private val getMoviesUsecase: GetMoviesUsecase,
    private val updateMoviesUsecase: UpdateMoviesUsecase
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MovieViewModel(getMoviesUsecase, updateMoviesUsecase) as T
    }
}