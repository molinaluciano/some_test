package com.platzi.javatests.util;

import org.junit.Test;

import static com.platzi.javatests.util.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_less_than_8_letter(){
        assertEquals(WEAK, PasswordUtil.assessPassword("1234567"));
    }

    @Test
    public  void  weak_when_has_only_letters(){
        assertEquals(WEAK, PasswordUtil.assessPassword("abcdefgh"));
    }

    @Test
    public  void  medium_when_has_numbers_and_letters(){
        assertEquals(MEDIUM, PasswordUtil.assessPassword("abcd1234"));
    }

    @Test
    public  void  strong_when_has_numbers_and_letters_and_symbols(){
        assertEquals(STRONG, PasswordUtil.assessPassword("abcd1234!@"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void  password_to_long(){
        PasswordUtil.assessPassword("abcd1234#$assadasdasdadadssdasda12312312");
    }
}