class A{

    public void aMethod(){
        System.out.println("Hello I'm from class A");
    }
}

class B extends A{

    public void bMethod(){
        System.out.println("Hello I'm from class B");
    }
}

public class __3MultiLevelInheritance extends B {
    
    public static void main(String[] args) {
        __3MultiLevelInheritance mli = new __3MultiLevelInheritance();
        mli.bMethod();
        mli.aMethod();
    }
}
