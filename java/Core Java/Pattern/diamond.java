// package Pattern;

import java.util.Scanner;

public class diamond {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of Stars: ");
        int n = sc.nextInt();
        int m = n/2;
        int num = 1;

        for(int i=1;i<=n;i++){

            for(int k = 1; k<=m; k++){
                System.out.print(" ");
                
            }
        
            for(int j=1; j<=num; j++){
                System.out.print("*");
            }

            System.out.println();
            if(i<=(n/2)){
                m--;
                num+=2;
            } else {
                m++;
                num-=2;
            }
        }
        System.out.println();


        sc.close();
    }
}
