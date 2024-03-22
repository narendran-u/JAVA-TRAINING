import java.util.*;


class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class BinaryTree {
    TreeNode root;

    public BinaryTree(int rootData) {
        this.root = new TreeNode(rootData);
    }

    public void insert(int newData) {
        root = insertRec(root, newData);
    }

    private TreeNode insertRec(TreeNode root, int newData) {
        if (root == null) {
            root = new TreeNode(newData);
            return root;
        }

        if (newData < root.data) {
            root.left = insertRec(root.left, newData);
        } else if (newData > root.data) {
            root.right = insertRec(root.right, newData);
        }

        return root;
    }

    public void delete(int key) {
        root = deleteRec(root, key);
    }

    private TreeNode deleteRec(TreeNode root, int key) {
        if (root == null) {
            return root;
        }
    
        if (key < root.data) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.data) {
            root.right = deleteRec(root.right, key);
        } else {
           
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
    
          
            root.data = minValue(root.right);
    
            root.right = deleteRec(root.right, root.data);
        }
    
        return root;
    }
    
    private int minValue(TreeNode root) {
        int minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }
    public void displayInOrder() {
        System.out.print("In-Order Traversal: ");
        displayInOrder(root);
        System.out.println();
    }

    private void displayInOrder(TreeNode root) {
        if (root != null) {
            displayInOrder(root.left);
            System.out.print(root.data + " ");
            displayInOrder(root.right);
        }
    }
    public void displayPreOrder() {
        System.out.print("Pre-Order Traversal: ");
        displayPreOrder(root);
        System.out.println();
    }

    private void displayPreOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            displayPreOrder(root.left);
            displayPreOrder(root.right);
        }
    }
   
    public void displayPostOrder() {
        System.out.print("Post-order Traversal: ");
        displayPostOrder(root);
        System.out.println();
    }

    private void displayPostOrder(TreeNode root) {
        if (root != null) {
            
            displayPostOrder(root.left);
            displayPostOrder(root.right);
            System.out.print(root.data + " ");
        }
    }
    public void displayBreadthFirst() {
        System.out.print("Breadth-First Traversal: ");
        displayBreadthFirst(root);
        System.out.println();
    }

    private void displayBreadthFirst(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null) {
                queue.offer(current.left);
            }
            if (current.right != null) {
                queue.offer(current.right);
            }
        }
    }
    public TreeNode lowestCommonAncestor(int p, int q) {
        if (root == null) {
            return null;
        }
        return lca(root, p, q);
    }
    
    private TreeNode lca(TreeNode root, int p, int q) {
        if (root == null) {
            return null;
    }
    
    if (p > root.data && q > root.data) {
        return lca(root.right, p, q);
    } else if (p < root.data && q < root.data) {
        return lca(root.left, p, q);
    } else {
        return root;
        }
    }
    
    public void deleteleaf()
    {
        root=deleteleafrec(root);
    }
    private TreeNode deleteleafrec(TreeNode root) {
        if (root == null) {
            return null;
        }
    
        
        if (root.left == null && root.right == null) {
            return null;
        }
    
        root.left = deleteleafrec(root.left);
        root.right = deleteleafrec(root.right);
    
        return root;
    }
    public int findShortestDistance(int node1, int node2) {
        TreeNode lca1 = lowestCommonAncestor(node1, node2);

        if (lca1 != null) {
            int distance1 = findDistanceFromNode(lca1, node1, 0);
            int distance2 = findDistanceFromNode(lca1, node2, 0);

            return distance1 + distance2;
        }

        return -1; 
    }
    private int findDistanceFromNode(TreeNode root, int target, int distance) {
        if (root == null) {
            return -1;
        }

        if (root.data == target) {
            return distance;
        }

        int leftDistance = findDistanceFromNode(root.left, target, distance + 1);
        int rightDistance = findDistanceFromNode(root.right, target, distance + 1);

        return Math.max(leftDistance, rightDistance);
    }
    
    
    
    
}
public class Btree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);
        tree.insert(12);
        tree.insert(18);

        tree.displayInOrder();
        /*tree.delete(7); 
        tree.displayInOrder();
        tree.displayBreadthFirst();
        tree.displayPreOrder();
        tree.displayPostOrder();
        
        tree.displayInOrder();*/
       
       
        System.out.println(tree.findShortestDistance(5, 18));
        }
}
