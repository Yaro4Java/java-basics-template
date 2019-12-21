package com.epam.izh.rd.online.service;

public class SimpleMathService implements MathService {

    /**
     * Метод возвращает 0, если value1 = value2.
     * Метод возвращает -1, если value1 < value2.
     * Метод возвращает 1, если value1 > value2.
     *
     * Например для (-1, -1) метод должен вернуть 0;
     * Например для (-3, -1) метод должен вернуть -1;
     * Например для (3, 1) метод должен вернуть 1;
     */
    @Override
    public int compare(int value1, int value2) {

        if(value1 == value2)
            return 0;
        else if(value1 < value2)
            return -1;
        else
            return 1;
    }

    /**
     * Метод возвращает максимальное число из пары.
     * Например для списка (-1, 2) метод должен вернуть 2
     */
    @Override
    public int maxFrom(int value1, int value2) {

        if(value1 > value1)
            return value1;
        else
            return value2;
    }

    /**
     * Метод возвращает максимальное число из переданного массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 22
     */
    @Override
    public int maxFrom(int[] values) {

        int maximum = values[0];

        for(int n=1; n < values.length; n++) {
            if (values[n] > maximum)
                maximum = values[n];
        }

        return maximum;
    }

    /**
     * Метод возвращает сумму чисел массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 30
     */
    @Override
    public int sum(int[] values) {

        if(values.length == 0) {
            return 0;
        }
        else {
            int total = values[0];

            for (int n = 1; n < values.length; n++) {
                total = total + values[n];
            }

            return total;
        }
    }

    /**
     * Метод фильтрует массив, оставляя только четные числа.
     * Например для списка {-1, -3, 4, 8, 5, 22, 17} метод должен вернуть {4, 8, 22}
     */
    @Override
    public int[] getEvenDigits(int[] values) {
        return new int[]{};
    }

    /**
     * Метод считает факториал из заданного числа.
     * Например для числа 5 метод должен вернуть 120.
     * Факториал 0 должен быть равен 1.
     */
    @Override
    public long calcFactorial(int initialVal) {
        return -1L;
    }

    /**
     * Метод возвращает число, которое находится на заданной позиции (счет начинается с нуля) в ряду фибоначчи.
     *
     * Ряд фибоначчи - ряд, следующие элементы которого состоят из суммы двух предыдущих.
     * Ряд начинается 0 и 1.
     * Пример 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ...
     *
     * Для числа 9 метод должен вернуть 34
     * Для числа 0 метод должен вернуть 0
     */
    @Override
    public long calcFibonacci(int number) {
        return -1L;
    }

    /**
     * Метод возвращает отсортированный по возрастанию массив.
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть {-5, -3, -1, 4, 5, 8, 22}
     */
    @Override
    public int[] sort(int[] values) {
        return new int[]{};
    }

    /**
     * Метод определяет, является ли заданное число простым.
     * Простое число - число, которое делится только на 1 и на само себя.
     *
     * Например для числа 22 вернется false, а для числа 23 true.
     */
    @Override
    public boolean isPrimary(int number) {

        boolean isPrime = true;

        if(number < 2){
            isPrime = false;
        } else {
            for (int n = 2; n < number; n++) {
                if((number % n) == 0 ){
                    isPrime = false;
                }
            }
        }

        return isPrime;
    }

    /**
     * Метод возвращает массив, в котором элементы расположены в обратном порядке.
     *
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод вернет {-5, 22, 5, 8, 4, -3, -1}
     */
    @Override
    public int[] reverseArray(int[] values) {

        int temp;
        int length = values.length;

        for(int n=0; n < (length - n); n++) {
            temp = values[n];
            values[n] = values[length - n -1];
            values[length - n -1] = temp;
        }

        return values;
    }
}
