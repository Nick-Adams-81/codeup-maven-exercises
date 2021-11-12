import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class HelloMaven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word[s]");
        String res = sc.nextLine();
        System.out.println("You entered " + res);
        System.out.println("is your entry numeric? " + StringUtils.isNumeric(res));

        res = StringUtils.swapCase(res);
        System.out.println("Your input w/ swapped case is:" + res);
        res = StringUtils.reverse(res);
        System.out.println("your input reversed is: " + res);


    }

}
