package practice_7.homework;

public class Main {
    public static void main(String[] args) {
        ArrayListAddNumber arrayListAddNumber = new ArrayListAddNumber();

        arrayListAddNumber.printArrayList();

        arrayListAddNumber.addNewNumberInList(6);
        arrayListAddNumber.printArrayList();


        ArrayListEvenNumber arrayListEvenNumber = new ArrayListEvenNumber();
        arrayListEvenNumber.addNumberToArrayList(6);
        arrayListEvenNumber.addNumberToArrayList(10);
        arrayListEvenNumber.addNumberToArrayList(3);
        arrayListEvenNumber.addNumberToArrayList(5);
        arrayListEvenNumber.addNumberToArrayList(4);
        arrayListEvenNumber.addNumberToArrayList(7);

        arrayListEvenNumber.printArrayListEvenNumber();

        arrayListEvenNumber.printAllEvenNumbers();


    }
}
