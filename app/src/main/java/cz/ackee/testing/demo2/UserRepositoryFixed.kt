package cz.ackee.testing.demo2

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

interface FirebaseAuthProxy {
    fun getUser(): FirebaseUser?
}

class FirebaseAuthProxyImpl(private val firebaseAuth: FirebaseAuth) : FirebaseAuthProxy {
    override fun getUser(): FirebaseUser? {
        return firebaseAuth.currentUser
    }
}

class UserRepositoryFixed(private val firebaseAuth: FirebaseAuthProxy) {
    val isLogged
        get() = firebaseAuth.getUser() != null
}
