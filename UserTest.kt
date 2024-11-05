package com

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class UserTest{
    @Test
    fun testIsAdult(){
        val user = User("John", 20)
        assertTrue(user.isAdult())
    }

    @Test
    fun testIsAdult2(){
        val user = User("Imanol", 17)
        assertFalse(user.isAdult())
    }

    @Test
    fun testIsTeenager(){
        val user = User("Jane", 15)
        assertTrue(user.isTeenager())
    }

    @Test
    fun testIsTeenager2(){
        val user = User("Imanol", 21)
        assertFalse(user.isTeenager())
    }

    @Test
    fun testIsChild(){
        val user = User("Jack", 12)
        assertTrue(user.isChild())
    }

    @Test
    fun testIsChild2(){
        val user = User("Imanol", 13)
        assertFalse(user.isChild())

    }
}