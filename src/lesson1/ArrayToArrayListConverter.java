package lesson1;

import java.util.ArrayList;

public class ArrayToArrayListConverter {
    public void start(){
        var stringArray = Helper.createStringArray(10);
        System.out.println("Создан массив:");
        Helper.printArray(stringArray, true);

        var arrList = convertArrayToArrayList(stringArray);
        System.out.printf("%s %s\n",arrList.getClass().getSimpleName(), arrList);
    }

    private <T> ArrayList<T> convertArrayToArrayList(T[] array){
        var out = new ArrayList<T>();
        System.out.println("Преобразовываем массив в ArrayList...");

        for(var i = 0; i < array.length; i++){
            out.add(array[i]);
        }

        return out;
    }

}
