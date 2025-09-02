public  class customlinkedlist {
    private static class ll{ 
    private  Node head;
    private  Node tail;
    private int size;
    public void ll(int size){
        this.size=size;
    }
    }
    
    private static class Node{   // the topic of oops i used because as i am declaring it private so that no one accese it 
        
        private int data;   
        private Node next;
        public Node(int data){  //constructor is created whwn a class a new class is formed
            this.data=data;    //this is used to intialize the data
                               // and the static is used to when next=null
            this.next=null;
        }
    }
    private static Node addnode(int dta,Node head){
        Node newnode=new Node(dta);
        if(head==null){
            return newnode;
        }
        Node temp=head;
        while(temp.next !=null){
            temp=temp.next;
        }
        temp.next=newnode;
        return head;

    }
    private static Node addelestart(Node head,int data){
        Node newnode=new Node(data);
        if(head.next==null){
            return newnode;
        }
        newnode.next=head;
        newnode=head;
        return head;
    }
        
    
    
    
    public static void main(String[] args){
        Node head=new Node(10);
        head=addnode(10,head);
        head=addnode(30, head);
        head=addelestart(head,30);
        Node tmp=head;
        while(tmp !=null){
           System.out.print(tmp.data+"->");
           tmp=tmp.next;
        }
        System.out.println("END");

    }
}

