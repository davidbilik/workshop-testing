package cz.ackee.testing.demo3

import com.nhaarman.mockitokotlin2.times
import com.nhaarman.mockitokotlin2.verify
import cz.ackee.testing.demo2.FirebaseAuthProxy
import cz.ackee.testing.demo2.UserRepositoryFixed
import junit.framework.TestCase.assertFalse
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class UserRepositoryFixedTest {
    @Mock
    lateinit var firebase: FirebaseAuthProxy

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
    }

    @Test
    fun `user should not be logged in`() {
        Mockito.`when`(firebase.getUser()).thenReturn(null)
//        whenever(firebase.getUser()).thenReturn(null)
        val repo = UserRepositoryFixed(firebase)
        assertFalse(repo.isLogged)
        verify(firebase, times(1)).getUser()
    }
}