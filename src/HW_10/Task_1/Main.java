package HW_10.Task_1;

public class Main {
    public static void main(String[] args) {
        String str = "I like Java !!!";
        System.out.println(str.charAt(str.length() - 1));//Вивести останній символ рядка
        System.out.println(str.endsWith("!!!"));// чи закінсчується рядком !!!
        System.out.println(str.startsWith("I like"));// чи починається рядок
        System.out.println(str.contains("Java")); //чи містить рядок Java
        System.out.println(str.lastIndexOf("Java")); //позиція слова в рядку
        System.out.println(str.replace("a", "o")); // замінити а на о
        System.out.println(str.toUpperCase()); //до верхнього регістру
        System.out.println(str.toLowerCase());//до нижнього регістру
        System.out.println(str.substring(2, 6)); //вирізати рядок

    }
}
