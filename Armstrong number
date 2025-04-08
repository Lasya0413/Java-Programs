class Main {
    public static void main(String[] args) {
        int num=153;
        int duplicate=num;
        int sum=0;
        int digitCount= countDigits(num);
        while(duplicate!=0){
            int rem = duplicate%10;
            sum=sum+(int)Math.pow(rem,digitCount);
            duplicate=duplicate/10;
        }
        System.out.println(num == sum ? "amstrong":"not an amstrong");
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
