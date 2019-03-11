package bst;// bst.BinarySearchTree class
//
// CONSTRUCTION: with no initializer
//
// ******************PUBLIC OPERATIONS*********************
// void insert( x )       --> Insert x
// void remove( x )       --> Remove x
// boolean contains( x )  --> Return true if x is present
// Comparable findMin( )  --> Return smallest item
// Comparable findMax( )  --> Return largest item
// boolean isEmpty( )     --> Return true if empty; else false
// void makeEmpty( )      --> Remove all items
// void printTree( )      --> Print tree in sorted order
// ******************ERRORS********************************
// Throws util.UnderflowException as appropriate

import avl.AvlNode;
import util.UnderflowException;

/**
 * Implements an unbalanced binary search tree.
 * Note that all "matching" is based on the compareTo method.
 * @author Mark Allen Weiss, Mi Kyung Han
 */
public class BinarySearchTree<E extends Comparable<? super E>>
{
    /** The tree overallRoot. */
    protected BinaryNode<E> overallRoot;

    /**
     * Construct the tree.
     */
    public BinarySearchTree() {
        overallRoot = null;
    }

    /**
     * Remove from the tree. Nothing is done if x is not found.
     * @param target the item to remove.
     */
    public void remove(E target) {
        //Implement me
    }

    protected BinaryNode<E> remove(E target, BinaryNode<E> root){
        //Implement me
        return null; //replace this code
    }

    /**
     * Insert into the tree; duplicates are ignored.
     * @param target the item to insert.
     */
    public void insert(E target) {
        //Implement me
    }

    /**
     * @param targetNode the node to insert that has target data
     * @param root the node that roots the subtree
     * @return the new overallRoot of the subtree
     */
    protected BinaryNode<E> insert(BinaryNode<E> targetNode, BinaryNode<E> root){
        //Implement me
        return null; //overwrite this code
    }

    /**
     * Find the height of the tree
     */
    public int height() {
        //Implement me
        return 0; //overwrite this code
    }

    protected int height(BinaryNode<E> root){
        //Implement me!
        return 0; //overwrite this code
    }

    /**
     * Find the smallest item in the tree.
     * @return smallest item or null if empty.
     */
    public E findMin() {
        if(isEmpty( ))
            throw new UnderflowException();
        return null; //Overwrite this code
    }

    private E findMin(BinaryNode<E> root){
        //Implement me
        return null; //Overwrite this code
    }

    /**
     * Find the largest item in the tree.
     * @return the largest item of null if empty.
     */
    public E findMax() {
        if(isEmpty( ))
            throw new UnderflowException( );
        return null; //Overwrite this code
    }

    private E findMax(BinaryNode<E> root){
        //Implement me
        return null; //Overwrite this code
    }

    /**
     * Find an item in the tree.
     * @param target the item to search for.
     * @return true if not found.
     */
    public boolean contains(E target) {
        //Implement me
        return false; //overwrite this code!
    }

    private boolean contains(E target, BinaryNode<E> root){
        //Implement me
        return false; //Overwrite this code!
    }

    /**
     * Make the tree logically empty.
     */
    public void makeEmpty() {
        overallRoot = null;
    }

    /**
     * Test if the tree is logically empty.
     * @return true if empty, false otherwise.
     */
    public boolean isEmpty() {
        return overallRoot == null;
    }

    /**
     * Print the tree contents in sorted order.
     */
    public void printTree() {
        if( isEmpty( ) )
            System.out.println( "Empty tree" );
        else
            printTree(overallRoot); //call helper method
    }

    /**
     * Implement this helper method
     * Internal method to print a subtree in sorted order. (traverse in-order)
     * @param t the node that roots the subtree.
     */
    private void printTree(BinaryNode<E> t) {
        if(t != null){
            printTree(t.left);
            System.out.println(t.data);
            printTree(t.right);
        }
    }

}
