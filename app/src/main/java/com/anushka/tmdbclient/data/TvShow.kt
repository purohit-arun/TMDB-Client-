package com.anushka.tmdbclient.data


import com.google.gson.annotations.SerializedName

data class TvShow(

    @SerializedName("first_air_date")
    var firstAirDate: String? = "",

    @SerializedName("id")
    var id: Int? = 0,

    @SerializedName("name")
    var name: String? = "",

    @SerializedName("overview")
    var overview: String? = "",

    @SerializedName("poster_path")
    var posterPath: String? = ""

)