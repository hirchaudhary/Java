class SinglyLinkedList {
    public Node head;

    public SinglyLinkedList(){this.head = null;}

    public Node add(int value){
        if(this.head == null){
            this.head = new Node(value);
            return this.head;
        }
        Node ptr = this.head;
        while(ptr.next != null){
            ptr = ptr.next;
        }
        ptr.next = new Node(value);
        return ptr;
    }

    public Node remove(){
        Node ptr = this.head;
        while(ptr.next.next != null){
            ptr = ptr.next;
        }
        ptr.next = null;
        return ptr;
    }

    public void printValues(){
        Node ptr = this.head;
        while(ptr != null){
            System.out.println(ptr.value);
            ptr = ptr.next;
        }
    }

    public Node find(int val){
        if(this.head == null){
            System.out.println("Value not found!");
            return null;
        }
        Node ptr = this.head;
        while(ptr != null){
            if(ptr.value == val){
                System.out.println("Found Match!  " +ptr);
                return ptr;
            }
            ptr = ptr.next;
        }
        return ptr;
    }

    public Node removeAt(int ind){
        if(ind < 0){
            System.out.println("Out of Index!");
            return null;
        }
        int counter = 0;
        Node ptr = this.head;
        while(ptr != null){
            if(counter == ind){
                ptr = ptr.next.next;
                System.out.println("Removed value At " +ind);
            }
            counter++;
            ptr = ptr.next;
        }
        return ptr;
    }
}
