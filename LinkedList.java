
import java.util.*;
import java.io.*;

public class LinkedList{
   private Node head;
   private Node tail;
   private int length;
   
   class Node{
      int value;
      Node next;
      Node(int value){
         this.value=value;
      }
   }
   public LinkedList(int value){
      Node newNode = new Node(value);
      head = newNode;
      tail = newNode;
      length=1;
   }
  

public void getHead(){
   if(head==null){
      System.out.println("Head:Null");
   }
   System.out.println("Head: "+head.value);
}
public void getTail(){
   if(tail==null){
      System.out.println("Tail:null");
   }
   System.out.println("Tail: "+tail.value);
}

public void getLength(){
   if(length==0){
      System.out.println("Length is 0");
   }
   System.out.println("Length: "+length);
}
public void append(int value){
    Node newNode = new Node(value);
    if(length==0){
head= newNode;
tail=newNode;
length++;
    }
else{
    tail.next=newNode;
    tail=newNode;
    length++;
}
    }


  public void printList(){
   Node temp = head;
   while(temp!=null){
      System.out.println(temp.value);
      temp=temp.next;
   }

  }
  public void makeEmpty(){
    head=null;
    tail=null;
    length = 0;

  }
  public void removeLast(){
    
    if(head==null && tail==null){
        System.out.println("Head:Null");
        System.out.println("Tail:Null");
    }
    else if(head==tail){
          head=null;
    tail=null;
    length = 0;
     System.out.println("Head:Null");

    System.out.println("Tail:Null");
    }
    else{
Node temp = head;
int count = 1;

while(count!=length-1){
temp = temp.next;
count++;
}
temp.next=null;
tail=temp;
length--;
    }
    
  }
  public void prepend(int value){
    Node newNode = new Node(value);
    if(head==null&&tail==null){
head = newNode;
tail = newNode;
length=1;

    }
    newNode.next=head;
    head = newNode;
   
    length++;

  }
  public void removeFirst(){
    if(length==0){
        System.out.println("Fuck you");
    }
    else if(length==1){
        head = null;
        tail=null;
        length=0;
    }
    Node temp = new Node(1);
    temp = head;
    head = head.next;
  temp.next=null;
    length--;
  }

  public Node get(int index){
   if(index<0){
      System.out.println("Fuck you");
   }
   else if (index>=length){
      System.out.println("Fuck you");
   }
   Node temp = head;
   for(int i = 0;i<index;i++){
      temp=temp.next;
   }
   return temp;
  }

public boolean set(int index, int value){
   Node temp = get(index);
if(temp!=null){
   temp.value=value;
   return true;
}
return false;
}
public boolean insert(int index,int value){
   Node temp = get(index);
   Node newNode = new Node(value);
   if(index == length-1){
      append(value);
      return true;
   }
   if(index>=0&&index<(length-1)){
      newNode.next=temp.next;
      temp.next = newNode;
      length++;
      return true;
   }
   return false;
}
public Node remove(int index){
if(index ==0){
   Node temp = get(1);
   head = temp;
   length--;
   return temp;
}
if(index==length-1){
Node temp = get(length-2);
tail = temp;
tail.next=null;
length--;
return temp;

}
Node var = get(index-1);

var.next = var.next.next;
 return var;


}
public void reverse(){
 Node temp = head;
 head = tail;
 tail = temp;
 Node after = temp.next;
 Node before = null;

 for(int i = 0;i<length;i++){
   after = temp.next;
   temp.next = before;
   before = temp;
   temp = after;

 }
 printList();

}
}


class Batman {
  





  

  

  

    
             public static void main(String []args)  {
            Scanner sc = new Scanner(System.in);

            LinkedList myLinkedList= new LinkedList(4);
            
             myLinkedList.append(3);
             myLinkedList.append(6);

        
     
        myLinkedList.insert(0, 9);
               myLinkedList.insert(1, 0);
               myLinkedList.insert(4, 69);

       myLinkedList.printList();
               System.out.println("\n");

               myLinkedList.getHead();
               

      

       myLinkedList.reverse();
        
             
         



        

        




        
          


      
                 
               }
              }