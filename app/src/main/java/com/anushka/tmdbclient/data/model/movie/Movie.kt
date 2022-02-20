package com.anushka.tmdbclient.data.model.movie

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "popular_movies")
data class Movie(
    @PrimaryKey
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