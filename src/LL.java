public class LL {
    public Node head;
    public int size;

    public LL(){
        this.head = null;
        this.size = 0;
    }

    public void addLast(int data){
        Node n = new Node(data);
        this.size++;
        if (head == null){
            head = n;
            return;
        }
        Node ptr = head;
        while(ptr.link != null){
            ptr = ptr.link;
        }
        ptr.link = n;
    }
}
