public class Main {
    public static void main(String[] args) {

        Test t;
        t.i = 12;
        t.i++;
        System.out.println(t.i);
        System.out.println("Hello world!");
    }
}

class Test{
    int i = 0 ;
}