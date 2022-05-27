public class Solution {
    public void DuplicateZeros(int[] arr) {
        
        for(int i = 0; i < arr.Length; i++)
        {
            if(arr[i] == 0&& i+1 < arr.Length ) 
            {
                shift(i+1,arr) ;
                arr[i+1] = arr[i] ;
                    i++;
            }
        }
    }
    private  void shift(int emptyIndex, int [] array)
    {
        for(int i = array.Length-1 ; i>= emptyIndex ; i--)
        {
            array [i] = array[i-1] ;
        }
    }
}