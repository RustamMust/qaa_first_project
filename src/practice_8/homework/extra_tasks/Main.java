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

        NumberBox<Integer> integerNumberBox = new NumberBox<>();
        integerNumberBox.addNumber(1);
        integerNumberBox.addNumber(2);
        integerNumberBox.addNumber(3);

        System.out.println("Sum of numbers: " + integerNumberBox.getSum());

        NumberBox<Double> doubleNumberBox = new NumberBox<>();
        doubleNumberBox.addNumber(1.5);
        doubleNumberBox.addNumber(2.5);
        doubleNumberBox.addNumber(3.5);
        doubleNumberBox.addNumber(4.1);

        System.out.println("Sum of numbers: " + doubleNumberBox.getSum());

    }

    public static <T> void printList(List<T> elements) {
        for (T element : elements) {
            System.out.println(element);
        }
    }
}
