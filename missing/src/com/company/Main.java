package com.company;

import com.company.fistproblem.Missing;
import com.company.secondproblem.Reverse;

public class Main {
    public static void main(String[] args) {
        int[] testNums = {3, 5, 4, 1};
        String testString = "Lorem at";

        Missing missing = new Missing();
        int missingNum = missing.getMissingNumber(testNums);

        System.out.println(missingNum);

        Reverse reverseInstance = new Reverse();
        String reversedString = reverseInstance.reverseInGroupsOfFour(testString);
        System.out.println(reversedString);
    }


}
