package com.java.practice.algorithm.conversions;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * 十进制转换为任意进制
 */
class DecimalToAnyBaseTests {
    /**
     * This method produces a String value of any given input decimal in any base
     *
     * @param inp Decimal of which we need the value in base in String format
     * @return string format of the converted value in the given base
     */

    static String convertToAnyBase(int inp, int base) {
        ArrayList<Character> charArr = new ArrayList<>();

        while (inp > 0) {
            charArr.add(reVal(inp % base));
            inp /= base;
        }

        StringBuilder str = new StringBuilder(charArr.size());

        for (Character ch : charArr) {
            str.append(ch);
        }

        return str.reverse().toString();
    }

    /**
     * This method produces character value of the input integer and returns it
     *
     * @param num integer of which we need the character value of
     * @return character value of input integer
     */

    static char reVal(int num) {
        if (num >= 0 && num <= 9) {
            return (char) (num + '0');
        } else {
            return (char) (num - 10 + 'A');
        }
    }

    @Test
    void test() {
        int decInput = Integer.parseInt("1998");
        System.out.println();
        int base = Integer.parseInt("3");

        System.out.println("Decimal Input" + " is: " + decInput);
        System.out.println("Value of " + decInput + " in base " + base + " is: " + convertToAnyBase(decInput, base));

    }
}
