package mediatheque;

public class CDPrinter implements ItemVisitor {
    public CDPrinter() {
    }

    @Override
    public void visit(Book item) {

    }

    @Override
    public void visit(CD item) {
        System.out.println(item.toString());
    }
}
