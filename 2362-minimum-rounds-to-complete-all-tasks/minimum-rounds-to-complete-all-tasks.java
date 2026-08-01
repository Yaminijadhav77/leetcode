class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<tasks.length;i++){
        int ch=tasks[i];
        if(map.containsKey(ch)){
            map.put(ch,map.get(ch)+1);
        }else{
        map.put(ch,1);
        }
    }
    int round=0;
    for(Map.Entry<Integer,Integer>entry:map.entrySet()){
     
        int count=entry.getValue();
            if(count==1){
                return -1;
           }  
            if(count % 3==0) {
               round=round + count/3;
            }
             else if(count % 3==2){
                 round=round+(count/3)+1;
            }
            else {
                 round=round+(count/3)+1;
            }
        }
        return round;
    }
    

    /*public static void main(String args[]){
        Solution sol=new Solution();
        int tasks[]={2,2,3,3,2,4,4,4,4};
        int ans=sol.minimumRounds(tasks);
        
    }*/

}