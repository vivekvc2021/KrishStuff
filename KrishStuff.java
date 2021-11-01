import java.util.*;

/*
Krish Stuff:
Harlem
The Bean
Srinjoy

 */

public class KrishStuff {
    private static final String menu = "Krish Stuff Database \n" +
            "Which would you like to learn about? \n" +
            "Harlem \n" +
            "Srinjoy \n" +
            "The Bean \n";  // @TODO

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Krish Shit Database! Here you can learn all " +
                "about Krishenraj Ashok, the man-child from San Jose, California!");
        System.out.println("This database was made by Vivek Chudasama, an exemplary student procrastinating on his" +
                " computer science midterm :) He made this database as a present for Krish's " +
                "8th -- sorry, 18th -- birthday. Happy birthday buddy.");
        boolean keepGoing = true;
        while (keepGoing) {
            System.out.println(menu);
        }
    }
}
