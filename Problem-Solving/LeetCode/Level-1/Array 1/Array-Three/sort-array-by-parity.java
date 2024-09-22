import java.util.*;
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> e = new ArrayList<>();
        ArrayList<Integer> o = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                e.add(nums[i]);
            } else
                o.add(nums[i]);
        }
        int con = 0;
        for (int x : e) {
            nums[con++] = x;
        }
        for (int x : o) {
            nums[con++] = x;
        }
        return nums;
    }
}