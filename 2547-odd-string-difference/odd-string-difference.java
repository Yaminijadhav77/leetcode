class Solution {
    public String oddString(String[] words) {
        HashMap<String,Integer> map=new HashMap<>();
         for(int i=0;i<words.length;i++){
            String key="";
              for(int j=0;j<words[i].length()-1;j++){
              int diff=words[i].charAt(j+1)-words[i].charAt(j);
                     key=key+diff+"#";
              }
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }else {
            map.put(key,1);
         } 
         } 
         for(int i=0;i<words.length;i++){
            String key="";
            for(int j=0;j<words[i].length()-1;j++) {
                int diff=words[i].charAt(j+1)-words[i].charAt(j);
                key=key+diff+"#";
            }
            if(map.get(key)==1){
                return words[i];
            }
         } 
         return "";
    }
    public static void main(String args[]){
        Solution sol=new Solution();
        String words[]={"abc","bob","ccc","ddd"};
        String ans=sol.oddString(words);
        System.out.println(ans);
        }
    }
