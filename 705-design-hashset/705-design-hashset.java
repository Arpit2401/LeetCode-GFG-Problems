class Node{
    int data;
    Node next = null;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class MyHashSet {
    /** Initialize your data structure here. */
    Node head , tail;
    public MyHashSet() {
        head = tail = null;
    }
    
    public void add(int key) {
        Node temp = new Node(key);
        
        Node p = head;
        while(p != null){
            if(p.data == key)return;
            p = p.next;
        }
        
        if(head == null){
            head = tail = temp;
        }else{
            tail.next = temp;
            tail = temp;
        }
    }
    
    public void remove(int key) {
        Node p = head, q = null;
        while(p != null && p.data != key){
            q = p;
            p = p.next;
        }
        
        if(p == null)return;
        if(head.data == key){
            head = head.next;
        }else{
            q.next = p.next;
        }
        
        if(p == tail)tail = q;
        p.next = null;
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        Node p =head;
        while(p!=null){
            if(p.data == key)return true;
            p = p.next;
        }
        return false;
    }
    
}
/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */