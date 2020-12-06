package HW_21;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {
    @MyAnn(name = "My Library")
    private String nameOfLibrary;

    private int numberOfBooks;

    @MyAnn(name = "My table")
    private String tableOfUsers;

    @MyAnn(name = "Name of new file ")
    private String filedAnnotation = "FieldsOfAnnotation.txt";

    @MyAnn(name = "vitaljiano@gmail.com")
    private String emailAddress;

    @MyAnn(name = "Lviv, Ukraine")
    private String physicalAddress;

    public boolean createFile() {
        File file = new File("D:\\Programing\\java_core_basics\\src\\HW_21\\" + filedAnnotation);
        boolean created = false;
        try {
            created = file.createNewFile();
            if (created) {
                System.out.println("New file has been created");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return created;
    }


    public void fieldsOfAnn() {
        File file = new File("D:\\Programing\\java_core_basics\\src\\HW_21\\" + filedAnnotation);
        if (file.exists()) {
            Class<Library> classLibrary = Library.class;
            List<String> listAnnotation = new ArrayList<>();

            for (Field f : classLibrary.getDeclaredFields()) {
                listAnnotation.add(Arrays.toString(f.getAnnotations()));
            }
            try {
                FileWriter writer = new FileWriter(file);
                writer.write(listAnnotation.toString());
                writer.close();
                System.out.println("All fieled Annotation hes been writeted in file " + filedAnnotation);

            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            createFile();
            fieldsOfAnn();
        }

    }
}
