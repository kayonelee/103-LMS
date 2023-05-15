public abstract class LibraryItem {
    protected String title;
    protected int releaseYear;

    public LibraryItem(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public abstract void displayInformation();

//Implement the following abstract methods in the LibraryItem class: returns the type of the library item (Book or DVD)
    public abstract String getItemType();

//Implement the following abstract methods in the LibraryItem class: returns the details of the library item
    public abstract String getItemDetails();
}
