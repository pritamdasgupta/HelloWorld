package MethodOverview;

import java.util.Scanner;

public class methodOveriew {
    public static void main(String[] Args) {
        //making and Object of class method
        method Method = new method();
        //calling methods of the class  with the object made
        // Storing values returned by the method in the same data type
        String Name = Method.inputName();
        int Age = Method.inputAge();
        //Passing parameters
        Method.toPrint(Name , Age);
        Method.smokeRange(Age);


    }
}
     class method{

    /* this method will contain only data elements like String or int
        void means it will not return any value
        if there is int instead of void the there will be a int return statement
     */
    public String inputName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.next();
        //String variable to return since the method is expecting a string variable
        return name;
    }
    public static int inputAge(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        return age;
    }
    // Parameter as a String is passed
    public static void toPrint(String name , int age ){
        System.out.println("My name is " + name + " and I am " + age+ " years old.");

    }

    public static void smokeRange(int age){
        if (age> 20){
            System.out.println("You are free to smoke.");
        }
        else
            System.out.println("You should not Smoke.");
    }
}

