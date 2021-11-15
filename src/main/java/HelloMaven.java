import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class HelloMaven {

    public static void main(String[] args) {


        boolean confirm;

        do {

            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter something...");
            String res = sc.nextLine();
            System.out.println("You entered " + res);

            if (StringUtils.isNumeric(res)) {
                System.out.println("your entry " + res + " is numeric");
            } else {
                System.out.println("Your entry " + res + " is not numeric");
            }

            res = StringUtils.reverse(res);
            System.out.println("your input reversed is: " + res);

            res = StringUtils.swapCase(res);
            System.out.println("Your input w/ swapped case is: " + res);

            System.out.println("Continue?[y/n]");
            String yOrN = sc.nextLine();
            confirm = yOrN.equalsIgnoreCase("y");

        } while(confirm);

        // the critical drinker reference...
        System.out.println("That's all I've got for today, go away now!");


    }

}
