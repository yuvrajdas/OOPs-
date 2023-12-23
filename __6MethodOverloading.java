public class __6MethodOverloading {
    
    public void show(){
        System.out.println("Show function without any parameter");
    }

    public void show(String name){
        System.out.println("Show function with paramter "+name);
    }
    
    public static void main(String[] args) {
        __6MethodOverloading mo = new __6MethodOverloading();
        mo.show();
        mo.show("Yuvraj");
    }
}
