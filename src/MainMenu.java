import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainMenu {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private int var1;

    public MainMenu() throws IOException {
        printMenu();
        var1 = Integer.parseInt(reader.readLine());
    }

    public void chooseOption() throws IOException {
        Option option = null;
//        String str = reader.read();
//        String [] strs = str.split(" ");
        int i = Integer.parseInt(reader.readLine());
        int i1 = Integer.parseInt(reader.readLine());
        int i2 = Integer.parseInt(reader.readLine());

        switch (var1) {
            case 1 -> {
                option = new Triangle(i, i1, i2);
            }
            case 2 -> {
                option = new Minus(i, i1, i2);
            }
            default -> {
                System.out.println("В разработке");
            }
        }
        if (option != null) {
            option.doWork();
        }
    }

    public static void printMenu() {
        System.out.println("выберете что хотите выполнить \n"
                + "0 - выход \n"
                + "1 - проверка треугольника \n"
                + "2 - проверка кол-ва положительных чисел \n"
                + "3 - проверка кол-ва положительных и отрицательных чисел \n");
    }

    public int getVar1() {
        return var1;
    }
}
