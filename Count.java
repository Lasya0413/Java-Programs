class Count {
    public static void main(String[] args) {
        int num=456;
        int count=0;
        while(num !=0){

            int rem=num%10;
            count++;
            num=num/10;
        }
        System.out.print(count);
    }
}
