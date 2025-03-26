
class Prime {
    public static void main(String[] args) {

        int num = 25;
        int cnt = 0;
        for (int i = 1; i < num; i++) { // i is loop controlling variable

            if (num % i == 0)
                cnt++;
        }

        if(cnt > 1)
            System.out.println(num + " is not a Prime Number.");
        else 
            System.out.println(num + " is a Prime Number.");
    }
}
