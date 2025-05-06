package com.doctors.appointment.ui.user

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun UserProfileScreen(viewModel: UserViewModel = viewModel()) {
    val user = viewModel.userData.value

    user?.let {
        Column {
            Text(text = "Name: ${user.name}")
            Text(text = "Email: ${user.email}")
        }
    } ?: run {
        CircularProgressIndicator() // Show a loading spinner while fetching data
    }
}