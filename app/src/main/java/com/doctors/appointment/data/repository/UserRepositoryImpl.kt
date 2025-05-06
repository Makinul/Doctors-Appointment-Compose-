package com.doctors.appointment.data.repository

import com.doctors.appointment.data.model.User
import com.doctors.appointment.data.service.ApiService
import kotlinx.coroutines.delay
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    val apiService: ApiService
) : UserRepository {

    override suspend fun getUserData(): User {
        delay(2000)
        return apiService.fetchUserData()
    }
}