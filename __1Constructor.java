public class __1Constructor{

    public __1Constructor(){
        System.out.println("Non-Parameterized Constructor");
    }
    
    public __1Constructor(String val){
        System.out.println("Parameterized Constructor "+val);
    }

    public static void main(String[] args) {
        /*
         * Constructor : Constructor is similer to the method but the condtion is the class and and the function name should be same then it is known as Constructor.
         * 1. Constructor does not have return type not even void.
         * 2. Access modifier that can be applied for constructor - public, private, protected and default.
         * 3. Constructor function do not need to call it automatically gets executed when the object is created.
         * 
         * Types of Constructors : 
         * 1. Default Constructor : When we do not create any constructor in our porgram Compiler automatically create a constructor with no parameter.
         * 2. Parameterized Contructor : When we create a constructor manually in our program and pass some value to it, known as Parameterized Constructor.
         * 3. Non-Parameterized Constructor : When we create a constructor manually in our program and do not pass any value to it, known as Non-Parameterized Constructor.
         */
        __1Constructor npcObj = new __1Constructor();
        __1Constructor pcObj = new __1Constructor("Value");
    }
}