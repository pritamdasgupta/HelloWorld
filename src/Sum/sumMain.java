package Sum;

public class sumMain {
    public static void main(String [] args) {
        Sum SUM = new Sum();
        //SUM.takeInput();
        int [] getNumbers = SUM.takeInput();
        int a= getNumbers[0];
        int b = getNumbers[1];
        int getSum =SUM.doSum(a,b);
        SUM.doPrint(getSum);
    }




}