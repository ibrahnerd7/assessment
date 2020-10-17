package com.company;

public class Main {
    public static void main(String[] args) {
        int [] myNums={3,5,4,1};

        Missing missing=new Missing();
        int missingNum= missing.getMissingNumber(myNums);

        System.out.println(missingNum);
    }


}
