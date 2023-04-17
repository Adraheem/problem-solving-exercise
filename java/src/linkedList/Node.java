package linkedList;

public class Node<T> {
    private T data;
    private Node<T> link;

    public T getData(){
        return data;
    }

    public Node<T> next(){
        return link;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setLink(Node<T> link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
