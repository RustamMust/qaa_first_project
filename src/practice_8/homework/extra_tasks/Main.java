package practice_8.homework.extra_tasks;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Storage<String> stringStorage = new Storage<>();
        stringStorage.setElement("Хранение");
        System.out.println(stringStorage.getElement());

        Storage<Integer> integerStorage = new Storage<>();
        integerStorage.setElement(1);
        System.out.println(integerStorage.getElement());

        List<String> strings = List.of("one", "two", "three");
        List<Integer> numbers = List.of(1, 2, 3, 4);

        printList(strings);
        printList(numbers);


    }

    public static <T> void printList(List<T> elements) {
        for (T element : elements) {
            System.out.println(element);
        }
    }
}
