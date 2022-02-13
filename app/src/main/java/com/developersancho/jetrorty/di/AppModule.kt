package com.developersancho.jetrorty.di

import com.developersancho.domain.di.domainModule
import com.developersancho.local.di.localModule
import com.developersancho.remote.di.remoteModule
import com.developersancho.repository.di.repositoryModule

val appModule = listOf(
    remoteModule(),
    localModule(),
    repositoryModule,
    domainModule,
    viewModelModule,
    providerModule
)