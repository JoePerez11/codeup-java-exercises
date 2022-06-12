package util;

public class InputTest {
    public static void main(String[] args) {
        Input myInput = new Input();
        System.out.print("Testing getString(): ");
        System.out.println("myInput.getString() = " + myInput.getString());
        System.out.print("Testing yesNo(): ");
        System.out.println("myInput.yesNo() = " + myInput.yesNo());
        System.out.println("myInput.getInt(1,50) = " + myInput.getInt(1, 50)); // getInt w/ args
        System.out.println("myInput.getInt() = " + myInput.getInt());  // getInt w/o args
        System.out.println("myInput.getDouble(35.6, 40.3) = " + myInput.getDouble(35.6, 40.3)); // getDouble w/ args
        System.out.println("myInput.getDouble() = " + myInput.getDouble()); //getDouble w/o args
        System.out.println("myInput.getBinary() = " + myInput.getBinary());
        System.out.println("myInput.getHex() = " + myInput.getHex());
    }
}