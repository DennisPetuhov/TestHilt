package com.example.testhilt

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.TestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import javax.inject.Inject

@ExperimentalCoroutinesApi
@HiltAndroidTest
class HomeViewModelTest {

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    @get:Rule
    var instantExecutorRule = InstantTaskExecutorRule()

    private lateinit var testDispatcher: TestDispatcher

    @Inject
    lateinit var viewModel: HomeViewModel

    @Before
    fun setUp() {
        hiltRule.inject()
        testDispatcher = StandardTestDispatcher()
        Dispatchers.setMain(testDispatcher)
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
    }

    @Test
    fun testLoadMessage() = runTest(testDispatcher) {
        viewModel.loadMessage("Test Message")
        val result = viewModel.message.first()
        assertEquals("Test Message", result)
    }

    @Test
    fun testFetchData() = runTest(testDispatcher) {
        viewModel.fetchData()
        val result = viewModel.message.first()
        assertEquals(
            "Fake Data",
            result
        ) // Убедитесь, что `Fake Data` соответствует тому, что возвращает ваш Fake Repository
    }
}