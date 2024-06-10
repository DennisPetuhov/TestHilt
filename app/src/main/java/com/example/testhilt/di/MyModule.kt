package com.example.testhilt.di

import com.example.testhilt.repository.MyNewRepository
import com.example.testhilt.repository.RepositoryInterface
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

@Module
@InstallIn(SingletonComponent::class)
class MyModule {
    @Provides
    fun provideRepository(dispatcher: CoroutineDispatcher): RepositoryInterface {
        return MyNewRepository(dispatcher)
    }

//    @Provides
//    fun providesDispatcher() = Dispatchers.IO
    @Provides
    fun providesDispatcher() = Dispatchers.IO
}
