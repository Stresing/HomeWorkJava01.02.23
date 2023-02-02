import java.util.LinkedList;
import java.util.List;

public class MyClassList {
    private LinkedList<Object> list;

    MyClassList() {
        list = new LinkedList();
    }

    int size() {
        return list.size();
    }

    boolean empty() {
        return list.size() == 0;
    }

    void push(int element) {
        list.add(element);
    }

    List coppy(List someList) {
        LinkedList newList = new LinkedList<>();
        for (Object object : list) {
            someList.add(object);
        }
        return someList;

    }

    Object myReverse() {
        int count = list.size() - 1;
        LinkedList newList = new LinkedList<>();
        coppy(newList);
        for (int i = 0; i < list.size(); i++) {
            newList.set(count, list.get(i));
            count--;
        }
        return newList;
    }
}
