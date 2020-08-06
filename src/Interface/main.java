package Interface;

public class main {
    public static void main(String [] Args){

//        Animal animal = new Animal(4);
//        Person person = new Person("Rebecca");
//
//        animal.eat();
//        person.sayHello();
//
//        animal.showInfo();
//        person.showInfo();

        Info info = new Animal(6);
        Info info1 = new Person("Software Engineer");

        info.showInfo();
        info1.print();
    }
}
