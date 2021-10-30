package com.pb.korobko.hw4;

import java.util.Scanner;

public class Anagram {

    //      Аз есмь строка, живу я, мерой остр.
    //      За семь морей ростка я вижу рост.
    //      Я в мире – сирота.
    //      Я в Риме – Ариост.

    static Boolean isWordAnagram(String wordCandidate, String AnagramStr) {
        Boolean isWordAnagramRes = false;                           // результат работы метода по-умолчанию
        String[] AnagramStrPart = AnagramStr.split(" ");      // создаем массив слов

        // формируем регулярное выражение для анализа слова кандидата с одним из слов второго выражения
        // если набор символов кандидата совпадет с набором символов очередного слова, возвращается true
        String regexp = "^["+wordCandidate+"]+$" ;

        for (int i=0; i < AnagramStrPart.length ; i++){

            // для наглядности оператор if разделен на части
            if ( (AnagramStrPart[i].equalsIgnoreCase(wordCandidate)) && wordCandidate.length() == 1){
                // если слово кандидат из одного символа (длинна 1) и равно слову из фразы, останавливаем цикл и возвращаем true
                isWordAnagramRes = true;
                break;
            } else if ((!AnagramStrPart[i].equalsIgnoreCase(wordCandidate)) && (AnagramStrPart[i].matches(regexp)) &&
                    (wordCandidate.length()== AnagramStrPart[i].length())){
                // иначе если слово кандидат не равно слову из фразы и является анаграммой, останавливаем цикл и возвращаем true
                isWordAnagramRes = true;
                break;
            }

        }

        return isWordAnagramRes;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);      // ввод данных пользователя
        String UserStrSrc1, UserStrSrc2;            // исходная строка введенная пользователем
        String UserStr1, UserStr2;                  // подготовленная строка для обработки
        Boolean isAnagram = false;

        System.out.println("Программа проверяет две фразы, является ли одна строка анаграммой другой строки.");
        System.out.print("Введите фразу 1\n\tпример\n\t\t\tАз есмь строка, живу я, мерой остр\n\t\t\t" +
                "Я в мире – сирота\n -> ");
        UserStrSrc1 = scan.nextLine();
        System.out.print("Введите фразу 2\n\tпример\n\t\t\tЗа семь морей ростка я вижу рост\n\t\t\t" +
                "Я в Риме – Ариост\n  -> ");
        UserStrSrc2 = scan.nextLine();

        // перед проверкой
        //  - привести к одному регистру,
        UserStr1 = UserStrSrc1.toLowerCase();
        UserStr2 = UserStrSrc2.toLowerCase();
        //  - преобразовать строку, оставить только символы и разделительные пробелы
        UserStr1 = UserStr1.replaceAll("[^a-zA-Zа-яёА-ЯЁ ]", "");
        UserStr2 = UserStr2.replaceAll("[^a-zA-Zа-яёА-ЯЁ ]", "");


        String[] UserStrPart1 = UserStr1.split(" ");
        String[] UserStrPart2 = UserStr2.split(" ");

        // контроль корректности входных данных ( на количество слов во фразах)
        if (UserStrPart1.length == UserStrPart2.length){
            // перебор всех слов первой фразы на "анаграммность" со словами второй фразы
            // если хоть одно слово не удовлетворяет условию, цикл прерывается
            for (int i=0; i < UserStrPart1.length ; i++){
                if (!UserStrPart1[i].equalsIgnoreCase("")) {    // исключить пустой элемент в массиве из анализа
                    isAnagram = isWordAnagram(UserStrPart1[i], UserStr2);
                    if (!isAnagram) {
                        break;
                    }
                }
            }

            // вывод результата
            if (isAnagram){
                System.out.println("Введенные фразы\n"+UserStrSrc1+"\n"+UserStrSrc2+ "\nанагарамма");

            } else {
                System.out.println("Введенные фразы\n" + UserStrSrc1 + "\n" + UserStrSrc2 + "\nНЕ анагарамма");

            }

        } else {
            System.out.println("\nВы не корректно ввели фразы.\n1: "+UserStrSrc1+"\n2: "+UserStrSrc2+ "\nКоличество слов не совпадает." +
                    "\nНачните заново!");

        }



    }
}