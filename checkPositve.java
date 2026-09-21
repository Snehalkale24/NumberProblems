import java.util.*;

public class check_positive{

    public static void check(int no) {
        
        if(no > 0) {
            System.out.println("Positive");
        }
        else if(no < 0) {
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }
    }

    public static void main(String args[]) {
        check(23);
    }
}