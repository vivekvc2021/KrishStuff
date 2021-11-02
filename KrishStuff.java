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
            "9. The Abused Lunchbox\n" +
            "10. Protecting the Second Amendment\n" +
            "11. [Quit]";

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
            if (answer.equals("11")) {
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
                        "Harlem is a place where our Krish likes to pretend he grew up! Of course," + "in reality \n" +
                        "he is from San Jose, CA (but likes to pretend he's from Cupertino). Of course, Krish will\n" +
                        "now renege on this idea and say that he is from San Jose, due to himself becoming 18. \n" +
                        "This is a lie.";
            case "2":
                return "The Love Story\n" + "Srinjoy is possibly the love of Krish's life. Krish finds ways to bring Srinjoy \n" +
                        "into every conversation, regardless of whether Srinjoy is relevant in the conversation.\n" +
                        " If you would like to visit Srinjoy, you can find him in the McCutcheon Hall.";
            case "3":
                return "Chicago's Famous Sculpture\n" + "The Bean is a structure in Chicago, Illinois, built by architect and \n" +
                        "VantaBlack creator Anish Kapoor (whom we colloquiolly refer to as VantaBlack Anish). \n" +
                        "For some reason, Krish is under the impression that The Bean is the coolest place in existence\n" +
                        "despite how overrated it is. Weirdly, Krish has not talked about the Bean as much \n" +
                        "after visiting the Bean, a phenomenon humanity attributes to the overrated-ness of the Bean.";
            case "4":
                return "The Height Story\n" + "Krish is short.";
            case "5":
                return "The Scandal in the Galaxy of Super Mario\n" + "Krish coerced Srinjoy (for information on Srinjoy,\n" +
                        "type '2') into breaking the law by selling a faulty game to GameStop. Krish \n" +
                        "over-dramatasizes this by referring to it as the 'Super Mario Galaxy Scandal', when in\n" +
                        "reality it is quite civil and not at all a scandal.";
            case "6":
                return "The History of Age\n" + "On the 31st of November, two days prior to his eighteenth birthday, \n" +
                        "Krish decided it would be a good idea to shout 'I'm a minor!' in the dining hall, 'Windsor.'\n" +
                        "It has long been debated whether this was a good idea, but Mr. Raj clearly decided it was\n" +
                        "when he sacrificed his morals for $10.";
            case "7":
                return "The Fable of Vision\n" + "Krish is blind. In a dark and stormy night under the influence, \n" +
                        "Krish once thought that he cured his blindness. In reality, it was just sleep deprivation\n" +
                        "and Jägermeister showing him how dumb he really is.";
            case "8":
                return "The Chronicle of Thomas\n" + "Krish is often very dull, and enjoys mispronouncing names for fun.\n" +
                        "However, when it comes to Thomas, Krish pronounces it with the th-sound, so 'thom-as' rather\n" +
                        "than the more colloquial 'tom-as'";
            case "9":
                return "The Abused Lunchbox\n" + "This is a story that Krish does not enjoy telling, mainly \n" +
                        "because he is the perpetrator in this scenario. As a five-year-old menace, he\n" +
                        "ran around his playground like The Flash. However, on one fine rainy day, five-year-old\n" +
                        "Mr. Raj saw a poor kid getting bullied by an older kid. Krish, rather than standing\n" +
                        "up to the bully, decided to joined in on the fun, violently kicking the child's\n" +
                        "lunchbox into a puddle. When authorities came to arrest him, Mr. Raj realized\n" +
                        "what he had done and sprinted in the opposite direction. He led the high-speed \n" +
                        "chase for a solid 5 minutes, and to this day, his name is notorious at Challenger.";
            case "10":
                return "Protecting the Second Amendment\n" + "Krish has no qualms telling this story, because it is one\n" +
                        "of the few interesting moments of his life. As a pubescent young teenager, Krish \n" +
                        "decided to bring a wooden gun to the Dulles Airport, one of the most securely-guarded\n" +
                        "airports in the world. Understandably, the thirteen-year-old was stopped by security,\n" +
                        "and his property was justly seized. Krish was promptly placed on the FBI watchlist, and remains\n" +
                        "there to this day (probably).";
            case "11":
                return "Ok, you have quit!";
            default:
                return "That's not a valid input! Silly goose.";
        }
    }
}
