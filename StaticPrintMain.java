import static printPackage.StaticPrint.*;
class NewClass1 {
    public void newMethod() {
        println("hello World , Mayur Here");
        int a = 10;
        int b = 29;
        println("Addition = " + (a + b));
    }
}
class StaticPrintMain {
    public static void main(String[] args) {
        println("hello World!");
        println("Stay Motivated!");

        int a = 20; 
        int b = 26;
        println("a = " + a);
        System.out.println(b);
        NewClass1 obj = new NewClass1();
        obj.newMethod();
    }
} 