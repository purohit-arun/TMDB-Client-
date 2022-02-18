package com.anushka.tmdbclient.data

import com.google.gson.annotations.SerializedName

data class Movie(
    @SerializedName("id")
    var id: Int? = 0,

    @SerializedName("overview")
    var overview: String? = "",

    @SerializedName("poster_path")
    var posterPath: String? = "",

    @SerializedName("release_date")
    var releaseDate: String? = "",

    @SerializedName("title")
    var title: String? = ""

)