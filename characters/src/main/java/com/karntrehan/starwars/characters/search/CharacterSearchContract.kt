package com.karntrehan.starwars.characters.search

import com.karntrehan.starwars.architecture.RemoteResponse
import com.karntrehan.starwars.characters.search.models.CharacterSearchModel
import io.reactivex.Single

interface CharacterSearchContract {
    interface Repo {

        /**
         * Get all the characters with pagination
         * */
        suspend fun characters(url: String): RemoteResponse<List<CharacterSearchModel>>

        /**
         * Get searched characters with pagination
         * */
        suspend fun searchCharacter(query: String): RemoteResponse<List<CharacterSearchModel>>
    }
}