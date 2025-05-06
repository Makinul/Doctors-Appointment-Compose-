package com.doctors.appointment.data.service

import com.doctors.appointment.data.model.User
import javax.inject.Inject

class ApiService @Inject constructor() {
    fun fetchUserData(): User {
        // Simulating a network API response with mock data
        return User(name = "John Doe", email = "johndoe@example.com")
    }
}