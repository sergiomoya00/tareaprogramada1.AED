package Collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LQueue<T> implements List<T> {

    private NodeSimpleLinkedList<T> front;
    private NodeSimpleLinkedList<T> rear;
    private int size;

    public LQueue() {
        this.front = new NodeSimpleLinkedList<>();
        this.rear = this.front;
        this.size = 0;
    }

    public void enqueue(T value) {
        this.rear.setNext(new NodeSimpleLinkedList<>(null, value));
        this.rear = rear.getNext();
        this.size++;
    }

    public T dequeue() {
        if (this.size == 0) {
            System.out.println("Queue is empty");
            return null;
        }
        T temp = this.front.getNext().getValue();
        NodeSimpleLinkedList<T> nTemp = this.front.getNext();
        this.front.setNext(nTemp.getNext());
        if (this.rear == nTemp) {
            this.rear = this.front;
        }
        this.size--;
        return temp;
    }

    public Object first() {
        if (this.size == 0) {
            System.out.println("Queue is empty");
            return null;
        }
        return this.front.getNext().getValue();
    }

    public int size() {
        return this.size;
    }

    public void clear() {
        this.front = new NodeSimpleLinkedList<>();
        this.rear = this.front;
        this.size = 0;
    }

    public String toString() {
        String result = "LQueue\n";
        NodeSimpleLinkedList<T> tFront = this.front;
        int tSize = this.size;
        while (tSize != 0) {
            result += tFront.getNext().getValue() + " ";
            tFront = tFront.getNext();
            tSize--;
        }
        return result;
    }

    public void rotate() {
        if (this.size == 0) {
            System.out.println("Queue is empty");
        } else {
            NodeSimpleLinkedList<T> current = this.front.getNext();
            NodeSimpleLinkedList<T> temp = null;
            NodeSimpleLinkedList<T> newRear = null;
            while (current != null) {
                if (current == this.front.getNext()) {
                    temp = new NodeSimpleLinkedList<T>(null, current.getValue());
                    newRear = temp;
                } else if (current == this.rear) {
                    temp = new NodeSimpleLinkedList<T>(temp, current.getValue());
                    this.front.setNext(temp);
                } else {
                    temp = new NodeSimpleLinkedList<T>(temp, current.getValue());
                }
                current = current.getNext();
            }
            this.rear = newRear;
        }
    }

    public void rotate2() {
        if (this.size == 0) {
            System.out.println("Queue is empty");
        } else {
            NodeSimpleLinkedList<T> next = this.front.getNext();
            NodeSimpleLinkedList<T> afterNext = next.getNext();
            NodeSimpleLinkedList<T> temp = null;

            while (afterNext != null) {
                if (next == this.front.getNext()) {
                    next.setNext(null);
                    this.front.setNext(this.rear);
                    this.rear = next;
                }
                temp = afterNext.getNext();
                afterNext.setNext(next);
                next = afterNext;
                afterNext = temp;
            }

        }
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return false;
        }
        return false;
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator<T> iterator() {

        return new Iterator<T>() {
            NodeSimpleLinkedList<T> current = front.getNext();

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                T result = current.getValue();
                current = current.getNext();
                return result;
            }
        };
    }


@Override
        public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
        public <T> T[] toArray(T[] ts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
        public boolean add(T e) {
        this.enqueue(e);
        return true;
    }

    @Override
        public boolean remove(Object o) {
        this.dequeue();
        return true;
    }

    @Override
        public boolean containsAll(Collection<?> clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
        public boolean addAll(Collection<? extends T> clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
        public boolean addAll(int i, Collection<? extends T> clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
        public boolean removeAll(Collection<?> clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
        public boolean retainAll(Collection<?> clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
        public T get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
        public T set(int i, T e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
        public void add(int i, T e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
        public T remove(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
        public int indexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
        public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
        public ListIterator<T> listIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
        public ListIterator<T> listIterator(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
        public List<T> subList(int i, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}