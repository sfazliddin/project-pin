package com.projectpin.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class NumberGenerator {

    public static String generateNumber(){
//        String[] digits={"0","1","2","3","4","5","6","7","8","9"};
        ArrayList<String> digits = new ArrayList<>(Arrays.asList("0","1","2","3","4","5","6","7","8","9"));
        String number="";
        Random random=new Random();
        for(int i=0;i<4;i++){
            int randomDigit= random.nextInt(digits.size());
            number=number.concat(digits.get(randomDigit));
            digits.remove(randomDigit);

        }

        return number;
    }

}
