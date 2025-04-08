class sample {
    public static void main(String[] args) {
        int num=123456;
        int sum=0;
        System.out.println("count of the digits:"+countDigits(num));
        System.out.println("sum of the digits:" +sumOfDigits(num));
    }
    
    public static int countDigits(int num){
        int count=0;
        while(num!=0){
            count++;
            num=num/10;
        }
        return count;
    }
    
    public static int sumOfDigits(int num){
        int sum=0;
        while(num!=0){
            int rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        return sum;
    }
}
