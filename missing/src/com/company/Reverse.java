package com.company;

public class Reverse {
    public String reverseInGroupsOfFour(String string) {
        String reversed = "";
        String regex = "(?<=\\G.{4})";
        String[] stringGroups = string.split(regex);

        for (String stringSubArray : stringGroups) {
           reversed= reversed.concat(new StringBuilder(stringSubArray).reverse().toString());
        }

        return reversed;
    }
}
