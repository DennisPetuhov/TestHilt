package com.example.testhilt.repository


interface RepositoryInterface {
//    suspend fun getAllUsers(): List<String>
//    suspend fun register(name: String)
    fun getName(): String
 suspend   fun fetchData(): String
}
