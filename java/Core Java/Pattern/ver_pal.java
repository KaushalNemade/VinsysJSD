class ValPal {
    public static void main(String[] args) {
        int n = 5;
        int temp = (n / 2) + 1;
        int sp = 1;

        int inner = n + 2;

        for (int i = 0; i < n; i++) {

            // for(int j =0; j<temp; j++){
            // System.out.print("*");
            // }

            // for(int k = 0; k<sp; k++) {
            // System.out.print(" ");
            // }

            // for(int j =0; j<temp; j++){
            // System.out.print("*");
            // }

            for (int j = 1; j <= n + 2; j++) {

                if (j > temp && j <= (inner - temp)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            if (i < (n / 2)) {
                temp--;
                sp += 2;
            } else {
                temp++;
                sp -= 2;
            }
            System.out.println("");
        }

    }
}
