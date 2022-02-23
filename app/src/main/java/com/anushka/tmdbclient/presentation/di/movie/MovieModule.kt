package com.anushka.tmdbclient.presentation.di.movie

import com.anushka.tmdbclient.domain.use_cases.movie_usecases.GetMoviesUsecase
import com.anushka.tmdbclient.domain.use_cases.movie_usecases.UpdateMoviesUsecase
import com.anushka.tmdbclient.presentation.movie.MovieViewModel
import dagger.Module
import dagger.Provides

@Module
class MovieModule {
    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUsecase: GetMoviesUsecase,
        updateMoviesUsecase: UpdateMoviesUsecase
    ): MovieViewModel {
        return MovieViewModel(getMoviesUsecase, updateMoviesUsecase)
    }
}