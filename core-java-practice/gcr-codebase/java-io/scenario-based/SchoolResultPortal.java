import java.io.*;
import java.util.Scanner;

public class SchoolResultPortal {

    public static void main(String[] args) {

        try {

            BufferedReader br = new BufferedReader(new FileReader("students.txt"));

            BufferedWriter bw = new BufferedWriter(new FileWriter("reportcard.txt", true));

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                String name = data[0];

                int physics = Integer.parseInt(data[1]);

                int chemistry = Integer.parseInt(data[2]);

                int maths = Integer.parseInt(data[3]);

                double average = (physics + chemistry + maths) / 3.0;

                bw.write("Name: " + name + " Average: " + average);

                bw.newLine();
            }

            br.close();

            bw.close();

            System.out.println("Report card generated.");

        } catch (FileNotFoundException e) {

            System.out.println("Student file not found.");

        } catch (IOException e) {

            System.out.println("File error.");
        }
    }
}