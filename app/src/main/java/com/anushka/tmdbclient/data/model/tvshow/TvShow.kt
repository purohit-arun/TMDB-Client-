package com.anushka.tmdbclient.data.model.tvshow


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "popular_tvShows")
data class TvShow(

    @PrimaryKey
    @SerializedName("id")
    var id: Int? = 0,

    @SerializedName("first_air_date")
    var firstAirDate: String? = "",

    @SerializedName("name")
    var name: String? = "",

    @SerializedName("overview")
    var overview: String? = "",

    @SerializedName("poster_path")
    var posterPath: String? = ""

)