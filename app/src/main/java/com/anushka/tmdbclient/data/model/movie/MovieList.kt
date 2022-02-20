package com.anushka.tmdbclient.data.model.movie
import com.google.gson.annotations.SerializedName

data class MovieList(
    @SerializedName("results")
    var movies: List<Movie>? = listOf()
)