abstract class A{
    // using annonymous class to extend this class fr single use
    abstract void print();
    abstract void print2();
}


@FunctionalInterface
interface MyFunctionalInterface {
    void execute();
    // A functional interface in Java is an interface that has exactly one abstract method. These interfaces are also known as Single Abstract Method (SAM) interfaces. They can have multiple default or static methods, but only one abstract method. Functional interfaces are used extensively in lambda expressions and method references in Java.
}

@FunctionalInterface
interface MyFunctionalInterface2 {
    int add(int a, int b);
}


public class lambda_annonimus_class {
    public static void main(String[] args) {
        // A obj = new A(); Cannot create a INSTANCE OF STATIC CLASS

        A obj = new A(){
            void print(){
                System.out.println("Hello World 1");
            }
            void print2(){
                System.out.println("Hello World 2");
            }
        };
        obj.print();

        MyFunctionalInterface obj2 = () ->{
            System.out.println("Hello World 3" );
        };
        obj2.execute();

        //further shorten the code

        MyFunctionalInterface obj3 = () -> System.out.println("Hello World 4" );
        obj3.execute();

        //code with return
        MyFunctionalInterface2 obj4 = (i,j) -> {//no need to mention the datatype as it is already present in interface
            return i+j;
        };
        System.out.println(obj4.add(5,7));

        //further shorten the code
        //code with return
        MyFunctionalInterface2 obj5 = (i,j) ->  i+j;  //Single line fn no need to write return
        System.out.println(obj5.add(10,20));
    }
}
