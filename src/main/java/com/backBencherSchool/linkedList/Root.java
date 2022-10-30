package com.backBencherSchool.linkedList;

class Node{
    protected Integer data;
    protected Node next;

    public Node(Integer data) {
        this.data = data;
        this.next = null;
    }
}

class LinkList{
    public Node addFirstPosition(Node head, Integer data){
        if (head == null){
            return new Node(data);
        }
        Node newHead = new Node(data);
        newHead.next = head;
        return newHead;
    }

    public Node addLastPosition(Node head, Integer data){
        if (head == null){
            return new Node(data);
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(data);
        return head;

    }

    public Node addMiddlePosition(Node head, Integer data, Integer position){
        if (position == 1 ){
            Node node = new Node(data);
            node.next = head;
            return node;
        }
        Node temp = head;
//        position--;
        while (temp != null){
            position--;
            if (position == 1){
                break;
            }
            temp = temp.next;

        }
        if (position == 1){
            Node newNode = new Node(data);
            newNode.next = temp.next;
            temp.next = newNode;
        }
        return head;
    }

    public void print(Node head){
        while (head != null){
            System.out.print(head.data+", ");
            head = head.next;
        }
    }
}


public class Root {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        Node root = null;
        root = linkList.addLastPosition(root, 1);
        root = linkList.addLastPosition(root, 2);
        root = linkList.addLastPosition(root, 3);
        root = linkList.addLastPosition(root, 4);
        root = linkList.addMiddlePosition(root, 5, 1);

        linkList.print(root);

        Integer a = null;
        System.out.println(a+"10");
    }
}
