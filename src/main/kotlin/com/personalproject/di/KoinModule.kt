package com.personalproject.di

import com.personalproject.repository.HeroRepository
import com.personalproject.repository.HeroRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<HeroRepository> {
        HeroRepositoryImpl()
    }
}