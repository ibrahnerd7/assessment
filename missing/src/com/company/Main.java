package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] myNums={3,5,4,1};
	    System.out.print(getMissingNumber(myNums));
    }

    private static int getMissingNumber(int[] nums){
        int missingNum=0;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]+1 !=nums[i+1]){
                missingNum=nums[i]+1;
                break;
            }
        }
        return missingNum;
    }
}
