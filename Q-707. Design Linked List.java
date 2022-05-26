// https://leetcode.com/problems/design-linked-list/
class MyLinkedList {
    public static class Node {
        int val;
        Node next;
        Node prev;  
    }
    Node head , tail;
    int size;

    public MyLinkedList() {
        
    }
    
    public int get(int index) {
        
    }
    
    public void addAtHead(int val) {
        Node node = new Node ();
        node.val = val;
        
        if (this.size == 0){
            this.head = this.tail = node;
        }else{
            node.next = this.head;
            this.head.prev=node;
            this.head = node;   
        }
        this.size++;
    }
    
    public void addAtTail(int val) {
        
    }
    
    public void addAtIndex(int index, int val) {
        
    }
    
    public void deleteAtIndex(int index) {
        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */