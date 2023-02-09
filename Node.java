class Node {
    public String name;
    public Node next;
    public Node previous;

    Node() {
        this.name = "**emtpy**";
        this.next = null;
        this.previous = null;
    }
    // "overloading" the constructor
    Node(String s) {
        this.name = s;
        this.next = null;
        this.previous = null;
    }
    


}
