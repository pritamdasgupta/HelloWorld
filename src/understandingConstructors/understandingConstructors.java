package understandingConstructors;

public class understandingConstructors {
    public static void main(String [] Args){
        Student student2 = new Student();
        student2.name = "Pritam";
        student2.showInfoOfStudents();

        Student student3 = new Student("Prabir" , 23);
        //student3.name = "Sayan";
        student3.showInfoOfStudents();


    }
}

class Student{
     String name;
     int age;
    /*
    this is a default constructor i.e no parameter is passed within the brackets
     */
    Student(){
        System.out.println("Defalut Constructor without any params ");
        age = 23;
    }

    Student(String name , int age){
        this.name = name;
        this.age = age;
        System.out.println("It is a Parameterized Constructor");
    }

    public void  showInfoOfStudents(){
        System.out.println("The name of the Student is " + name + " and his/her age is " + age);
    }
}