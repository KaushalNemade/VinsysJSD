
class Reverse {
    public static void main(String[] args) {
        
        int num = 142;
        
        while(num > 0){

            System.out.print(num%10);
            num/=10;
        }
    }
}
