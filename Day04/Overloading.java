package Day04;

public class Overloading {
    public static void main(String[] args) {
        fun("hello");
        fun(20);
    }

    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
