package com.saishaddai

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TicketPriceTest {
    val child = 5
    val adult = 28
    val senior = 87
    val unreal  = 99

    @Test
    fun test_ticketPriceChild() {
        val resultChild = ticketPrice(child, false)
        assertEquals(15, resultChild)
    }

    @Test
    fun test_ticketPriceChildMonday() {
        val resultChild = ticketPrice(child, true)
        assertEquals(15, resultChild)
    }

    @Test
    fun test_ticketPriceAdult() {
        val resultAdult = ticketPrice(adult, false)
        assertEquals(30, resultAdult)
    }

    @Test
    fun test_ticketPriceAdultMonday() {
        val resultAdult = ticketPrice(adult, true)
        assertEquals(25, resultAdult)
    }

    @Test
    fun test_ticketPriceSenior() {
        val resultSenior = ticketPrice(senior, false)
        assertEquals(20, resultSenior)
    }

    @Test
    fun test_ticketPriceSeniorMonday() {
        val resultSenior = ticketPrice(senior, true)
        assertEquals(20, resultSenior)
    }

}