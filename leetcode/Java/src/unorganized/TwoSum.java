package unorganized;

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> returnM  = new HashMap<>();
        //create a hashmap to store the result

        for(int i = 0; i <= nums.length; i++) {
            //use for loop to traverse through every item inside the
            //given array

            int eachValue = nums[i]; // select each value inside the array
            int difference = target - eachValue; // find what else value needed

            if(returnM.containsKey(difference)) { //condition to check if the
                // already reviewed value from array is the solution

                return new int[] {returnM.get(difference), i};

                //if the previous reviewed value contain solution
                //copy the index into the new array as the answer

            }

            returnM.put(eachValue, i);
            //if no matching, store it waiting for future value match
            // put method at the end because you always want to
            // compare with the values before but not yourself
        }

        return null; // if no possible solution, return nothing

    }
}