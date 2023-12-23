class Aclass{

    public void show(){
        System.out.println("Hello I'm show method from class A without parameter");
    }

    public void show(String name){
        System.out.println("Hello I'm show method from class A with parameter "+name);
    }
}
public class __7MethodOverriding extends Aclass{

    public void show(){
        System.out.println("Hello I'm show method from class __7MethodOverriding without parameter");
    }

    public void show(String name){
        System.out.println("Hello I'm show method from class __7MethodOverriding with parameter "+name);
    }

    public static void main(String[] args) {
       __7MethodOverriding mo = new __7MethodOverriding();
       mo.show();;
       mo.show("Yuvraj");
    }
}