package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.core.RandomArrayFactory;
import ru.avalon.java.j20.labs.models.Numbers;

import java.util.Arrays;

/**
 * Задание №1.
 *
 * <p>Тема: "Создание обобщённых методов".
 *
 * <p>В рамках задания требуется описать и выполнить
 * несколько методов, обобщённых с указанной точностью.
 */
public class Task1 implements Task {

    /**
     * Фабрика, создающая массивы случайных чисел.
     */
    private final RandomArrayFactory arrayFactory = new RandomArrayFactory();

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        int[] array = arrayFactory.getInstance(20);
        Integer[] integerArray = arrayFactory.castIntToInteger(array);
        int min = Numbers.min(integerArray);
        int max = Numbers.max(integerArray);
        double avg = Numbers.avg(integerArray);

        /*
         * TODO(Студент): Выполните задание №1
         *
         * 1. Обобщить метод поиск среднего арифметического
         *
         *    Выполните обобщение метода с использованием шаблона так,
         *    чтобы метод мог выполнять поиск среднего арифметического
         *    в массивах любых чисел: целых и вещественных.
         *
         *    Возвращать необходимо значение типа double.
         *
         * 2. Обобщить метод поиск максимального значения
         *
         *    Выполните обобщение метода с использованием шаблона так,
         *    чтобы метод мог выполнять поиск максимального значения
         *    в массивах любых чисел: целых и вещественных.
         *
         * 3. Обобщить метод поиск минимального значения
         *
         *    Выполните обобщение метода с использованием шаблона так,
         *    чтобы метод мог выполнять поиск минимального значения
         *    в массивах любых чисел: целых и вещественных.
         *
         * 4. С использованием отладчика проверьте корректность
         *    выполнения задания.
         */
    }
}
