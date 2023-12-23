
// ! Hirarichicle Inheritance Example

class A{
    public void aMethod(){
        System.out.println("Hello I'm from Class A");
    }
}

class B extends A{
    public void bMethod(){
        System.out.println("Hello I'm from Class B");
    }
}

public class __4HirarichicalInheritance extends A {

    public static void main(String[] args) {
        __4HirarichicalInheritance obj1 = new __4HirarichicalInheritance();
        B bObj = new B();
        bObj.bMethod();
        bObj.aMethod();
        obj1.aMethod();    

    }
    
}
