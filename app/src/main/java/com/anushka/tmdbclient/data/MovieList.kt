package com.anushka.tmdbclient.data
import com.google.gson.annotations.SerializedName

data class MovieList(
    @SerializedName("results")
    var movies: List<Movie>? = listOf()
)