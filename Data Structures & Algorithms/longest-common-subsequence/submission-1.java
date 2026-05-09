class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
      int m=text1.length();
      int n=text2.length();
      int grid[][]=new int[m+1][n+1];
       for(int i=1;i<=text1.length();i++){
        for(int j=1;j<=text2.length();j++){
              
            if(text1.charAt(i-1)==text2.charAt(j-1)){
               grid[i][j]= 1+grid[i-1][j-1];
             } 
             else{
             grid[i][j]=Math.max(grid[i-1][j],grid[i][j-1]);
             }
             }
       } 
         return grid[m][n];
    }
}
