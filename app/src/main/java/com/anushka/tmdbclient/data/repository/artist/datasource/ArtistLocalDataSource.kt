package com.anushka.tmdbclient.data.repository.artist.datasource

import com.anushka.tmdbclient.data.model.artist.Artist

interface ArtistLocalDataSource {
    suspend fun getArtistFromLocalDB():List<Artist>
    suspend fun saveArtistToDB(artists:List<Artist>)
    suspend fun clearAll()
}