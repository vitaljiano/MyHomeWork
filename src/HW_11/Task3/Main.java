package HW_11.Task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {


        String str = "I love Java more then my friends. Java is so beautiful";
        Pattern pattern = Pattern.compile("Java");
        Matcher matcher = pattern.matcher(str);
if (matcher.find())
        System.out.println("This word exist in "+  "\"" + matcher.start() +"\""+ " line");
        System.out.println(matcher.replaceFirst("C#"));
        System.out.println(matcher.replaceAll("C#"));
    }
}
