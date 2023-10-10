package mediatheque;

public class PrintBook implements ItemVisitor {

    public PrintBook() {}

    public void visit(Book book) {
        System.out.println(book);
    }

    public void visit(CD cd) {}
}
