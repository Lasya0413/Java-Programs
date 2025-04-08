class Main {
    public static void main(String[] args) {
        int[] nums= {1,2,3,4,5,6,7,8};
        int ele=3;
        int index=-1;
        for(int i=0;i<nums.length;i++){
           if(ele==nums[i]) 
               index=i;
        }
        System.out.println(index==-1 ? "element not found" : ele+ "found at"+index);
    }
}
