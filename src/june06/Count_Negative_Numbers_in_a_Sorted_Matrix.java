package june06;

public class Count_Negative_Numbers_in_a_Sorted_Matrix {
	public static void main(String[] args) {
		Solution sol = new Solution();
		 int [][]grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
		System.out.println(sol.countNegatives(grid));
	}
}

class Solution {
    public int countNegatives(int[][] grid) {
        int ans = 0, m = grid.length, n = grid[0].length;
        int r = m-1, c = 0;

        while(r>=0 && c<n)
        {
            if(grid[r][c]<0)
            {
                 r--;
                ans += (n-c);
            }else c++;
        }
        return ans;
        
    }
}