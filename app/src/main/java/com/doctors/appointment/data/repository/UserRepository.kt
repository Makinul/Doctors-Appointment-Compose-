package com.doctors.appointment.data.repository

import com.doctors.appointment.data.model.User

interface UserRepository {
    suspend fun getUserData(): User
}