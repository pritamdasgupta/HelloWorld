package Interface;

public class Animal implements Info{

    public int id;

    public Animal(int id){
        this.id = id;
    }


    public static void eat(){
        System.out.println("Animal is eating");
    }

    public void showInfo(){
        System.out.println("the is is " +this.id);
    }

    @Override
    public void print() {

    }


}
