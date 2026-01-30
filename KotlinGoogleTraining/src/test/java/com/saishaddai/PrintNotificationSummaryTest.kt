package com.saishaddai

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PrintNotificationSummaryTest {

    val morningNotification = 51
    val eveningNotification = 135

    @Test
    fun test_printNotificationSummary_below_99() {
        val result = printNotificationSummary(morningNotification)
        assertTrue { "You have 51 notifications.".equals(result) }
    }

    @Test
    fun test_printNotificationSummary_above_99() {
        val result = printNotificationSummary(eveningNotification)
        assertTrue { "Your phone is blowing up! You have 99+ notifications.".equals(result) }
    }

}