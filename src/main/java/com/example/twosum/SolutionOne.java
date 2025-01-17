package com.example.twosum;

public class SolutionOne {

    public int[] twoSum(int[] nums, int target) {

        int num ;
        int[] array = new int[0];
        for (int i = 0; i < nums.length; i++) {

            num = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {

                if (num == nums[j]){
                    array = new int[]{i,j};
                    break;
                }
            }
        }
        return array;
    }
}
