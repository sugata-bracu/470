package com.example.demo.Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserdtlsTest {

    Userdtls user = new Userdtls(999, "unittest@gmail.com", "unit test", 00000, "testing", "22/22/22", "unittesting", 908070, "florida tesing", 900, "testing");


    @Test
    void getAge() {
        assertEquals(900,user.getAge());
    }

    @Test
    void setId() {
    }

    @Test
    void getPassword() {
        assertEquals("unittesting", user.getPassword());
    }

    @Test
    void setPassword() {
    }

    @Test
    void setPhone() {
    }

    @Test
    void testToString() {
    }
}