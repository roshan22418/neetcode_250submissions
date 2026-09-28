class Solution {
    public void reverseString(char[] s) {
        int length = s.length;
        int low = 0;
        int high = length-1;
        while(low<high){
            char temp = s[low];
            s[low] = s[high];
            s[high] = temp;
            low++;
            high--;
        }
        
    }
}