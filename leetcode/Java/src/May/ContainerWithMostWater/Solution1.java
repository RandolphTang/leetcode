package May.ContainerWithMostWater;

public class Solution1 {
    public int maxArea(int[] height) {

        int max = 0;
        int i = 0, j = height.length - 1;

        while(i < j){
            int min = Math.min(height[j], height[i]);
            max = Math.max(max, min * (j - i));
    //skip over same or less value compared to min, since they don't help incrementing values;
            while(i < j && min >= height[j]) j--;
            while(i < j && min >= height[i]) i++;
        }

        return max;
    }
}
