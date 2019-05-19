package com.thoughtworks.tdd;

public class FizzBuzz {
    private final String FIZZ = "Fizz";
    private final String BUZZ = "Buzz";
    private final String WHIZZ = "Whizz";

    public String beenCalled(int number) {
        if (number % 3 == 0) {
            if (number % 5 == 0) {
                if (number % 7 == 0) {
                    return FIZZ + BUZZ + WHIZZ;
                }
                else {
                    return FIZZ + BUZZ;
                }
            } else {
                if (number % 7 == 0) {
                    return FIZZ + WHIZZ;
                } else {
                    return FIZZ;
                }
            }
        } else if (number % 5 == 0) {
            if (number % 7 == 0) {
                return BUZZ + WHIZZ;
            } else {
                return BUZZ;
            }
        } else {
            if(number % 7 == 0) {
                return WHIZZ;
            } else {
                return String.valueOf(number);
            }
        }
    }
}
