class First{
    private int ascii;
    private char ch;
    void setter(char c){
        ascii = c;
        ch = c;
    }
    void getter(){
        System.out.println("The ASCII code of " + ch + " is " + ascii);
    }
}

class Second{
    private int num1, num2;
    void setter(int n1, int n2){
        num1 = n1;
        num2 = n2;
    }
    void getter(){
        System.out.println("\nnum1: " + num1 + "\nnum2: " + num2);
    }
}

class Third{
    private char ch1, ch2;
    void setter(char a, char b){
        ch1 = a;
        ch2 = b;
    }
    void setter (char a){
        ch1 = a;
        ch2 = '0';
    }
    void setter(){
        setter('0','0');
    }

    void getter(){
        System.out.println("\nFirst char is " + ch1 + "\nSecond char is " + ch2);
    }
}


public class Main {
    public static void main(String[] args) {
        First f = new First();
        f.setter('K');
        f.getter();

        Second s = new Second();
        s.setter(2, 4);
        s.getter();

        Third t = new Third();
        t.setter('A', 'B');
        t.getter();
        t.setter('A');
        t.getter();
        t.setter();
        t.getter();

        System.out.println("\n");

        Constructors a = new Constructors();
        Constructors b = new Constructors(1);
        Constructors c = new Constructors(1,2);
        a.getter();
        b.getter();
        c.getter();
    }
}