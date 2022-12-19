package com.example.demo.Config;

import org.junit.jupiter.api.Test;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static org.junit.jupiter.api.Assertions.*;

class ConfigTest {

    @Test
    void passwordEncoder() {
        BCryptPasswordEncoder encoder =  new BCryptPasswordEncoder();
        String randompass = "deyuaduada23232";
        String encoder1 = encoder.encode(randompass);
        System.out.println(encoder1);
        if(encoder.matches(randompass, encoder1)){
            System.out.printf("true");
        }
        else {
            System.err.println("false");
        }
    }

    @Test
    void configure(){

    }
    }