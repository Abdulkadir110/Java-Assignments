import java.util.Scanner;

public class MainLibraryBookTracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String menuFunctions = """
        [1] DISPLAY ALL BOOKS AVAILABLE
        [2] ADD A NEW BOOK TO THE SHELF
        [3] SEARCH FOR A BOOK
        [4] REMOVE A BOOK IN THE SHELF
        [0] EXIT
        """;
        String[] library = new String[5];
        LibraryBookTracker tracker = new LibraryBookTracker(library);
        String choice = "";

        while (!(choice.equals("0"))) {
            System.out.println();
            System.out.println(menuFunctions);
            System.out.print("Enter number between 0 and 4: ");
            choice = input.next();
            input.nextLine();

            switch (choice) {
                case "1": {
                    String[] sortedLibrary = tracker.displayBooksIn();
                    if (sortedLibrary.length == 0) {
                        System.out.println("The shelf is currently empty.");
                    } else {
                        for (int index = 0; index < sortedLibrary.length; index++) {
                            System.out.println("Shelf " + (index + 1) + " --> " + sortedLibrary[index]);
                        }
                    }
                    break;
                }

                case "2": {
                    int counter = 0;
                    for(int index = 0; index < library.length; index++){
                        if(!library[index].equals("empty")){
                            counter++;
                        }
                    }
                    if(counter != library.length){
                        System.out.println("Enter the book: ");
                        String book = input.nextLine();
                        System.out.println();
                        tracker.addBookTo(book);
                    }
                    else {
                        System.out.println("The Library is full");
                    }

                    break;
                }

                case "3": {
                    System.out.println("Enter the book: ");
                    String book = input.nextLine();
                    System.out.println(tracker.searchForBookIn(book));
                    break;
                }

                case "4": {
                    System.out.println("Enter the book: ");
                    String book = input.nextLine();
                    tracker.removeBookIn(book);
                    break;
                }

                case "0": {
                    System.out.println("Goodbye!");
                    break;
                }

                default: {
                    System.out.println("Invalid choice. Please enter a number between 0 and 4.");
                    break;
                }
            }
        }
    }
}
