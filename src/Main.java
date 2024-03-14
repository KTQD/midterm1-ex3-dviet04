import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String in = "Input.txt";
        String out = "Output.txt";

        try {
            BufferedReader read = new BufferedReader(new FileReader(in));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = read.readLine()) != null) {
                content.append(line).append("\n");
            }
            read.close();

            String contentOut = content.toString().replaceAll("Nha Trang", "Vũng Tàu");
            BufferedWriter write = new BufferedWriter(new FileWriter(out));
            write.write(contentOut);
            write.close();

        } catch (IOException e) {
            System.out.println("Loi");
        }
    }
}
