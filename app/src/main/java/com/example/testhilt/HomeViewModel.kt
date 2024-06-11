package com.example.testhilt

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.testhilt.repository.RepositoryInterface
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    var repository: RepositoryInterface,
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO
) : ViewModel() {
    private val _message = MutableStateFlow("***")
    val message: StateFlow<String> get() = _message

    fun loadMessage(str: String = "Greetings!") = viewModelScope.launch (dispatcher){ _message.value = str }

    fun fetchData() {
        viewModelScope.launch { _message.value = repository.fetchData() }
    }
}