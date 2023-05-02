// This class is used for reading and writing to RandomAccessFile.
// It behaves like large array of bytes.
// The cursor implies to the array is called filepointer.
// If endofthe file is reached before reading the number of bytes required then it throws the exception.

import java.io.IOException;
import java.io.RandomAccessFile;

public class RAF {
    static final String FILEPATH = "file1.txt";

    public static void main(String[] args) {
        try {
            System.out.println(new String(readFromFile(FILEPATH, 0, 50)));
            writeToFile(FILEPATH, "I love my country and my people", 62);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static byte[] readFromFile(String filePath, int position, int size) throws IOException {
        RandomAccessFile file = new RandomAccessFile(filePath, "r");
        file.seek(position);
        byte[] bytes = new byte[size];
        file.read(bytes);
        file.close();
        return bytes;
    }

    private static void writeToFile(String filePath, String data, int position) throws IOException {
        RandomAccessFile file = new RandomAccessFile(filePath, "rw");
        file.seek(position);
        file.write(data.getBytes());
        System.out.println(file.length());
        file.close();
    }
}