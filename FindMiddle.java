class Node {
    int data;     
    Node next;      
    // Constructors
    Node(int data1, Node next1) {
        this.data = data1;  
        this.next = next1;  
    }
    Node(int data1) {
        this.data = data1;  
        this.next = null;   
    }
}
    public class FindMiddle{
        static Node FindMiddle(Node head){
            if(head==null||head.next=null){
                return head;
            }
            Node temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next; 
            }
            int mid=count/2+1;
            temp=head;
           while(temp!=null){
            mid=mid-1;
           }
           if(mid==0)
           break;
           temp=temp.next;
           return temp;
        }
    }