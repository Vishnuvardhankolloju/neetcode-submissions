class Solution {
    public int longestConsecutive(int[] nums) {
  HashMap<Integer,Boolean> map=new HashMap<>();
   int totallength=0;
   for(int num:nums){
    map.put(num,Boolean.FALSE);
    
   }
    
   for(int num:nums){
   int cur=1;
   int next=num+1;
  while(map.containsKey(next) && map.get(next)==false){
    cur++;
   
    map.put(num,Boolean.TRUE);
  next++;
   }
   int prev=num-1;
  while(map.containsKey(prev) && !map.get(prev)){
    cur++;
   
    map.put(num,Boolean.TRUE);
     prev--;
  }
  totallength=Math.max(totallength,cur);
    }
   
  return totallength;
    }
}
