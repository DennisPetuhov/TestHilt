package com.example.testhilt.di

//import com.example.testhilt.repository.FakeRepositoryImpl
//import com.example.testhilt.repository.RepositoryInterface
//import dagger.Module
//import dagger.Provides
//import dagger.hilt.android.components.ViewModelComponent
//import dagger.hilt.testing.TestInstallIn
//import kotlinx.coroutines.test.UnconfinedTestDispatcher
//
//@TestInstallIn(
//    components = [ViewModelComponent::class],
//    replaces = [MyModule::class]
//)
//@Module
//class FakeHiltModule {
//    @Provides
//    fun provideFakeRepository(): RepositoryInterface {
//        return FakeRepositoryImpl()
//    }
//
//    @Provides
//    fun providesDispatcher() = UnconfinedTestDispatcher()
//}
