import java.util.LinkedList;
import java.util.List;

/*
 * Реализуйте очередь с помощью LinkedList со следующими методами:
 * enqueue() - помещает элемент в конец очереди, 
 * dequeue() - возвращает первый элемент из очереди и удаляет его, 
 * first() - возвращает первый элемент из очереди, не удаляя.
 * 
 */
public class MyClassQueue {
    private LinkedList<Object> list;

    MyClassQueue() {
        list = new LinkedList();
    }

    boolean empty() {
        return list.size() == 0;
    }

    List enqueue(Object ob) {
        list.addLast(ob);
        return list;
    }

    Object dequeue() {
        // Object ob;
        if (!empty()) {

           Object ob = list.removeFirst();
           return (Object) ob;
        }
        
        return null;

    }

    Object first() {
        if (!empty()) {
            Object ob = list.get(0);
        return ob;
        }
        return null;
    }

    void printQueue() {
        System.out.println(list);
    }
}
