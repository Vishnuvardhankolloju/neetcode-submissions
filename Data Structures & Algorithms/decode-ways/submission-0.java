class Solution {
    public int numDecodings(String s) {
      int n=s.length();
      int arr[]=new int[n+1];
      arr[0]=1;
      if( s.charAt(0)=='0'){
        arr[1]=0;
      }
      else{
        arr[1]=1;
      }
      for(int i=2;i<=n;i++){
        int k=Integer.valueOf(s.substring(i-1,i));
        int j=Integer.valueOf(s.substring(i-2,i));
          if(k>=1){
            arr[i]+=arr[i-1];
          }
          if(j>=10 && j<=26){
            arr[i]+=arr[i-2];
          }
       }
       return arr[n];
      }  
    
}
