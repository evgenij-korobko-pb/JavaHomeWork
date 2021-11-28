package com.pb.korobko.hw10;

public class NumBox<T extends Number> {

    private final T[] numbers;
    int index = 0;

    public NumBox(int size) {
        numbers = (T[]) new Number[size];
    }

    public void add(T num) throws ArrayIndexOutOfBoundsException {
        this.numbers[index] = num;
        index++;
        if (index > numbers.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public T get(int index) {
        return numbers[index];
    }

    public int length() {
        int length = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == null) {
                length = i;
                break;
            } else {
                length = numbers.length;
            }
        }
        return length;
    }

    public double average() {
        double average = 0;
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == null) {
                break;
            } else {
                sum += numbers[i].doubleValue();
            }
            average = sum/(i+1);
        }
        return average;
    }

    public double sum() {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == null) {
                break;
            } else {
                sum += numbers[i].doubleValue();
            }
        }
        return sum;
    }

    public T max() {
        T max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == null) {
                break;
            } else if (numbers[i].doubleValue() > max.doubleValue()) {
                max = numbers[i];
            }
        }
        return max;
    }
}
