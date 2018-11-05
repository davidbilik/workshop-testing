package cz.ackee.testing.demo3

import cz.ackee.testing.demo1.Bundlerer
import junit.framework.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

/**
 * Tests for [Bundlerer]
 */
@RunWith(RobolectricTestRunner::class)
class BundlererTest {

    @Test
    fun `should put string`() {
        val bundlerer = Bundlerer()
        bundlerer.putString("foo", "bar")
        assertEquals("bar", bundlerer.getString("foo"))
    }
}