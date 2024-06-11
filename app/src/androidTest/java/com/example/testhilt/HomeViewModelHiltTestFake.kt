package com.example.testhilt

import com.example.testhilt.repository.FakeRepositoryImpl
import com.example.testhilt.repository.MyNewRepository
import com.example.testhilt.repository.RepositoryInterface
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.test.UnconfinedTestDispatcher
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.runTest
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import javax.inject.Inject

//@UninstallModules(MyModule::class)

@HiltAndroidTest
 class  HomeViewModelHiltTestFake {
    @get:Rule
    var hiltRule = HiltAndroidRule(this)
    @Inject
    lateinit var  myViewModel: HomeViewModel

    @Before
    fun setUp() {
        hiltRule.inject()
//        myRepo = FakeRepositoryImpl()
//        myViewModel = HomeViewModel(myRepo)
    }



    @After
    fun tearDown() {
    }

    @Test
    fun fakeRepositoryTest() {


        runTest(UnconfinedTestDispatcher()) {
         myViewModel.fetchData()
                 val data =myViewModel.message.first()
            advanceUntilIdle()
            assertEquals("FakeRepository", data)
        }
    }


    @Test
    fun getRepository() {
    }

    @Test
    fun loadMessage() {
    }

    @Test
    fun fetchData() {
    }
}
