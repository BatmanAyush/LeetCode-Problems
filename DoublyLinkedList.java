public class DoublyLinkedList {
  private Node head;
  private Node tail;
  private int length;
  class Node{
    int value;
    Node next;
    Node prev;
    Node(int value){
        this.value = value;
    }
  } 
  public DoublyLinkedList(int value){
        Node newNode =  new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
  }
  public void printList() {
    Node temp = head;
    while (temp != null) {
        System.out.println(temp.value);
        temp = temp.next;
    }
}

public void getHead() {
    if (head == null) {
        System.out.println("Head: null");
    } else {
        System.out.println("Head: " + head.value);
    }
}

public void getTail() {
    if (head == null) {
        System.out.println("Tail: null");
    } else {
        System.out.println("Tail: " + tail.value);
    }
}

public void getLength() {
    System.out.println("Length: " + length);
}

public void append(int value){
Node newNode = new Node(value);
if(length==0){
    head = newNode;
    tail = newNode;
}
else{
    tail.next = newNode;
    newNode.prev = tail;
    tail = newNode;
}
length++;
}
public void removeLast(){
if(length==1){
    head = null;
    tail = null;
}
Node temp = tail;
tail = temp.prev;
tail.next = null;
temp.prev = null;
length--;
}
public void prepend(int value){
    Node newNode = new Node(value);
    if(length == 0){
        head = newNode;
        tail = newNode;
        
    }
   else{ newNode.next = head;
    head.prev = newNode;
    head = newNode;
   }
    length++;
}
public void removeFirst(){
    
    if(length==1){
        head = null;
        tail = null;
    }
    else{
Node temp = head;
head = temp.next;
head.prev = null;
temp.next = null;

    }
    length--;
}
public Node get(int index){
    if (index < 0 || index >= length) {
        return null; // Return null if index is invalid
    }

    Node temp = head;
    for (int i = 0; i < index; i++) {
        temp = temp.next;
    }
    return temp;
}
public void justRemove(int index){

if(index<0 || index>length-1){
    System.out.println("Invalid");
}
else if(index == 0){
    removeFirst();

}
else if(index == length - 1){
    removeLast();
}
else{
        Node temp = get(index);
    Node temp1 = temp.next;
    Node temp2 = temp.prev;
    temp.next = null;
    temp1.prev = null;
    temp.prev = null;

    temp2.next = temp1;
    temp1.prev = temp2;
    length--;

}

}
public boolean set(int index, int value){
  if(index<0 || index>length-1){
    return false;
}
else if(index== length -1){
    Node newNode = new Node(value);
    Node before = get(index-1);
    removeLast();
    before.next=newNode;
    newNode.prev=before;
    length++;
    return true;

}
else if(index!=0){
    Node newNode =  new Node(value);
    Node temp = get(index-1);
    Node temp1 = get(index+1);
    justRemove(index);
    
    temp.next= newNode;
   temp1.prev = newNode;
   newNode.prev = temp;
   newNode.next = temp1;
   length++;
    return true;
    
}
else if(index ==0){
    Node newNode = new Node(value);
    Node after = get(index+1);
    justRemove(index);
    newNode.next =  after;
    after.prev = newNode;
    length++;
    head = newNode;
    return true;

}

return false;
}
}
class Bruce{
public static void main(String[] args) {
    DoublyLinkedList myDLL = new DoublyLinkedList(7);

       myDLL.append(2);
       myDLL.append(0);
       myDLL.append(9);
        System.out.println("\nDoubly Linked List:");
        myDLL.prepend(1);

        myDLL.printList();

        myDLL.set(1, 3);
           System.out.println("\nDoubly Linked List:");
        myDLL.printList();
        

}

}