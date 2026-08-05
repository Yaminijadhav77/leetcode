class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;

        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j] ) {
                nums1[k]=nums1[i];
                i--;
            }else {
                nums1[k]=nums2[j];
                j--;
            }
            k--;
        }
    }
    public static void main(String args[]){
        Solution sol=new Solution();
        int nums1[]={1,2,3,0,0,0};
        int nums2[]={2,4,5};
        int m=3;
        int n=3;
        sol.merge(nums1,m,nums2,n);
        for(int x:nums1){
            System.out.print(x + " ");
        }
    }
}