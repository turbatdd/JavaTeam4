package assignmentLesson9.prob3;


public class BrowserHistory {
    private LinkedList2Stack backStack;
    private LinkedList2Stack forwardStack;
    private String curUrl;

    public BrowserHistory(String url) {
        this.curUrl = url;
        this.backStack = new LinkedList2Stack();
        this.forwardStack = new LinkedList2Stack();
    }

    public void visit(String url) {
        if (curUrl != null) {
            backStack.push(curUrl);
        }
        curUrl = url;
        forwardStack = new LinkedList2Stack();
        System.out.println("Visited: " + curUrl);
    }

    public void back() {
        if (backStack.isEmpty()) {
            System.out.println("No history to go back to");
            return;
        }
        forwardStack.push(curUrl);
        curUrl = backStack.pop();
        System.out.println("Back to: " + curUrl);
    }

    public void forward() {
        if (forwardStack.isEmpty()) {
            System.out.println("No forward history");
            return;
        }
        backStack.push(curUrl);
        curUrl = forwardStack.pop();
        System.out.println("Forward to: " + curUrl);
    }
}
