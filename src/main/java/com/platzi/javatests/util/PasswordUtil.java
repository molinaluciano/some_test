package com.platzi.javatests.util;

public class PasswordUtil {
    public enum SecurityLevel{
        WEAK, MEDIUM, STRONG
    }
    public static SecurityLevel assessPassword(String password){

        if(password.length() < 8){
            return SecurityLevel.WEAK;
        }
        if(password.matches("[a-zA-Z]+")) {
            return  SecurityLevel.WEAK;
        }

        if(password.matches("[a-zA-Z0-9]+")) {
            return  SecurityLevel.MEDIUM;
        }

        if(password.length() > 15){
            throw  new IllegalArgumentException("Password too long, max 15 character");
        }
        return SecurityLevel.STRONG;
    }
}
