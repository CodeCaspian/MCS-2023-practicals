import java.io.*;

public class lwrcase {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            String result = "";
            char c;
            File fs = new File("C:\\Users\\Dell\\OneDrive\\Desktop\\Practicals\\SADP\\ftxt.txt");

            FileInputStream fis = new FileInputStream(fs);
            BufferedInputStream bs = new BufferedInputStream(fis);

            while (bs.available() > 0) {
                c = (char) bs.read();
                result += Character.toLowerCase(c);
            }
            bs.close(); // <---- Optional

            System.out.println("Lowercase: " + result);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
