import java.util.*;

/*
Krish Shit:
Harlem
The Bean
Srinjoy

 */

public class Krishit {
    private static final String menu = "Krish Shit Database \n" +
            "Which would you like to learn about? Please type in the corresponding number \n" +
            "1. Harlem \n" +
            "2. Srinjoy \n" +
            "3. The Bean \n" +
            "4. [Quit]";  // @TODO

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
            String answer = scanner.nextLine();
            if (answer.equals("4")) {
                keepGoing = false;
                break;
            } else {
                System.out.println(response(answer));
            }
        }
        System.out.println("Thank you for visiting the Krishit Database! Come back anytime!");
    }

    public static String response(String answer) {
        switch(answer) {
            case "1":
                return "Harlem is a place where our Krish likes to pretend he grew up! Of course," +
                        " in reality he is from San Jose, CA (but likes to pretend he's from Cupertino) " +
                        ".";
            case 2:
                return "Srinjoy is possibly the love of Krish's life. Krish finds ways to bring Srinjoy " +
                        "into every conversation, regardless of whether Srinjoy is relevant in the conversation." +
                        " If you would like to visit Srinjoy, you can find him in the McCutcheon Hall.";
        }
    }
}
