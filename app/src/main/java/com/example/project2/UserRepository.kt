package com.example.project2

import retrofit2.Response

class UserRepository {
    suspend fun loginUser(loginRequest:LoginRequest):
            Response<LoginResponse>? {
        return UserApi.getApi()?.loginUser(loginRequest =
        loginRequest)
    }
}