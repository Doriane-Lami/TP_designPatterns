package mediatheque;

import java.util.LinkedList;
import java.util.List;


public class Mediatheque {
    private final List<Item> items = new LinkedList<>();

    public void addItem(Item i) {
        items.add(i);
    }

    ItemVisitor v = new ItemPrinter();
    ItemVisitor vb = new BookPrinter();
    ItemVisitor vcd = new CDPrinter();



    public void printCatalog() {
        for (Item i : items)
            i.accept(v);
    }

    public void printOnlyBooks() {
        for (Item i : items)
            i.accept(vb);
    }

    public void printOnlyCDs() {
        for (Item i : items)
            i.accept(vcd);
    }
}
