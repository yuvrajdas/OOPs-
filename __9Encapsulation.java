public class __9Encapsulation {
    private int emp_id;

    public int getEmployeId(){
        return emp_id;
    }

    public void setEmployeeId(int id){
        this.emp_id = id;
    }
    public static void main(String[] args) {
        /*
         * Encapsulation : Encapsulation is mechanism of wrapping the data into a single unit.
         * Steps to achieve Encapsulation 
         * 1. Declare the variable of class as private.
         * 2. Provide public getter and setter method to view and modify the vairables value.
         * 
         */

        __9Encapsulation enc = new __9Encapsulation();
        enc.setEmployeeId(6729);
        int res = enc.getEmployeId();
        System.out.println(res);
    }
}
