class Solution {

    public void reverseString(char[] reversableString) {
        int i = 0;
        int j = reversableString.length - 1;
         
            while (i< j) {
                char temp = reversableString[i];
                reversableString[i] = reversableString[j];
                reversableString[j] = temp;
                i++;
                j--;
            }
         
    }
}
