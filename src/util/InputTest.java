package util;
import java.util.Scanner;

public class InputTest {

    public static void main(String[] args) {

        System.out.println(Input.getString());
        System.out.println(Input.yesNo());
        System.out.println(Input.getInt(5, 100));
        System.out.println(Input.getInt());
        System.out.println(Input.getDouble(25.05, 50.05));
        System.out.println(Input.getDouble());

    }
}
