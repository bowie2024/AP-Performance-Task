// Edit Maker software in Java

import java.util.Scanner;

public class EditMaker {
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Edit Maker!");

        // Ask the user for the type of edit they'd like to make
        System.out.println("What type of edit would you like to make? (Instagram, YouTube, TikTok, etc.)");
        String editType = scanner.nextLine();

        // Ask the user for the people they'd like to feature in the edit
        System.out.println("Who would you like to feature in the edit? (Influencer, Celebrity, etc.)");
        String peopleToEdit = scanner.nextLine();

        // Ask the user for the audio they'd like to include
        System.out.println("What audio would you like to include? (Song Name, Artist)");
        String audioToEditTo = scanner.nextLine();

        // Ask the user for the color scheme they'd like to use
        System.out.println("What color scheme would you like to use? (Pink & White, Grey & Black)");
        String colorScheme = scanner.nextLine();

        // Ask the user for the style of edit they'd like to make
        System.out.println("What style of edit would you like to make? (Dark, Soft, Baddie, etc.)");
        String editStyle = scanner.nextLine();

        // Create the edit based on the user's choices
        System.out.println("Creating your edit...");
        System.out.println("Your edit is ready!");
        System.out.println("Edit Type: " + editType);
        System.out.println("People to Edit: " + peopleToEdit);
        System.out.println("Audio to Edit To: " + audioToEditTo);
        System.out.println("Color Scheme: " + colorScheme);
        System.out.println("Edit Style: " + editStyle);
    }
}
