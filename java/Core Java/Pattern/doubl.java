package Pattern;

import java.util.Scanner;

public class doubl {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of Stars: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1; j<=n; j++){
            System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();


        sc.close();
    }
}
