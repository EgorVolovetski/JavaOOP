public class Constructors {
    private int a, b;
    void getter(){
        System.out.println("First number: " + a + "\nSecond number: " + b + "\n");
    }
    Constructors(){
        a = 0;
        b = 0;
    }
    Constructors(int num){
        a = num;
        b = 0;
    }
    Constructors(int num1, int num2){
        a = num1;
        b = num2;
    }

}
