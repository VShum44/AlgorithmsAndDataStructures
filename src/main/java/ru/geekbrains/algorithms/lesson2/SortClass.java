package ru.geekbrains.algorithms.lesson2;

public class SortClass  {



    public void selectionSort(int [] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (less(arr[j], arr[min])) {
                    min = j;
                }
            }

            replace(arr, i, min);
        }
    }


    public void insertSort(int [] arr){
        int buf;
        for (int i = 1; i < arr.length; i++) {
            buf = arr[i];
            int j = i;
            while(j > 0 && (less(buf, arr[j- 1]))){
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = buf;
        }
    }

    public void bubbleSort(int [] arr){
        boolean isSwaped;
        for (int i = arr.length - 1; i > 0 ; i--) {
            isSwaped = false;
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[j + 1]){
                    replace(arr,j,j + 1);
                    isSwaped = true;
                }
            }
           if(!isSwaped){
               System.out.println("Оптимизированная сортировка пузырьком закончилась на идексе массива: " + i);
               break;
           }

        }
    }


    private boolean less(int number, int number2){

        return number < number2;

    }

    private void replace(int[] arr, int index, int index2){
       int temp = arr[index];
       arr[index] = arr[index2];
       arr[index2] = temp;
    }

}
