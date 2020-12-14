import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BufferReadFromFile {
    public List<Device> readToObjectFromFile(String fileName) {

        List<String> list = new ArrayList<>();
        String strLine;
        try {
            BufferedReader in = new BufferedReader(new FileReader(fileName));
            while (in.readLine() != null) {
                list.add(in.readLine());
            }
            in.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

       List<Device> deviceList = new ArrayList<>();
        String[] arrayOneDevice;
        for (String str : list) {
            arrayOneDevice = str.split(", ");
            deviceList.add(new Device(Integer.parseInt(arrayOneDevice[0].trim()), arrayOneDevice[1],
                    arrayOneDevice[2], Integer.parseInt(arrayOneDevice[3].trim())));
        }

        return deviceList;
    }
}
