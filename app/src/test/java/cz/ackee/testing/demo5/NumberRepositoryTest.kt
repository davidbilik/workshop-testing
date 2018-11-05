package cz.ackee.testing.demo5

import cz.ackee.testing.util.TestSchedulerRule
import org.junit.Rule
import org.junit.Test

class NumberRepositoryTest {

    @get:Rule var rule = TestSchedulerRule()

    @Test
    fun `should return correct numbers`() {
        val repo = NumberRepository()
        val test = repo.getNumbers(5)
                .test()
//        test.awaitTerminalEvent()
        test
                .assertValues(0, 1, 2, 3, 4, 5)
    }

    @Test
    fun `should return correct squared numbers`() {
        val repo = NumberRepository()
        val test = repo.getNumbersSquared(5)
                .test()
//        test.awaitTerminalEvent()
        println(test.values())
        test
                .assertValues(0, 1, 4, 9, 16, 25)
    }
}