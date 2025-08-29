package practice_7.homework.linked_list;

public class Main {
    public static void main(String[] args) {
        AddStrings addStrings = new AddStrings();
        addStrings.addStringToList("a");
        addStrings.addStringToList("ertt");
        addStrings.addStringToList("sssererer");

        addStrings.printAllElementsFromList();

        QueueWithTasks queue = new QueueWithTasks();

        queue.addTaskToQueue("firstTask");
        queue.addTaskToQueue("secondTask");
        queue.addTaskToQueue("thirdTask");

        queue.processWithTasks();
    }
}
