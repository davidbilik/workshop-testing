package cz.ackee.testing.demo2

import com.google.firebase.auth.FirebaseAuth


class UserRepository {

    val isLogged
        get() = FirebaseAuth.getInstance().currentUser != null
}