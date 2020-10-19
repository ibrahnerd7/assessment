package com.company.fistproblem;

import java.util.Arrays;

public class Missing {
    public  int getMissingNumber(int[] nums){
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




