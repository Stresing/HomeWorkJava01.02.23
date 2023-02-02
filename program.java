import java.util.*;

import someList.listIterator;

public class program {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task3();

    }

    /*
     * Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке.
     * Используйте итератор
     */
    static void task3() {
        LinkedList<Integer> someList = new LinkedList<>();
        someList = randomLinkedArray(0, 10, 10);
        System.out.println(someList);
        int sum = 0;
        for (Integer i : someList) {
            sum = sum + i;
        }
        System.out.println(sum);

    }

    /*
     * Реализуйте очередь с помощью LinkedList со следующими методами:
     * enqueue() - помещает элемент в конец очереди,
     * dequeue() - возвращает первый элемент из очереди и удаляет его,
     * first() - возвращает первый элемент из очереди, не удаляя.
     * 
     */
    static void task2() {

        MyClassQueue myQueue = new MyClassQueue();

        myQueue.enqueue(5);
        myQueue.enqueue(6);
        myQueue.enqueue(7);
        myQueue.enqueue(8);
        myQueue.printQueue();
        System.out.println(myQueue.dequeue());
        myQueue.printQueue();
        System.out.println(myQueue.first());
        System.out.println(myQueue.dequeue());
        myQueue.printQueue();
        myQueue.enqueue(1);
        myQueue.enqueue(4);
        myQueue.enqueue(3);
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        myQueue.printQueue();
    }

    /*
     * Пусть дан LinkedList с несколькими элементами. Реализуйте метод,
     * который вернет “перевернутый” список.
     */
    static void task1() {

        LinkedList<Integer> someList = new LinkedList<>();
        MyClassList myClass = new MyClassList();
        someList = randomLinkedArray(0, 10, 10);
        System.out.println("Изначальный список: " + someList);

        for (Integer i : someList) {
            myClass.push(i);
        }
        System.out.println("Обратный список: " + myClass.myReverse());

    }

    static LinkedList<Integer> randomLinkedArray(int first, int end, int n) {
        LinkedList<Integer> someList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            someList.add(random.nextInt(1, 10));
        }
        return (LinkedList<Integer>) someList;
    }
}
