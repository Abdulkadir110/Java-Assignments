import tdd.Diaries;

import java.util.Scanner;

public class Application {
    private static Diaries diaries = new Diaries();

    private static void gotoMainMenu(){
        print("""
                === DIARY APP ===
        [1] Create diary
        [2] Log in to diary
        [3] Delete diary
        [4] Exit
        """);

        char userMenuChoice = input("Enter an option: ").charAt(0);
        switch (userMenuChoice) {
            case 1 -> createDiary();
            case 2 -> gotoLoginFunction();
            case 3 -> deleteDiary();
            case 4 -> exit();
            default -> print("Invalid option");
        }
    }

    private static void deleteDiary() {
        String username = input("Username: ");
        String password = input("Password: ");
        try {
            diaries.delete(username, password);
            print("Diary deleted successfully>>>>>>>>>>>>");
        } catch (IllegalArgumentException e) {
            print("Error: " + e.getMessage());
        }
    }

    private static void createDiary() {
        String username = input("Username: ");
        String password = input("Password: ");
        try {
            diaries.add(username, password);
            print("Diary created");
        } catch (IllegalArgumentException e) {
            print("Error: " + e.getMessage());
        }
        finally {
            gotoMainMenu();
        }
    }

    private static void gotoLoginFunction(){
        loginToDiary();
        print("""
        >>>>Diary Menu<<<<<
        [1] Create entry
        [2] View entry
        [3] Update entry
        [4] Delete entry
        [5] Lock & Exit
        """);
        char userLoginFunction = input("Enter your option: ").charAt(0);
        switch (userLoginFunction){
            case 1 -> createEntry();
            case 2 -> viewEntry();
            case 3 -> updateEntry();
            case 4 -> deleteEntry();
            case 5 -> exitDiary();
        }
    }

    private static void print(String message){
        System.out.println(message);
    }
    private static String input(String message){
        Scanner input = new Scanner(System.in);
        print(message);
        return input.nextLine();
    }
}
