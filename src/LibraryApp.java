public class LibraryApp {
    public static void main(String[] args) {
        // INSTANTIATE OBJECTS OF BOOK AND DVD CLASSES
        Book book1 = new Book("The Notebook", 1996, "Nicholas Sparks", "978-0786208210");
        Book book2 = new Book("Dear John", 2006, "Nicholas Sparks", "978-0786208211");
        DVD dvd1 = new DVD("Gretel & Hansel", 2020, "Oz Perkins", 87);

        // LIBRARYMANAGER OBJECT
        LibraryManager<LibraryItem> libraryManager = new LibraryManager<>();

        // STEP 6: ADD ITEMS TO THE LIBRARY
        libraryManager.addItem(book1);
        libraryManager.addItem(book2);
        libraryManager.addItem(dvd1);
        System.out.println(); //JUST FOR SPACING/FORMATTING PURPOSES

        // STEP 6: DISPLAY LIST OF ITEMS IN THE LIBRARY
        libraryManager.displayItems();

        // STEP 6: REMOVE ITEMS FROM THE LIBRARY
        libraryManager.removeItem(book1);

        // STEP 6: DISPLAY LIST OF ITEM FROM LIBRARY
        libraryManager.displayItems();
    }
}
