class Solution {
    public int maximumWealth(int[][] accounts) {
        int mx=0;
        for (int[] account : accounts) {
            int sum=0;
            for (int i : account) {
                sum+=i;
            }
            mx=Math.max(sum,mx);
        }
        
        return mx;
    }
}