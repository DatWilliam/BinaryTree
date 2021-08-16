public class Tree {
    Node root;

    Tree(Node root){
        this.root = root;
    }

    public void add(Node temp_root, String data){

        if(root.data.charAt(0) > data.charAt(0)){

            if(temp_root.left == null){
                temp_root.left = new Node(data);
            } else {
                add(temp_root.left, data);
            }

        } else {

            if(temp_root.right == null){
                temp_root.right = new Node(data);
            } else {
                add(temp_root.right, data);
            }

        }
    }

    //WIP
    public void in_order(Node temp_root){

        if(temp_root != null){

            if(temp_root.left == null){
                System.out.println(" - ");
            } else {
                in_order(temp_root.left);
            }

            System.out.println(" " + temp_root.data + " ");

            if(temp_root.right == null){
                System.out.println(" - ");
            } else {
                in_order(temp_root.right);
            }

        } else {
            System.out.println(" - ");
        }
    }
}
