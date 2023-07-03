//Complete

package task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
Считать с консоли 2 имени файла.
Вывести во второй файл все символы с четным порядковым номером (нумерация начинается с 1).

Пример первого файла:
text in file
Вывод во втором файле:
eti ie
Закрыть потоки ввода-вывод


Requirements:
1. Программа должна считывать имена файлов с консоли (используй BufferedReader).
2. BufferedReader для считывания данных с консоли должен быть закрыт.
3. Программа должна считывать содержимое первого файла (используй FileReader c конструктором String).
4. Поток чтения из файла (FileReader) должен быть закрыт.
5. Программа должна записывать во второй файл все символы из первого файла с четным порядковым номером (используй FileWriter).
6. Поток записи в файл (FileWriter) должен быть закрыт.*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             FileReader fileReader = new FileReader(bufferedReader.readLine());
             FileWriter fileWriter = new FileWriter(bufferedReader.readLine())) {
            while (fileReader.ready()) {
                list.add(fileReader.read());
            }
            for (int i = 1; i < list.size(); i = i + 2) {
                fileWriter.write(list.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
