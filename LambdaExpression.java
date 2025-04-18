@FunctionalInterface
interface A {
    void show();
}

public class LambdaExpression {
   public static void main(String[] asrs){
    A obj = () -> System.out.println("I am in A");
       obj.show();
   }
}
