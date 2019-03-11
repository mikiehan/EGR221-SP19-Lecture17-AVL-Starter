package avl;// AvlTree class
//
// CONSTRUCTION: with no initializer
//
// ******************PUBLIC OPERATIONS*********************
// void insert( x )       --> Insert x
// void remove( x )       --> Remove x (unimplemented)
// boolean contains( x )  --> Return true if x is present
// boolean remove( x )    --> Return true if x was present
// Comparable findMin( )  --> Return smallest item
// Comparable findMax( )  --> Return largest item
// boolean isEmpty( )     --> Return true if empty; else false
// void makeEmpty( )      --> Remove all items
// void printTree( )      --> Print tree in sorted order
// ******************ERRORS********************************
// Throws util.UnderflowException as appropriate

import bst.BinaryNode;
import bst.BinarySearchTree;

/**
 * Implements an AVL tree that extends BST
 * Note that all "matching" is based on the compareTo method.
 * @author Mikyung Han
 */
public class AVLTree<E extends Comparable<? super E>> extends BinarySearchTree<E> {
    private static final int ALLOWED_IMBALANCE = 1;

    @Override
    public void insert(E target) {
        //Implement me
    }

    @Override
    protected BinaryNode<E> insert(BinaryNode<E> targetNode, BinaryNode<E> root) {
        //Implement me
        return null; //Overwrite this code
    }

    @Override
    protected BinaryNode<E> remove(E target, BinaryNode<E> root) {
        //Implement me
        return null; //Overwrite this code
    }

    private AvlNode<E> balance(AvlNode<E> root){
        //Implement me
        return null; //Overwrite this code
    }

    private AvlNode<E> singleRotationWithLeftChild(AvlNode<E> k2){
        //Implement me
        return null; //Overwrite this code
    }

    private AvlNode<E> singleRotationWithRightChild(AvlNode<E> k1){
        //Implement me
        return null; //Overwrite this code
    }

    private AvlNode<E> doubleRotationWithLeftChild(AvlNode<E> k3) {
        //Implement me
        return null; //Overwrite this code
    }

    private AvlNode<E> doubleRotationWithRightChild(AvlNode<E> k1) {
        //Implement me
        return null; //Overwrite this code
    }

    public void checkBalance( ) {
        //Implement me
    }

    private int checkBalance( AvlNode<E> t ) {
        //Implement me
        return -1; //Overwrite this code
    }

    @Override
    protected int height(BinaryNode<E> root) {
        //Implement me
        return -1; //Overwrite this code
    }
}
