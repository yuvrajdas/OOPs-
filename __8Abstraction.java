abstract class Vehicle{
    int noOfTyre;
    abstract void start();
}

 class Bike extends Vehicle{

  void start(){
    System.out.println("start with key and start with kick");
  }
    
}

public class __8Abstraction extends Vehicle{

    void start(){
        System.out.println("Start with key");
    }
    public static void main(String[] args) {
        /*
         * Abstraction : Hiding the inner implimentation and showing only functionality/service.
         * 
         * Abstract class can have concrete method as well as abstract method.
         *  There is conditions for abstract class
         * 1. if a class having abstract method then the class should be abstract class
         * 2. if a class is abstract class then it is not mandatory the all method would be abstract inside that class.
         * 3. if any normal class extends the abstract class then it is mandatory to create the body of all method which is declared in abstract class;
         * 4. We cannot create object of abstract class.
         */

        __8Abstraction a = new __8Abstraction();
        Bike b = new Bike();
        b.start();
        a.start();

    }
}
