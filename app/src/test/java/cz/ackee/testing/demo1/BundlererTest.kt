package cz.ackee.testing.demo1

import cz.ackee.testing.demo1.Bundlerer
import junit.framework.Assert.assertEquals
import org.junit.Test

/**
 * TODO add class description
 */
class BundlererTest {

    @Test
    fun `should put string`() {
        val bundlerer = Bundlerer()
        bundlerer.putString("foo", "bar")
        assertEquals("bar", bundlerer.getString("foo"))
    }
}