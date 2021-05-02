import java.util.List;
import java.util.ArrayList;

public class Part3 {
    
    public static void main(String[] args) {
        Queue myQueue = new Queue();
        myQueue.enqueue(6);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(8);
        System.out.print("Created list: ");
        myQueue.size();
        System.out.print("Dequeue all from: ");
        int size = myQueue.size();
        Node n; 
        for(int i= 0; i <= size + 1; i++)
        {
            n = myQueue.dequeue();
            if(n != null)
            {
                System.out.println("Dequeue: " + n.value);
            }
        }
        System.out.println("Size: " + myQueue.size());

    }

}