package learningInheritance;
/*
    Inheritance is the property of getting methods or data elements from another class
    PARENT CLASS(BASE CLASS):there is a class ANIMAL that contains INT AGE and Method EAT

    CHILD CLASS(SUB CLASS):There is a class Tiger that requires the method and data element of the BASE CLASS
    so it "extends" the class by simply saying

    class Tiger extends ANIMAL(){
    }

    Multiple SUB classes can Inherit properties of a PARENT class


    SINGLE INHERITANCE: eg. class tiger inherits properties class ANIMAL

    MULTILEVEL INHERITANCE: eg.class C inherits properties og both class B and class A whereas class B only inherits properties of class A
                        claas C extends class B extends class A9keyword)

    HIERARCHIAL INHERITANCE: eg. class B and class C both inherits properties of class A
 */

public class Inheritance {
    public static void main(String [] Args)
    {
        Animals animal = new Animals();
        animal.eat();
        animal.sleep();
        System.out.print("----------------------------\n");

        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.sleep();
        tiger.showInfo();
    }
}
