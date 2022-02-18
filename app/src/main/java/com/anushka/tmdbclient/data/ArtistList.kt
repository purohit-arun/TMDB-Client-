package com.anushka.tmdbclient.data


import com.google.gson.annotations.SerializedName

data class ArtistList(
    @SerializedName("results")
    var results: List<Artist>? = listOf()
)