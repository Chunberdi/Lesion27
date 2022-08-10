import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Car car1 = new Car("BWB");
        Car car2 = new Car("Toiotta");// массивди арайлистке откозуп берет
        Car car3 = new Car("Tesla");
        Car[] carsArray = {car1,car2,car3};

        ArrayList<Car> cars = new ArrayList<>(Arrays.asList(carsArray));

        for (Car car:cars){
            System.out.println(car);
        }

     /*    ArrayList<Student> stud = new ArrayList<>();
        // Student student = new Student();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        //Student1 = null;
        //Student2 = 20;
        // System3 = -20;
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList1.add(4);
        arrayList1.add(5);
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(22222);
        arrayList2.addAll(arrayList1);
        System.out.println(arrayList2);


    }


    //  тема Arraylist

        // цикл фор менен
        ArrayList<Integer> arrayList = new ArrayList<>();
       // Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arrayList.add(7);
        }
        for (int i:arrayList) {
            System.out.println(i + " ");

        }



        // Immutable - String - не изминаймый - озгоруусуз
        //StringBuilder
        //StringBuffer equals - stringpool == сылкасын текшерет
        // Cat
        // I/O Files райтер  бир файлга текст киргизебиз мисал(нело ворд)
        //FailReader ошонун ичинен окуп кансолго чыгарып берет
        //massiv [] деген бир типтуу малыматты сактайт


        //int byte short long char boolean < примитувдуу типтер ООПга байланышыжок

        Integer integer = 5;
        Short short1;
        //noinspection removal
        short1 = new Short(String.valueOf(1));
        //noinspection removal
        Character  = new Character('3');

        Car[] car = new Car[10];


        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);//3 - 4,5index
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.remove(4); // удаление
        list.add(5,1);
        list.add(3,4); // бул бир санды еки же коп чыгарып берет

       // list.clear();// маалыматты тазалайт очистка
        System.out.println(list);
        System.out.println(list.contains(4));// пот копотам текшерет
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.size());// бул 1ден баштап чыгарат
        System.out.println(list.isEmpty()); // true and false


        ArrayList<String> list2 = new ArrayList<>();


        ArrayList<Long> list1 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();*/

    }

    }
