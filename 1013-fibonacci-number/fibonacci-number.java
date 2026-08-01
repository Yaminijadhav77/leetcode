class Solution {
    public int fib(int n) {
      
        if(n==0){
            return 0;
        }
        int arr[]=new int[n+1];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<arr.length;i++) {
             arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
    public static void main(String args[]){
        Solution sol=new Solution();
        int n=5;
        int ans=sol.fib(n);
        System.out.println(ans);
}
}