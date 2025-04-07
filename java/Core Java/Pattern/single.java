// package Pattern;
import java.util.*;

public class single {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of Stars: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.print("*");
        }
        System.out.println();


        sc.close();
    }
}  
