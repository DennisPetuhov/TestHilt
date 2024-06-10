package com.example.testhilt

import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Rule

@HiltAndroidTest
class HomeViewModelHiltTest {
    @get:Rule
    var hiltRule = HiltAndroidRule(this)
}