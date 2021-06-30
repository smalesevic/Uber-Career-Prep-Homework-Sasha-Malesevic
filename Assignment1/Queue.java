package Assignment1;

public class Queue {
    private Node head; 
    private Node tail; 

    public Queue()
    {
        head = null;
        tail = null;
    }
    public Node enqueue(int val)
    {
        Node newNode = new Node(val);

        // check if list is empty 
        if(head == null || tail == null)
        {
            head = newNode;
            tail = newNode; 
        }
        else if(head == tail)
        {
            tail = newNode;
            tail.next = head;
        }
        else
        {
            newNode.next = tail;
            tail = newNode;
        }

        return newNode;
    }

    public Node dequeue()
    {
        Node deq = null;
        // only one element in list 
        if(head == tail && head != null && tail != null)
        {
            deq = head;
            head = null;
            tail = null;
        }
        else if(head != null && tail != null)
        {
            // remove from front
            Node curr = tail;
            while(curr != null)
            {
                // if the current node is the one right before head, set it as the new head  
                if(curr.next == head)
                {
                    deq = head; // the node being dequeued 
                    head = curr;
                    head.next = null;
                    break;
                }
                curr = curr.next;
            }
        }
        return deq;
    }

    public Node rear()
    {
        return tail;
    }

    public Node front()
    {
        return head;
    }

    public int size()
    {
        Node curr = tail;
        int count = tail == null ? 0 : 1;
        while(curr != null) // traverse through list 
        {
            System.out.print(curr.value + " ");
            curr = curr.next;
            count++;
        }
        System.out.println();
        return count;
    }
}

