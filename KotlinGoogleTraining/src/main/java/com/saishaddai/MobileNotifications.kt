package com.saishaddai

/**
 * Complete the printNotificationSummary() function so that the program prints these lines:
 *
 *
 * You have 51 notifications.
 * Your phone is blowing up! You have 99+ notifications.
 */


fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}


fun printNotificationSummary(numberOfMessages: Int) {
    when {
        numberOfMessages <= 99 -> { println("You have $numberOfMessages notifications.") }
        else -> { println("Your phone is blowing up! You have 99+ notifications.") }
    }
}
