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

    public void display(){
        Node ptr = head;
        while(ptr !=  null){
            System.out.print(ptr.data + "----->");
            ptr = ptr.link;
        }
        System.out.println("null");
    }
}
