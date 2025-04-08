class Main {
    public static void main(String[] args) {
        int[] nums= {4,9,6,20,7,3};
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
           if(min>nums[i]) min=nums[i];
        }
        System.out.println(min);
    }
}
