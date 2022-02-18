package com.anushka.tmdbclient.data


import com.google.gson.annotations.SerializedName

data class Artist(

    @SerializedName("id")
    var id: Int? = 0,

    @SerializedName("name")
    var name: String? = "",

    @SerializedName("popularity")
    var popularity: Double? = 0.0,

    @SerializedName("profile_path")
    var profilePath: String? = ""
)