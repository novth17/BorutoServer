package com.personalproject.repository

import com.personalproject.models.ApiResponse
import com.personalproject.models.Hero

interface HeroRepository {

    //map<page , actualPage>: map server response
    val heroes: Map<Int, List<Hero>>

    //page for 15 heroes
    val page1: List<Hero>
    val page2: List<Hero>
    val page3: List<Hero>
    val page4: List<Hero>
    val page5: List<Hero>


    //suspend: a function that can pause without blocking the thread.
    suspend fun getAllHeroes(page: Int = 1): ApiResponse
    suspend fun searchHeroes(name: String?): ApiResponse
}