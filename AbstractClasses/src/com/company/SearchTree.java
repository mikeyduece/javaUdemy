package com.company;

import java.util.List;

public class SearchTree implements NodeList {
    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (this.root == null) {
            this.root = item;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison < 0) {
                //item is greater, move right if possible
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // there's no node to the right so add at this point
                    currentItem.setNext(item);
                    return true;
                }
            } else if (comparison > 0) {
                //item is less, move left if possible
                if (currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                } else {
                    currentItem.setPrevious(item);
                    return true;
                }
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) System.out.println("Deleting item: " + item.getValue());
        ListItem currentItem = this.root;
        ListItem parentItem = currentItem;

        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison < 0) {
                parentItem = currentItem;
                currentItem = currentItem.next();
            } else if (comparison > 0) {
                parentItem = currentItem;
                currentItem = currentItem.previous();
            } else {
                performRemoval(currentItem, parentItem);
                return true;
            }

        }
        return false;
    }

    public void performRemoval(ListItem item, ListItem parent) {
        //remove item
        if (item.next() == null) {
            // no right tree, so make parent point to left tree which may be null
            if (parent.next() == item) {
                // item is right child of it's parent
                parent.setNext(item.previous());
            } else if (parent.previous() == item) {
//                item is left chiled of its parent
                parent.setPrevious(item.previous());
            } else {
//                parent must be item, which means we were looking at the root of the tree
                this.root = item.previous();
            }
        } else if (item.previous() == null) {
//            no left tree, so make parent point to right tree(which may be null)
            if (parent.next() == item) {
//                item is right child of its parent
                parent.setNext(item.next());
            } else if (parent.previous() == item) {
//                item is left child of its parent
                parent.setPrevious(item.next());
            } else {
//                parent must be item, which means we were looking at the root of the tree
                this.root = item.next();
            }
        } else {
//            neither left nor right are null, deletion is not a lot trickier!
//        From the right subtree, find the smallest value(ie the leftmost
            ListItem current = item.next();
            ListItem leftMostParent = item;
            while(current.previous() != null) {
                leftMostParent = current;
                current = current.previous();
            }

            item.setValue(current.getValue());
            if(leftMostParent == item) {
                item.setNext(current.next());
            } else {
                leftMostParent.setPrevious(current.next());
            }
        }

    }

    @Override
    public void traverse(ListItem root) {
        //recursive
        if (root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}
