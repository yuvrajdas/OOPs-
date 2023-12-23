public class __2InheritanceAnimal {

    public void eat(){
        System.out.println("dong");
    }
}
class Dog extends __2InheritanceAnimal{

    public void sense(){
        System.out.println("Dog is sensable");
    }
    
    public static void main(String[] args) {
        /*
         * Inheritance : Inheritance is a process in which a child class aquires the property and behaviour of its parent class known as inheritance.
         * 
         * Type of Inheritance in Java
         * 1. Single Level Inheritance
         * 2. Multilevel Inheritance
         * 3. Hirarichical Inheritance.
         * 
         * Advantage : Code Reusability.
         * Disadvantage : Tightly Coupled thats why if we change in parent class it affect to other child classes.
        */
        
        Dog d = new Dog();
        d.eat();
        d.sense();
    }
}