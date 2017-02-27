/**
 * Created by ashwin on 2/27/2017.
 */
public class BinarySearchTree {

    Node root = null;

    public void insert(int data){
        Node node = new Node(data);

        if(root == null){
            root = node;
            return;
        }else{
            Node currentNode = root;
            Node parentNode;
            while(true){
                parentNode = currentNode;
                if(data < currentNode.getData()){
                    currentNode = currentNode.getLeft();
                    if(currentNode == null){
                        parentNode.setLeft(node);
                        return;
                    }
                }else{
                    currentNode = currentNode.getRight();
                    if(currentNode == null){
                        parentNode.setRight(node);
                        return;
                    }
                }
            }
        }
    }

    public boolean findElement(int data){
        Node currentNode = root;
        while(currentNode != null){
            if(data < currentNode.getData()){
                currentNode = currentNode.getLeft();
            }else if(data > currentNode.getData()){
                currentNode = currentNode.getRight();
            }else{
                return true;
            }
        }
        return false;
    }

    public int findMinElement(){
        Node currentNode = root;
        while(currentNode.getLeft() != null){
            currentNode = currentNode.getLeft();
        }
        return currentNode.getData();
    }

    public int findMaxElement(){
        Node currentNode = root;
        while(currentNode.getRight() != null){
            currentNode = currentNode.getRight();
        }
        return currentNode.getData();
    }

    public void inOrderTraversal(Node root){
        if(root == null){
            return;
        }else{
            Node currentNode = root;
            inOrderTraversal(currentNode.getLeft());
            System.out.print(currentNode.getData()+" ");
            inOrderTraversal(currentNode.getRight());
        }
    }

    public void preOrderTraversal(Node root){
        if(root == null){
            return;
        }else{
            Node currentNode = root;
            System.out.print(currentNode.getData()+" ");
            preOrderTraversal(currentNode.getLeft());
            preOrderTraversal(currentNode.getRight());
        }
    }

    public void postOrderTraversal(Node root){
        if(root == null){
            return;
        }else{
            Node currentNode = root;
            postOrderTraversal(currentNode.getLeft());
            postOrderTraversal(currentNode.getRight());
            System.out.print(currentNode.getData()+" ");
        }
    }

    public void removeNode(int data){
        if(root == null){
            return;
        }else{
            Node currentNode = root;
            Node parentNode = root;
            while(currentNode.getData() != data){
                parentNode = currentNode;
                if(currentNode == null){
                    return;
                }else if(data < currentNode.getData()){
                    currentNode = currentNode.getLeft();
                }else{
                    currentNode = currentNode.getRight();
                }
            }

            if(currentNode.getLeft() == null && currentNode.getRight() == null){
                if(currentNode == root){
                    root = null;
                }
                if(parentNode.getLeft() == currentNode){
                    parentNode.setLeft(null);
                }
                if(parentNode.getRight() == currentNode){
                    parentNode.setRight(null);
                }
            }else if(currentNode.getRight() == null){
                if(currentNode == root){
                    root = currentNode.getLeft();
                }else if(parentNode.getLeft() == currentNode){
                    parentNode.setLeft(currentNode.getLeft());
                }else{
                    parentNode.setRight(currentNode.getRight());
                }
            }else if(currentNode.getLeft()!=null && currentNode.getRight()!=null){
                Node succNode = getSuccessor(currentNode);
                if(succNode == root){
                    root = succNode;
                    return;
                }else if(parentNode.getLeft() == currentNode){
                    parentNode.setLeft(succNode);
                }else{
                    parentNode.setRight(succNode);
                }
            }
        }
    }

    public Node getSuccessor(Node nodeToDelete){
        Node currentNode = nodeToDelete.getRight();
        Node succNode = null;
        Node succNodeParent = null;

        while(currentNode != null){
            succNodeParent = succNode;
            succNode = currentNode;
            currentNode = currentNode.getLeft();
        }
        if(succNode != nodeToDelete){
            succNodeParent.setLeft(succNode.getRight());
            succNode.setRight(nodeToDelete.getRight());
        }
        return succNode;
    }
}
