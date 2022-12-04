import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее арифметичское этого списка.
public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(22);
        list.add(3);
        list.add(26);
        list.add(26);
        list.add(102);
        System.out.print(list);
        System.out.println();
        int max = list.get(0);
        int min= list.get(0);
        int middle = 0;
        for (Integer val : list) {
            if ( val > max) {
                max = val;
            }
            if ( val < min) {
                min = val;
            }
            middle = middle+val;
        }
        middle = middle /list.size();


        System.out.printf("max = %d, min = %d, middle = %d",max, min, middle);
    }
}

