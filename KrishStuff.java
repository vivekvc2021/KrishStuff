import java.util.*;

public class KrishStuff {
    private static final String menu = "Krish Stuff Database \n" +
            "Which would you like to learn about? Please type in the corresponding number.\n" +
            "1. The Tale of the Homeland\n" +
            "2. The Love Story\n" +
            "3. Chicago's Famous Sculpture\n" +
            "4. The Height Story\n" +
            "5. The Scandal in the Galaxy of Super Mario\n" +
            "6. The History of Age\n" +
            "7. The Fable of Vision\n" +
            "8. The Chronicle of Thomas\n" +
            "9. [Quit]";  // @TODO

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Krish Stuff Database! Here you can learn all " +
                "about Krishenraj Ashok, the man-child from San Jose, California!");
        Thread.sleep(3000);
        System.out.println("This database was made by Vivek Chudasama, an exemplary student procrastinating on his" +
                " computer science midterm :) \nHe made this database as a present for Krish's " +
                "8th -- sorry, 18th -- birthday. Happy birthday buddy.");
        Thread.sleep(3000);
        boolean keepGoing = true;
        while (keepGoing) {
            System.out.println();
            System.out.println(menu);
            String answer = scanner.nextLine();
            if (answer.equals("4")) {
                keepGoing = false;
                break;
            } else {
                System.out.println(response(answer));
                Thread.sleep(3000);
            }
        }
        System.out.println("Thank you for visiting the Krish Stuff Database! Come back anytime!");
    }

    public static String response(String answer) {
        switch(answer) {
            case "1":
                return "The Tale of the Homeland\n" +
                        "Harlem is a place where our Krish likes to pretend he grew up! Of course," +
                        " in reality he is from San Jose, CA (but likes to pretend he's from Cupertino) " +
                        ".";
            case "2":
                return "The Love Story\n" + "Srinjoy is possibly the love of Krish's life. Krish finds ways to bring Srinjoy " +
                        "into every conversation, regardless of whether Srinjoy is relevant in the conversation." +
                        " If you would like to visit Srinjoy, you can find him in the McCutcheon Hall.";
            case "3":
                return "Chicago's Famous Sculpture\n" + "The Bean is a structure in Chicago, Illinois, built by architect and " +
                        "VantaBlack creator Anish Kapoor (whom we colloquiolly refer to as VantaBlack Anish). " +
                        "For some reason, Krish is under the impression that The Bean is the coolest place in existence" + "" +
                        "despite how overrated it is. Weirdly, Krish has not talked about the Bean as much " +
                        "after visiting the Bean, a phenomenon humanity attributes to the overrated-ness of the Bean.";
            case "4":
                return "The Height Story\n" + "Krish is short.";
            case "5":
                return "The Scandal in the Galaxy of Super Mario\n" + "Krish coerced Srinjoy (for information on Srinjoy, " +
                        "type '2') into breaking the law by selling a faulty game to GameStop. Krish " +
                        "over-dramatasizes this by referring to it as the 'Super Mario Galaxy Scandal', when in" +
                        "reality it is quite civil and not at all a scandal.";
            case "6":
                return "The History of Age\n" + "On the 31st of November, two days prior to his eighteenth birthday, \n" +
                        "Krish decided it would be a good idea to shout 'I'm a minor!' in the dining hall, 'Windsor.'\n" +
                        " It has long been debated whether this was a good idea, but Mr. Raj clearly decided it was\n" +
                        " when he sacrificed his morals for $10.";
            case "7":
                return "The Fable of Vision\n" + "";
            case "8":
                return "The Chronicle of Thomas\n" + "";
            case "9":
                return "Ok, you have quit!";
            default:
                return "That's not a valid answer! Silly goose.";
        }
    }
}
