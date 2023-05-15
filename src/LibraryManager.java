import java.util.ArrayList;
import java.util.List;

public class LibraryManager<T extends LibraryItem> implements LibraryOperations<T> {
    private List<T> items;

    public LibraryManager() {
        items = new ArrayList<>();
    }

    @Override
    public void addItem(T item) {
        items.add(item);
        System.out.println("Item added: " + item.getTitle());
    }

    @Override
    public void removeItem(T item) {
        if (items.remove(item)) {
            System.out.println("Item removed: " + item.getTitle());
            System.out.println(); //JUST FOR SPACING/FORMATTING PURPOSES
        } else {
            System.out.println("Item not found: " + item.getTitle());
            System.out.println(); //JUST FOR SPACING/FORMATTING PURPOSES
        }
    }

    @Override
    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("There are no items in the library.");
        } else {
            System.out.println("Library items:");
            for (T item : items) {
                item.displayInformation();
                System.out.println();
            }
        }
    }
}
