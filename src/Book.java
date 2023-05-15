public class Book extends LibraryItem {
    private String author;
    private String ISBN;

    public Book(String title, int releaseYear, String author, String ISBN) {
        super(title, releaseYear);
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public void displayInformation() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Type: " + getItemType());
        System.out.println("Details: " + getItemDetails());
    }

    @Override
    public String getItemType() {
        return "Book";
    }

    @Override
    public String getItemDetails() {
        return title + " by " + author + " was released in " + releaseYear + ", ISBN # " + ISBN;
    }
}
