package com.anushka.tmdbclient.data


import com.google.gson.annotations.SerializedName

data class TvShowList(
    @SerializedName("results")
    var tvShows: List<TvShow>? = listOf()
)