package understandingStaticKeyword;

public class understandingStaticKeyword {
    public static void main(String [] Args) {
        Employee employee1 = new Employee("pritam", "QA");
        employee1.showEmployeeInfo();
        Employee.company = "Google";
        Employee.getCompanyName();
    }

}



class Employee{
    String name;
    String department;
    static String company;

    Employee(String name , String department){
        this.name = name;
        this.department = department;
    }

    public static void getCompanyName(){
        System.out.println("The name of my company is " + company);
    }

    public void showEmployeeInfo(){
        System.out.println("My name is " + name + " and my department is " + department);
    }
}