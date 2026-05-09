class Solution {
    public String longestPalindrome(String s) {
       if(s.length()<1){
        return s;
       }
        String st="";
        for(int i=0;i<s.length();i++){
            int start=i;
            int end=i;
            
           
            
            while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end)){
                start--;
                end++;
               
            }
          String n=s.substring(start+1,end);
            if(n.length()>st.length()){
                st=n;
            }
             start=i-1;
             end=i;
            while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end)){
                start--;
                end++;
               
            }
             n=s.substring(start+1,end);
            if(n.length()>st.length()){
                st=n;
            }
        }
        return st;
    }
}