package com.projectpin.service;

import java.util.HashSet;
import java.util.Set;

public class PinValidator {
        public static boolean isValid(String guess){
            //has to be a number
            //number has to be 4 digits

            if(!guess.matches("\\d{4}")){
                return false;
            }
            //all digits must be unique
            Set<Character> uniqueDigits=new HashSet<>();
            for (char c:guess.toCharArray()) {
                if(!uniqueDigits.add(c)){
                    return false;
                }
            }

            return true;
        }
}
