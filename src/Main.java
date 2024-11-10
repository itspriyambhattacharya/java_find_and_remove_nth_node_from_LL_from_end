import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader isp = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isp);
        LL list = new LL();

        System.out.print("\nEnter number of elements you want to insert in the list: ");
        int noOfElements = Integer.parseInt(br.readLine());

        for (int i = 0; i < noOfElements; i++) {
            System.out.print("\nEnter data of the node: ");
            int data = Integer.parseInt(br.readLine());
            list.addLast(data);
        }
        System.out.println("\nThe list is:");
        list.display();

        System.out.print("""
                Enter the node number to delete from last, 
                1 to delete the last node, 2 to delete the second last node and so on....
                Enter n: """);
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
