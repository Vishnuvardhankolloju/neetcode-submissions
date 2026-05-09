class Solution {
    public int coinChange(int[] coins, int amount) {
        int arr[]=new int[amount+1];
        if(amount<1){
            return 0;
        }
        
        for(int i=1;i<=amount;i++){
          arr[i]=amount+1;
        }
        arr[0]=0;
        for(int i=0;i<=amount;i++){
            for(int coin:coins){
                if(i-coin>=0)
                arr[i]=Math.min(arr[i],1+arr[i-coin]);
             
            }

            
        }
         if(arr[amount]>amount){
                return -1;
              }
        return arr[amount];
    }
}
