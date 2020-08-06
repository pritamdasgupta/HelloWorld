package Interface;

public class Person implements Info{


    String name;
    String profession;

//    public Person(String name){
//
//        this.name = name;
//    }

    public Person(String profession)
    {
        this.profession = profession;
    }

    public static void sayHello(){

        System.out.println("Hello");
    }

    @Override
    public void showInfo() {
        System.out.println("the name of the person is "+ this.name);
    }

    @Override
    public void print() {
        System.out.println("the profession is " + profession);
    }

}
