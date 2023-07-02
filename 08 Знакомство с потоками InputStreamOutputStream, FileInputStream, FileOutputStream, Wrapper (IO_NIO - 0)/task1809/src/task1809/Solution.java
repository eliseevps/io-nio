//Complete

package task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке.
Закрыть потоки.


Requirements:
1. Программа должна два раза считать имена файлов с консоли.
2. Для чтения из файла используй поток FileInputStream, для записи в файл - FileOutputStream
3. Во второй файл нужно записать все байты из первого в обратном порядке.
4. Потоки FileInputStream и FileOutputStream должны быть закрыты.*/

public class Solution {
    public static void main(String[] args) {
        List<Byte> listArray = new ArrayList<>();
        byte tempByte;

        try (BufferedReader readerFileName = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fileInputStream = new FileInputStream(readerFileName.readLine());
             FileOutputStream fileOutputStream = new FileOutputStream(readerFileName.readLine())) {
            while (true) {
                if ((tempByte = (byte) fileInputStream.read()) != -1) {
                    listArray.add(tempByte);
                } else break;
            }
            for (int i = listArray.size() - 1; i >= 0; i--) {
                //Убираем возврат каретки (символ 10)
                if (listArray.get(i) != 10) {
                    fileOutputStream.write(listArray.get(i));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
