interface Sound{  
    static int a = 10;

    int b = 20;

    default void sound() {
        System.out.println("Default Sound");
    }

    static void ref(){
        System.out.println("Static method");
    }
}

public class Main implements Sound{

    public static void ref(){
        System.out.println("Dynamic");
    }
    public static void main(String[] args) {
        
        Main mn = new Main();
        mn.sound();
        Sound.ref();

        System.out.println(Sound.b);

    }
}