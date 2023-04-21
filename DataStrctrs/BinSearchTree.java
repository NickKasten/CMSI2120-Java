public class BinSearchTree {
    
    private TreeNode root;
    private int size = 0;

    BinSearchTree() {
        this.root = null;
        size = 0;
    }

    BinSearchTree(int x) {
        this.root = new TreeNode(x);
        size = 1;
    }

    public void insert(int item) {
        // check for if we are starting
        if (size == 0) {
            this.root = new TreeNode(item);
            this.size ++;
        } else {
            TreeNode trav = root;
            if ((trav.getLeft() == null) && (trav.getRight() == null)) {
                
            } else if (item < trav.getData()) {
                trav = trav.getLeft();
            } else if (item > trav.getData()) {

            }
        } 

    };

    public int delete(int index) {
        return root.getData();
    };

    public int search(int item) {
        return 0;
    };


}
