package mediatheque;

public class Print implements ItemVisitor{

    public Print() {}

    public void visit(Book book) {
        System.out.println(book);
    }

    public void visit(CD cd) {
        System.out.println(cd);
    }
}
