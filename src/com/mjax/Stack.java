package com.mjax;

public class Stack implements StackInterface {
    private Node head;
    private int items = 0;

    @Override
    public void print() {
        String str = "[";

        Node currentNode = head;
        while (currentNode != null){
            str += " \'" + currentNode.getValue() + "\',";
            currentNode = currentNode.getNextNode();
        }

        System.out.println(str.replaceAll(",$", " ") + "]");
    }

    @Override
    public void numOfItems() {
        if (items == 0) System.out.println("There are no items in your Stack.");
        else System.out.println(items);
    }

    @Override
    public void push(String value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node currentNode = head;
            while (currentNode.getNextNode() != null){
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(new Node(value));
        }
        items++;
    }

    @Override
    public String pop() {
        if (head == null) return null;

        items--;
        String temp;
        if (head.getNextNode() == null) {
            temp = head.getValue();
            head = null;
            return temp;
        }
        Node currentNode = head;
        while (currentNode.getNextNode().getNextNode() != null){
            currentNode = currentNode.getNextNode();
        }
        temp = currentNode.getNextNode().getValue();
        currentNode.setNextNode(null);
        return temp;
    }

}
