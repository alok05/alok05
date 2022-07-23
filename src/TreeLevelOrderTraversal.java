// Iterative Queue based Java program
// to do level order traversal
// of Binary Tree

/* importing the inbuilt java classes
required for the program */

import java.util.LinkedList;
import java.util.Queue;

/* Class to print Level Order Traversal */
class TreeLevelOrderTraversal {

  Node root;
  /* Given a binary tree. Print
  its nodes in level order
  using array for implementing queue
   */
  /* For each node, first, the node is visited and then it’s child nodes are put in a FIFO queue.

  printLevelorder(tree)
   1) Create an empty queue q
   2) temp_node = root /*start from root*
   3) Loop while temp_node is not NULL
   a) print temp_node->data.
      b) Enqueue temp_node’s children
      (first left then right children) to q
   c) Dequeue a node from q.
      Implementation: Here is a simple implementation of the above algorithm.
    The queue is implemented using an array with a maximum size of 500. We can implement
    a queue as a linked list also.
    Time Complexity: O(n) where n is the number of nodes in the binary tree.
    Auxiliary Space: O(n) where n is the number of nodes in the binary tree.
   */
  void printLevelOrder() {
    Queue<Node> queue = new LinkedList<Node>();
    queue.add(root);
    while (!queue.isEmpty()) {

			/* poll() removes the present head.
			For more information on poll() visit
			http://www.tutorialspoint.com/java/
			util/linkedlist_poll.htm */
      Node tempNode = queue.poll();
      System.out.print(tempNode.data + " ");

      /*Enqueue left child */
      if (tempNode.left != null) {
        queue.add(tempNode.left);
      }

      /*Enqueue right child */
      if (tempNode.right != null) {
        queue.add(tempNode.right);
      }
    }
  }

  public static void main(String[] args) {
		/* creating a binary tree and entering
		the nodes */
    TreeLevelOrderTraversal tree_level = new TreeLevelOrderTraversal();
    tree_level.root = new Node(1);
    tree_level.root.left = new Node(2);
    tree_level.root.right = new Node(3);
    tree_level.root.left.left = new Node(4);
    tree_level.root.left.right = new Node(5);

    System.out.println("Level order traversal of binary tree is - ");
    tree_level.printLevelOrder();
  }
}
