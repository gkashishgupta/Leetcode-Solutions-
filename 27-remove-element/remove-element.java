class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int [] expectnums=new int[n];
        Arrays.sort(nums);
     int index=0;
            for(int i=0;i<n;i++){
                 if(nums[i]!=val){
                    expectnums[index]+=nums[i];
                    index++;

                 }     
                }
                for(int i=0;i<n;i++){
                    nums[i]=expectnums[i];
                }
                return index;
    }
}