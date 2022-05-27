class Solution {
    public int maxSubArray(int[] nums) {
        
    int max = nums[0] ; 
        int sofarMax =nums[0]  ;  
        
    for(int i = 1; i<nums.length; i++  )
    {
            max = Math.max(nums[i], max+nums[i]) ; 
        sofarMax = Math.max(max, sofarMax) ; 
    }
    
    return sofarMax ; 
        
    }

static int findMax(int first, int last)
{
    return first>last ? first : last ;
}

}


