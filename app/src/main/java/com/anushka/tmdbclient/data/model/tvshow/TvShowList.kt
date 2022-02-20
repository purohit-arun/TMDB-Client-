package com.anushka.tmdbclient.data.model.tvshow


import com.google.gson.annotations.SerializedName

data class TvShowList(
    @SerializedName("results")
    var tvShows: List<TvShow>? = listOf()
)