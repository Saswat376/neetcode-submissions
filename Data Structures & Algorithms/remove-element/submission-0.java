class Solution {
    public int removeElement(int[] nums, int val) {

        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                continue;
            }else{
                nums[count]=nums[i];
                count=count+1;
            }
        }
        return count;

    }
}