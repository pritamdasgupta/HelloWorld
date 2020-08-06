package Sum;

import java.util.Scanner;

public class Sum {

    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = s.nextInt();
        int b = s.nextInt();
        int [] arrtostore = {a,b};
        return(arrtostore);


    }
    public static int doSum (int a , int b){
        int sum =0;
        sum = a + b;
        return(sum);
    }
    public static int doPrint(int sum) {
        System.out.println(sum);
        return sum;
    }

//public static void main(String [] args) {
//
//		int [] getNumbers = takeInput();
//		int a= getNumbers[0];
//		int b = getNumbers[1];
//		int getSum =doSum(a,b);
//		doPrint(getSum);
//}
}
