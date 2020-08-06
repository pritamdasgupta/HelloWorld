package keywordThis;

public class keywordThis {
    public static void main(String[] Args) {
        Human human = new Human();
        human.setAge(23);
        human.setName("Pritam");
        human.print();


    }
}

    class Human {
        String name;
        int age;

        public void setName(String name) {
            //*this* keyword refers to the instance variable i.e here the variable is initially declared.
            this.name = name;
        }

        public String getName() {

            return name;
        }

        public void setAge(int age) {

            this.age = age;
        }

        private int getAge() {
            return age;
        }

        public void print() {

            System.out.println(name + ":" + age);
        }
}

