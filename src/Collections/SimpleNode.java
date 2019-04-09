package Collections;

public class SimpleNode<T> {

    //Atributos 
    SimpleNode<T> next;
    SimpleNode<T> previous;
    T value;

    //Constructores
    public SimpleNode(SimpleNode<T> next, T value, SimpleNode<T> previous) {
        this.next = next;
        this.value = value;
        this.previous = previous;
    }

    public SimpleNode(SimpleNode<T> next, T value){
        this.next = next;
        this.value = value;
    }
    
    public SimpleNode(T value){
        this.value = value;
    }
    
    public SimpleNode() {
    }

    //Getters y setters del siguente, anterior y valor.
    public SimpleNode<T> getNext() {
        return next;
    }

    public void setNext(SimpleNode<T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public SimpleNode<T> getPrevious() {
        return previous;
    }

    public void setPrevious(SimpleNode<T> previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return "SimpleNode{" + "value=" + value +'}';
    }
    
    
}