/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarytree;
import java.util.LinkedList;
import java.util.Queue;
public class BinaryTree {
    public TreeNode root;

    public BinaryTree(int val) {
    root=new TreeNode(val);
    }
    public void addchild(TreeNode parent,TreeNode rightchild,TreeNode leftclid){
        if(parent!=null){
            if(leftclid!=null){
                 parent.left=leftclid;  
            }
             if(rightchild!=null){
                 parent.right=rightchild;
            }      
        }
    }
    public void Inordertrevers(TreeNode node){
        if(node!=null){
            Inordertrevers(node.left);
            System.out.print(node.data+"--->");
            Inordertrevers(node.right);
        }
      }
      public void Preordertrevers(TreeNode node){
        if(node!=null){
            System.out.print(node.data+"--->");
            Preordertrevers(node.left);
            Preordertrevers(node.right);
        }
    }
          public void Postordertrevers(TreeNode node){
        if(node!=null){ 
            Postordertrevers(node.left);
            Postordertrevers(node.right);
            System.out.print(node.data+"--->");
        }
    }
    public void Lineordertreverse(){
        if(root==null){
            return;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node=queue.poll();
            System.out.print(node.data + "--->");
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
        }
             
    }
    public int countNodes(TreeNode node) {
    if (node == null) {
        return 0;
    }
  
    return 1 + countNodes(node.left) + countNodes(node.right);
}
    public static void main(String[] args) {
    BinaryTree b1=new BinaryTree(10);
    //Level one child
    TreeNode leftchild=new TreeNode(20);
    TreeNode rightchild=new TreeNode(30);
     b1.addchild(b1.root,rightchild,leftchild);
    //Level Two child
     TreeNode leftLeftChild = new TreeNode(40);
     TreeNode leftRightChild = new TreeNode(50);
     b1.addchild(leftchild,leftRightChild,leftLeftChild);
    TreeNode rightLeftChild = new TreeNode(60);
    TreeNode rightRightChild = new TreeNode(70);
   b1.addchild(rightchild, rightRightChild, rightLeftChild);
   b1.Lineordertreverse(); 
   System.out.println(""); 
   b1.Inordertrevers(b1.root);
        System.out.println("");
   b1.Postordertrevers(b1.root);
        System.out.println("");
   b1.Preordertrevers(b1.root);
        System.out.println("");
        System.out.println("No of Nodes: "+b1.countNodes(b1.root));
        
    }
}
