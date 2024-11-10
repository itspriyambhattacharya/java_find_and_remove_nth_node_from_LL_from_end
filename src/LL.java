public class LL {
    public Node head;
    public int size;

    public LL() {
        this.head = null;
        this.size = 0;
    }

    public void addLast(int data) {
        Node n = new Node(data);
        this.size++;
        if (head == null) {
            head = n;
            return;
        }
        Node ptr = head;
        while (ptr.link != null) {
            ptr = ptr.link;
        }
        ptr.link = n;
    }

    public void display() {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + "----->");
            ptr = ptr.link;
        }
        System.out.println("null");
    }

    public int getSize() {
        return this.size;
    }

    public int delete(int pos) {
        Node prevNode = null;
        Node currentNode = head;
        for (int i = 0; i < pos; i++) {
            prevNode = currentNode;
            currentNode = currentNode.link;
        }
        int rem = currentNode.data;
        prevNode.link = currentNode.link;
        return rem;
    }
}
