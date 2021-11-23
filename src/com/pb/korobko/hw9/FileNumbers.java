package com.pb.korobko.hw9;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class FileNumbers {
    public static void main(String[] args) {

        createNumbersFile();
        createOddNumbersFile();
    }

    public static void createNumbersFile() {
        Random random = new Random();
        try (Writer writer = new FileWriter("src/com/pb/korobko/hw9/numbers.txt")) {
            int x;
            int count = 0;
            for (x = 0; x < 100; x++) {
                writer.write(random.nextInt(100) + " ");
                count++;
                if (count % 10 == 0) {
                    writer.write("\n");
                }
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public static void createOddNumbersFile() {
        Path path = Paths.get("src/com/pb/korobko/hw9/numbers.txt");

        try (Scanner scan = new Scanner(path)) {
            int[] i = new int[100];
            int a;
            int b;
            int counter = 0;
            while (true) {
                for (a = 0; a < i.length; a++) {
                    i[a] = scan.nextInt();
                    if (i[a] % 2 == 0) {
                        i[a] = 0;
                    }
                }
                try (Writer writer = new FileWriter("src/com/pb/korobko/hw9/odd-numbers.txt")) {
                    for (b = 0; b < 100; b++) {
                        writer.write(i[b] + " ");
                        counter++;
                        if (counter % 10 == 0) {
                            writer.write("\n");
                        }
                    }
                } catch (Exception e) {
                    e.getStackTrace();
                }
            }
        } catch (NoSuchElementException ex) {
            System.out.println("Файл прочитано та перетворено");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
