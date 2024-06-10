package com.example.testhilt.repository

import javax.inject.Inject


class FakeRepositoryImpl @Inject constructor(): RepositoryInterface {
//    private var users = listOf<String>()
//
//    override suspend fun getAllUsers(): List<String> = users
//
//    override suspend fun register(name: String) {
//        delay(100L) // Simulate work
//        users = users + name
//        println("Registered $name")
//    }

    override fun getName(): String {
        return "FakeRepository"
    }

    override suspend fun fetchData(): String {
        return "FakeRepository"
    }
}

// [START android_coroutine_test_user_state]
//class UserState(
//    private val repositoryInterface: RepositoryInterface,
//    private val scope: CoroutineScope,
//) {
//    private val _users = MutableStateFlow(emptyList<String>())
//    val users: StateFlow<List<String>> = _users.asStateFlow()
//
//    fun registerUser(name: String) {
//        scope.launch {
//            repositoryInterface.register(name)
//            _users.update { repositoryInterface.getAllUsers() }
//        }
//    }
//}
