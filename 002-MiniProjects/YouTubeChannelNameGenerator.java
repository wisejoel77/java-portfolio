import java.util.Scanner;

public class YouTubeChannelNameGenerator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("!---YouTube Channel Name Generator---!\n");
        System.out.print("What is your nickname?: ");
        String firstName = scanner.nextLine();
        System.out.print("What is the next name you want to add?: ");
        String secondName = scanner.nextLine();
        System.out.println();

        System.out.printf("Your YouTube channel name could be \"%s %s\"\n\n", firstName, secondName);
        System.out.print("Thank you for using my generator.");


    }
}
