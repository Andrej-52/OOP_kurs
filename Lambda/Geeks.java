package Lambda;
import java.util.ArrayList;

// Java program to demonstrates Lambda expression with zero parameter
@FunctionalInterface
interface ZeroParameter {
    void display();
}

class Test0 {
    public static void main(String[] args)
    {
        // Lambda expression with zero parameters
        ZeroParameter zeroParamLambda = ()
            -> System.out.println(
                "This is a zero-parameter lambda expression!");

        // Invoke the method
        zeroParamLambda.display();
    }
}



class Test1 {

    public static void main(String args[])
    {
        // Creating an ArrayList with elements
        // {1, 2, 3, 4}
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        // Using lambda expression to print all elements of al
        System.out.println("Elements of the ArrayList: ");
        al.forEach(element -> System.out.println(element));

        // Using lambda expression to print even elements
        // of al
        System.out.println(
            "Even elements of the ArrayList: ");
        al.forEach(n -> {
            if (n % 2 == 0)
                System.out.println(n);
        });
    }
}

@FunctionalInterface
interface Functional {
    int operation(int a, int b);
}

class Test2 {

    public static void main(String[] args) {
        
        // Using lambda expressions to define the operations
        Functional add = (a, b) -> a + b;
        Functional multiply = (a, b) -> a * b;
        Functional skriv = (a, b) -> 5;

        // Using the operations
        System.out.println(add.operation(6, 3));  
        System.out.println(multiply.operation(4, 5));  
        System.out.println(skriv.operation(4, 5));  
    }
}