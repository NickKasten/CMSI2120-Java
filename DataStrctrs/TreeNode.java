public class TreeNode {
    private int s;
    private TreeNode left;
    private TreeNode right;

    TreeNode() {
        this.s = 0;
        this.left = null;
        this.right = null;
    }

    TreeNode(int data) {
        this.s = data;
        this.left = null;
        this.right = null;
    }

    public void setRight(int data) {
        TreeNode n = new TreeNode(data);
        this.right = n;
    }

    public TreeNode getRight() {
        return this.right;
    }

    public void setLeft(int data) {
        TreeNode n = new TreeNode(data);
        this.right = n;
    }

    public TreeNode getLeft() {
        return this.left;
    }

    public int getData() {
        return this.s;
    }
}
