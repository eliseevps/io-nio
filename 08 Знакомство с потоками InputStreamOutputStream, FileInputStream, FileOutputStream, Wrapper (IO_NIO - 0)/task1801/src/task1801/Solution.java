//Complete

package task1801;

import java.io.*;

/* 
Максимальный байт
Ввести с консоли имя файла.
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода.


Requirements:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль должен выводиться максимальный байт, считанный из файла.
4. Поток чтения из файла должен быть закрыт.*/

public class Solution {
    public static void main(String[] args) {
        byte maxByte = 0;
        byte tempByte;

        try (BufferedReader readerFileName = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fileInputStream = new FileInputStream(readerFileName.readLine())) {
            while (true) {
                if ((tempByte = (byte) fileInputStream.read()) != -1) {
                    if (maxByte < tempByte) {
                        maxByte = tempByte;
                    }
                } else break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(maxByte);
    }
}
