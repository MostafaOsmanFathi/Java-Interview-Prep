class Solution {
    public int findNumbers(int[] nums) {
       int res=0;
       for(int num: nums){
           if (((int)Math.log10(num))%2==1)
               ++res;
       }
       return res;
   }
}