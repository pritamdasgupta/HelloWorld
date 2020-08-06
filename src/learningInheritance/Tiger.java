package learningInheritance;

public class Tiger extends Animals{

    //Method Overriding

    public static void eat(){
        System.out.println("Tiger is eating");
    }

    public void showInfo(){
        System.out.println("Age of the tiger is "+ age);
    }
}
