
class Factor {
    public static void main(String[] args) {

        int num = 245;

        for (int i = 1; i <= num; i++) { // i is loop controlling variable

            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}
