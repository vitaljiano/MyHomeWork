package HW_19;

import org.w3c.dom.ls.LSInput;

import java.io.*;
import java.util.List;

public class Method {
    public void serialise(String str, Object o) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(str))) {
            objectOutputStream.writeObject(o);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public Object deSerialize(String str) {
        Object object = new Object();
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(str))) {
            object = objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return object;
    }

}
