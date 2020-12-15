package ru.geekbrains.algorithms.lesson5;

public class RecPower {

    public int recPower(int number, int power){

        if(number == 0 && power <= 0){
            throw new ArithmeticException();
        }
        if(power == 0){
            return 1;
        }

         return recPower(number, power -1) * number;
    }
}
