class Solution {
    public int removeElement(int[] nums, int val) {
 
        int  removeFlag  = 10*800000 ;  
        int len = 0 ; 
        for(int i =0; i<nums.length ; i++) 
        {
            if(nums[i] == val)
            {
                nums[i] = removeFlag ; 
            } 
        }
        
        for (int i = 0; i < nums.length - 1; i++){
            for (int j = 0; j < nums.length - i - 1; j++)
                if (nums[j] > nums[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
        }
        
        
        
    return  Arrays.stream(nums).filter(x -> x !=removeFlag ).toArray().length ;
    }
}