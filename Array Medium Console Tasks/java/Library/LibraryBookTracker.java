public class LibraryBookTracker {
    private String[] library = new String[30];
    
    public LibraryBookTracker(String[] library){
        this.library = library;
    } 
    public void setLibrary(String[] library){
        this.library = library;
        
    }
    public String[] nullToEmpty(){
        for(int index = 0; index < library.length; index++) {
            if(library[index] == null){
                library[index] = "empty";
            }
        }
        return library;
    }
    public String[] displayBooksIn(){
        String temp = "";
        library = nullToEmpty();
        for(int index = 0; index < library.length; index++){
            for(int secondIndex = 0; secondIndex < library.length; secondIndex++){
                if(library[index].charAt(0) > library[secondIndex].charAt(0) && !(library[index].equals("empty"))){
                    temp = library[index];
                    library[index] = library[secondIndex];
                    library[secondIndex] = temp;
                }
            }
        }
        return library;
    }
    public void addBookTo(String book){
        for(int index = 0; index < library.length; index++){
            if(library[index] == "empty" || library[index] == null) {
                library[index] = book;
                break;
            }
        }
        
    }
    public void removeBookIn(String book){
        for(int index = 0; index < library.length; index++){
            if(library[index].equals(book) && library[index].equalsIgnoreCase(book)) {
                library[index] = "empty";
                break;
            }
        } 
    }
    public String searchForBookIn(String book) {
        String comment = "";
        for(int index = 0; index < library.length; index++){
            if(library[index] == book) {
                comment = "Available";
            }
            else {
                comment = "Not Available";
            }
        }
        return comment;
    }
}

