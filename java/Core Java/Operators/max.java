import java.util.*;

class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1 >= num2 && num1 >= num3) {
            System.out.println("Greater Number " + num1);
        } else if(num2 >= num1 && num2 >= num3) {
            System.out.println("Greater Number " + num2);
        } else if(num3 >= num1 && num3 >= num2){
            System.out.println("Greater Number " + num3);
        } 

    }
}