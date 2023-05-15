public class DVD extends LibraryItem {
    private String director;
    private int duration;

    public DVD(String title, int releaseYear, String director, int duration) {
        super(title, releaseYear);
        this.director = director;
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public void displayInformation() {
        System.out.println("DVD Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Type: " + getItemType());
        System.out.println("Quick Details: " + getItemDetails());
    }

    @Override
    public String getItemType() {
        return "DVD";
    }

    @Override
    public String getItemDetails() {
        return title + " by " + director + " was released in " + releaseYear + ", Duration: " + duration + " minutes ";
    }
}
