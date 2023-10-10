package mediatheque;

public class BookPrinter implements ItemVisitor {
    public BookPrinter() {
    }

    @Override
    public void visit(Book item) {
        System.out.println(item.toString());
    }

    @Override
    public void visit(CD item) {

    }
}
