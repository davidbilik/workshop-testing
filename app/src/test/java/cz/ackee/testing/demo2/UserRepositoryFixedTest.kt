package cz.ackee.testing.demo2

import com.google.firebase.auth.FirebaseUser
import junit.framework.TestCase.assertFalse
import org.junit.Test


class UserRepositoryFixedTest {

    class MockFirebaseAuth : FirebaseAuthProxy {
        override fun getUser(): FirebaseUser? = null
    }

    @Test
    fun `user should not be logged in`() {
        val repo = UserRepositoryFixed(MockFirebaseAuth())
        assertFalse(repo.isLogged)
    }
}