import java.util.Random;
public class Prac_1_2_MovieQuote {
    public static void main(String[]args) {
        Random rd = new Random();
        int disQuote = rd.nextInt(5);
        System.out.println("Displaying quote number: "+disQuote);
            switch (disQuote) {
                case 1:
                    System.out.println("Darth Vader: I'm not the jedi I should be.\n");
                    break;
                case 2:
                    System.out.println("Anakin Skywalker: This is where the fun begins.\n");
                    break;
                case 3:
                    System.out.println("Obi-Wan: It's over Anakin! I have the high ground.");
                    break;
                case 4:
                    System.out.println("Yoda: Fear is the path to the dark side,fear leads to anger anger leads to hate, hate leads to suffering. and i sense much fear in you");

                    break;
                case 5:
                    System.out.println("Vader: No, I am your father.");
                    break;
            }


        }
    }

