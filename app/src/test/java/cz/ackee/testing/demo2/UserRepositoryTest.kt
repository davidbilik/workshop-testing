package cz.ackee.testing.demo2

import junit.framework.Assert.assertFalse
import org.junit.Test

class UserRepositoryTest {

    @Test
    fun `user should not be logged in`() {
        val repo = UserRepository()
        assertFalse(repo.isLogged)
    }
}