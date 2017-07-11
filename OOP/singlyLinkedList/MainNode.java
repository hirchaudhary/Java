class MainNode {
    public static void main(String[] args) {
        SinglyLinkedList obj = new SinglyLinkedList();
        obj.add(10);
        obj.add(12);
        obj.add(43);
        obj.add(23);
        obj.add(7);
        obj.remove();
        obj.printValues();
        obj.find(3);
        obj.removeAt(1);
    }
}
