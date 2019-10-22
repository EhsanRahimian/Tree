
public class Node {

    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (value <= data) {
            if (left == null) {
                left = new Node(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new Node(value);
            } else {
                right.insert(value);
            }
        }
    }

    public boolean contains(int value) {
        if (value == data) {
            return true;
        } else if (value < data) {
            if (left == null) {
                return false;

            } else {
                return left.contains(value);
            }
        } else {
            if (right == null) {
                return false;
            } else {
                return right.contains(value);
            }
        }
    }

    public void prinInOrder() {
        if (left != null) {
            left.prinInOrder();
        }
        System.out.println(data);
        if (right != null) {
            right.prinInOrder();
        }
    }

    public void prinPreOrder() {
        System.out.println(data);
        if (left != null) {
            left.prinPreOrder();
        }

        if (right != null) {
            right.prinPreOrder();
        }
    }

    public void prinPostOrder() {

        if (left != null) {
            left.prinPostOrder();
        }

        if (right != null) {
            right.prinPostOrder();
        }
        System.out.println(data);
    }
    
    public static void main(String args[]){
    }

}
