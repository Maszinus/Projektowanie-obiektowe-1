import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Marcel Osoliński");

        Tablice t = new Tablice();

        System.out.println("Podaj a: ");
        int a = getint();
        System.out.println("Podaj b: ");
        int b = getint();

        t.metoda1();
        System.out.println("Metoda 3: " + t.trzy());
        System.out.println("Suma: " + t.suma(a,b));

    }

    public static String getstring() {
        return  new Scanner(System.in).next();
    }

    public static int getint() {
        return new Scanner(System.in).nextInt();
    }
}


