import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader isp = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isp);
        LL list = new LL();

        list.addLast(45);
        list.addLast(5);
        list.addLast(55);
        list.addLast(67);
        list.addLast(12);
        list.addLast(64);
        list.addLast(89);
        list.display();

        System.out.println("""
                Enter the node number to delete from last, 
                1 to delete the last node, 2 to delete the second last node and so on....""");
        int n = Integer.parseInt(br.readLine());
        int size = list.getSize();
        int requiredNodeNumber = size - n + 1;
        int d = list.delete(requiredNodeNumber);
        System.out.println("\nThe deleted element is "+ d);;
        System.out.println("""
                The list is: """);
        list.display();
    }
}
