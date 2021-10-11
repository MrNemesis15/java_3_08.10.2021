package hw1;

import hw1.fruits.Apple;
import hw1.fruits.Fruit;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }

   public static <T> ArrayList<T> arrayToList(T[] arr){
        return new ArrayList<> (Arrays.asList(arr));
   }

   public static void swapElements(Object[] arr, int index1, int index2){
        Object obj = arr[index1];
        arr[index1] = arr [index2];
        arr[index2] = obj;
   }

   public static <T> void swap1(T[] arr, int index1, int index2 ){
        T obj = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = obj;
   }


}

//Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
//Написать метод, который преобразует массив в ArrayList;

//Задача:
//Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
//Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
//Для хранения фруктов внутри коробки можно использовать ArrayList;
//Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
//Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
//Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
//Не забываем про метод добавления фрукта в коробку.