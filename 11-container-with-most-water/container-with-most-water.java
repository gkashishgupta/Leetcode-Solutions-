class Solution {
    public int maxArea(int[] nums) {
        int i=0,j=nums.length-1;
        int area=0,areaCal=0;
       
        while(i<j){
          int min=Math.min(nums[i],nums[j]);
          areaCal=(min*(j-i));
          if(areaCal>=area){
            area=areaCal;
            
            }
            if(min==nums[i]){
            i++;
         }
            else{
            j-- ;
          }
        }
        return area;
    }
}