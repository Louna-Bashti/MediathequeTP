package mediatheque;

public class PrintCD implements ItemVisitor {

    public PrintCD() {}

    public void visit(Book book) {
    }

    public void visit(CD cd) {
        System.out.println(cd);
    }
}
