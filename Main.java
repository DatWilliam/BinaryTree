import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        Node node = new Node("d");
        Tree tree = new Tree(node);

        String temp;

        System.out.println("enter a string or enter \"exit\" to exit");

        do{
            temp = scan.next();
            if(!temp.equals("exit")){
                tree.add(tree.root, temp);
            }
        } while(!temp.equals("exit"));

        tree.in_order(tree.root);

    }
}
