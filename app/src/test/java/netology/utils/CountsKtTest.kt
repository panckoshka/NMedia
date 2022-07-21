package netology.utils

import org.junit.Assert
import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test

internal class CountsKtTest {

    @Test
    fun countFinish() {
        Assert.assertEquals("999", countFinish(999))
        Assert.assertEquals("2.1K", countFinish(2_101))
        Assert.assertEquals("1K", countFinish(1_001))
        Assert.assertEquals("48K", countFinish(48_245))
        Assert.assertEquals("2.2M", countFinish(2_200_100))
        Assert.assertEquals("1M", countFinish(1_000_999))
    }
}