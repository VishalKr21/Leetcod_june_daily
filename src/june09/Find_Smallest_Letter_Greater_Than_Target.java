package june09;

public class Find_Smallest_Letter_Greater_Than_Target {
	public static void main(String[] args) {
		
		//Answer in class Solution.
	}
}
class Solution {
    public char nextGreatestLetter(char[] a, char t) {
     int i=0,j=a.length-1;
     char ans = a[0];
    
    while(i<=j)
    {
        int m = (i+j)/2;
        if(a[m]-'0'>t-'0')
        {
            ans = a[m];
            j = m-1;
        }else
            i = m+1;
    }

     return ans;
    }
}