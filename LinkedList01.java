public class LinkedList01{
     public static class Node{
         int data;
         Node next;
        Node(int data){
          this.data=data;
          this.next=null;
        }

     }  
     public static class LinkedList{
         Node Head;
        Node tail;
         int size;
         public void addLast(int val){  //function to add the  element at the last
            Node node=new Node(val);
            if(this.size==0){
                this.Head=node;
                this.tail=node;
            }else{
                this.tail.next=node;
                this.tail=node;
            }
            size++;


         }
         // function to  know the size  of the linkedList
           
            public int LinkedListSize(){
                return this.size;

            }
             //function to display the linkedList 
             void  displayLinkdedList(){
                Node ptr=this.Head;
                 while(ptr!=null){
                     System.out.print(ptr.data+"->");
                ptr=ptr.next;
                 }
                 System.out.println();

             }
     }
    
      

          
     public static void main(String[]args){
         LinkedList ll=new LinkedList();
          ll.addLast(10);
          System.out.println(ll.LinkedListSize());
           ll.addLast(32);
           ll.addLast(12);
           ll.addLast(42);
           ll.addLast(62);
           ll.displayLinkdedList();
     }

}