package linkedList;

import java.util.Collection;

public class LinkedList<T> {
    private Node<T> head;

    public void add(T data) {
        Node<T> newNode = new Node<>();
        newNode.setData(data);

        if (head == null) {
            head = newNode;
        } else {
            insertAtTail(data);
        }
    }

    public void insertAtTail(T data) {
        if (head == null) {
            this.add(data);
        } else {
            Node<T> newNode = new Node<>();
            newNode.setData(data);

            this.getTail().setLink(newNode);
        }
    }

    public void insertAtHead(T data) {
        if (head == null) {
            this.add(data);
        } else {
            Node<T> newNode = new Node<>();
            newNode.setData(data);
            newNode.setLink(this.head);

            this.head = newNode;
        }
    }

    public int size() {
        int length = 0;
        Node<T> pointer = head;
        while (pointer != null) {
            pointer = pointer.next();
            length++;
        }
        return length;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public Node<T> getHead() {
        return this.head;
    }

    public Node<T> getTail() {
        Node<T> pointer = head;
        while (pointer.next() != null) {
            pointer = pointer.next();
        }
        return pointer;
    }

    public void delete(T data) {
        int size = this.size();
        int i = 0;
        Node<T> pointer = head;
        while (i < size) {
            if (pointer.getData().equals(data)) {
                if (i == 0) {
                    deleteAtHead();
                } else if (i == size - 1) {
                    deleteAtTail();
                } else {
                    this.get(i - 1).setLink(this.get(i + 1));
                }
                break;
            }
            pointer = pointer.next();
            i++;
        }
    }

    public void deleteAtHead() {
        if (head != null) {
            head = head.next();
        }
    }

    public void deleteAtTail() {
        try {
            Node<T> preTail = this.get(this.size() - 2);
            if (preTail != null) {
                preTail.setLink(null);
            }
        } catch (Exception ignored) {
        }
    }

    public Node<T> get(int index) {
        if (index >= this.size() || index < 0) {
            throw new IndexOutOfBoundsException("Index out of bound");
        }

        int i = 0;
        Node<T> pointer = head;
        while (i < index) {
            pointer = pointer.next();
            i++;
        }
        return pointer;
    }

    public Node<T> search(T data) {
        int size = this.size();
        int i = 0;
        Node<T> pointer = head;
        while (i < size) {
            if (pointer.getData().equals(data)) {
                break;
            }
            pointer = pointer.next();
            i++;
        }
        return pointer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("LinkedList{");
        Node<T> pointer = head;
        while (pointer != null) {
            if (!pointer.equals(head)) {
                sb.append("->");
            }
            sb.append(pointer.toString());
            pointer = pointer.next();
        }
        sb.append("}");
        return sb.toString();
    }
}
