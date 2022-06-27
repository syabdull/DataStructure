public class LinkedList02 {
    public static class Node{
         Node next;
         int data;
         Node(int data){
            this.data=data;
            this.next=null;

         }

    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size;
        // funciton to get at first
          public  void getFirst(){
             if(this.size==0){
                System.out.println("invalid input LinkedList is empty");
             }else{
                System.out.println(this.head.data);

             }

          }
          //function to get at Last
          public void getLast(){
            if(this.size==0){
                   System.out.println("invalid input");
            }else{
             System.out.println(this.tail.data);
            }
          }
          //function to get at index
           public void getAtIndex(int idx){ 
               
             if(this.size==0){
                 System.out.println("invalid list");
             }else if(idx<0||idx>=this.size){
                System.out.println("invalid index");
             }else{
                Node ptr=this.head;
                while(idx!=0){
                    ptr=ptr.next;
                    idx--;
                }
                System.out.println(ptr.data);

             }

           }
           //function to add at First
            public void addFirst(int val){
                 Node node =new Node(val);
                   if(this.size==0){
                     this.head=this.tail=node;
                   }else{
                    node.next=this.head;
                    this.head=node;
                   }
                   size++;

            }

    }
     public static void main(String[]args){
        LinkedList ll=new LinkedList();
         ll.addFirst( 10);
         ll.addFirst( 20);
         ll.addFirst(55);
        ll.getFirst();
        ll.getLast();


     }
    
}
