class Multi {
    public static void main(String[] args) {
        int x = 100000;
        int y = 100000;
        // System.out.println(((Object)(x+y)).getClass().getName());
        long z = (long)x*y;
        System.out.println(z);
    }
}