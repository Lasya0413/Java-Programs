class Count {
    public static void main(String[] args) {
        int num=456;
        int result=countDigits(num);
        System.out.println(result);
    }
    
    public static int countDigits(int num){
        int count=0;
        while(num!=0){
            count++;
            num=num/10;
        }
        return count;
    }
}
