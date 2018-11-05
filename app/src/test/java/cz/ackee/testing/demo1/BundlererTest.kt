package cz.ackee.testing.demo1

import junit.framework.Assert.assertEquals
import org.junit.Test

/**
 * Tests for [Bundlerer]
 */
class BundlererTest {

    @Test
    fun `should put string`() {
        val bundlerer = Bundlerer()
        bundlerer.putString("foo", "bar")
        assertEquals("bar", bundlerer.getString("foo"))
    }
}