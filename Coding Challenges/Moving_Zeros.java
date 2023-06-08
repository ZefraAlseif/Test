class moveZeroes{
    public static void main(String[] args) {
        
    }
}

class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;
        int index = 0;
        for (int i : nums){
            if (i != 0){
                nums[index] = i;
                index++;
                count ++;
            }
        }
        for (int i = count;i<nums.length;i++){
            nums[i] = 0;
        }
    }
}