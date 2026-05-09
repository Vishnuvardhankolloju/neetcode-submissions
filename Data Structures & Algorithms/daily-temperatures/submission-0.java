class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int a[]=new int[n];
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<n;i++){
         while(!s.isEmpty() && temperatures[i]>temperatures[s.peek()]){
            int idex=s.pop();
            a[idex]=i-idex;
         }
         s.push(i);
        }
        return a;
    }
}
