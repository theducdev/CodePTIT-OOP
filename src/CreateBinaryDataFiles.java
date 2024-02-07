import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class CreateBinaryDataFiles {
    public static void main(String[] args) {
        // Tạo và ghi dữ liệu vào tệp DATA.in
        createAndWriteData("DATA.in");

        // Tạo và ghi dữ liệu vào tệp DATA2.in
        createAndWriteData("DATA2.in");
    }

    public static void createAndWriteData(String fileName) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
            ArrayList<Integer> data = new ArrayList<>();
            Random random = new Random();

            // Số lượng số nguyên bạn muốn tạo
            int numIntegers = 100000;

            for (int i = 0; i < numIntegers; i++) {
                // Tạo số nguyên ngẫu nhiên từ 1 đến 1000000
                int randomNumber = random.nextInt(1000000) + 1;
                data.add(randomNumber);
            }

            out.writeObject(data);
            out.close();
            System.out.println("Dữ liệu đã được ghi vào tệp nhị phân '" + fileName + "'.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
