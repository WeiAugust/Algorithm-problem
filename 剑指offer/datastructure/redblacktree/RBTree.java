package redblacktree;

/**
 * @ClassName RBTree
 * @Description TODO
 * @Author wzg
 * @Date 2020/12/19 20:56
 * @Version 1.0
 **/
public class RBTree {

    private static final boolean RED = false;

    private static final boolean BLACK = true;

    private RBNode root;

    public RBNode getRoot() {
        return root;
    }

    public void setRoot(RBNode root) {
        this.root = root;
    }


    /**
     * 左旋
     * @param node
     */
    private void leftRotate(RBNode node) {
        if (node != null) {
            //右节点的左子树挂在当前节点的右子树上
            RBNode right = node.right;
            node.right = right.left;

            //如果右节点的左子树不为空，那么右节点的左子树的parent指向node节点
            if (right.left != null) {
                right.left.parent = node;
            }
            //右节点的parent指向node节点的parent
            right.parent = node.parent;

            if (node.parent == null) {
                root = right;
            } else if (node.parent.left == node) {
                node.parent.left = right;
            }else {
                node.parent.right = right;
            }
            right.left = node;
            node.parent = right;
        }
    }

    /**
     * 右旋
     * @param node
     */
    private void rightRotate(RBNode node) {
        if (node != null) {
            RBNode left = node.left;
            node.left = left.right;

            if (left.right != null) {
                left.right.parent = node;
            }
            left.parent = node.parent;

            if (node.parent == null) {
                root = left;
            }else if (node.parent.right == node) {
                node.parent.right = left;
            }else {
                node.parent.left = left;
            }
            left.right = node;
            node.parent = left;
        }
    }

    /**
     * 查找指定节点的前驱节点
     * @param node
     * @return
     */
    private RBNode predecessor(RBNode node){
        if (node == null) {
            return null;
        }
        else if (node.left != null) {
            RBNode p = node.left;
            while (p.right != null) {
                p = p.right;
            }
            return p;
        }else {
            RBNode p = node.parent;
            RBNode ch = node;
            while (p != null && ch == p.left) {
                ch = p;
                p = p.parent;
            }
            return p;
        }
    }

    static class RBNode<K extends Comparable<K>, V> {
        private RBNode parent;
        private RBNode left;
        private RBNode right;
        private boolean color;
        private K key;
        private V value;

        public RBNode() {
        }

        public RBNode(RBNode parent, K key, V value) {
            this.parent = parent;
            this.key = key;
            this.value = value;
        }

        public RBNode(RBNode parent, RBNode left, RBNode right, boolean color, K key, V value) {
            this.parent = parent;
            this.left = left;
            this.right = right;
            this.color = color;
            this.key = key;
            this.value = value;
        }

        public RBNode getParent() {
            return parent;
        }

        public void setParent(RBNode parent) {
            this.parent = parent;
        }

        public RBNode getLeft() {
            return left;
        }

        public void setLeft(RBNode left) {
            this.left = left;
        }

        public RBNode getRight() {
            return right;
        }

        public void setRight(RBNode right) {
            this.right = right;
        }

        public boolean isColor() {
            return color;
        }

        public void setColor(boolean color) {
            this.color = color;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}
