import java.io.*;

public class Main {
    public static void main(String[] args) {

        byte mas[] = {1, 5, 6, 8, 0};git

        try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(mas)) {
            int a = byteArrayInputStream.read();
            while (a != -1) {
                System.out.println(a);
                a = byteArrayInputStream.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


