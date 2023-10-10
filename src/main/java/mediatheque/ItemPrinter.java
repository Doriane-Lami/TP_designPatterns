package mediatheque;

public class ItemPrinter implements ItemVisitor {
    public ItemPrinter() {
    }

    @Override
    public void visit(Book item) {
        System.out.println(item.toString());
    }

    @Override
    public void visit(CD item) {
        System.out.println(item.toString());
    }
}

