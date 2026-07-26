class Solution {
    public List<Integer> findMissingElements(int[] nums) {
         Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        int n=nums.length+1;
        int exactValue=n*(n+1)/2;
        int actualvalue=0;

        int max=nums[0];
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
        if(nums[i]>max){
            max=nums[i];
        }
        if(nums[i]<min){
            min=nums[i];
        }
        }

        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        boolean isCheck=false;
        for(int i=min;i<max;i++){
           if(!set.contains(i)){
                list.add(i);
           }
    }
    return list;
    }
    public static void main(String args[]){
       
        Solution sol=new Solution();
        int nums[]={1,4,2,5};
        List<Integer> missing=sol.findMissingElements(nums);
        System.out.println(missing); 
    }
}