import java.util.Scanner;


public class DZ1_2 {
    public static void main(String[] args) throws Exception {
        MainMenu mainMenu = new MainMenu();
        mainMenu.chooseOption();

//        try (Scanner sc = new Scanner(System.in)) {
//            //      Scanner sc = new Scanner(System.in);
//            while (true) {
//
//                printMenu();
//
//                int kod = sc.nextInt();
//                if (kod == 0) {
//                    break;
//                }
//                if (kod < 0 || kod > 3) {
//                    System.out.println("Неверный код");
//                    continue;
//                }
//
//                switch (kod) {
//                    case 1: {
//                        Triangle otvet = new Triangle();
//                        otvet.getTriangle();
//                        continue;
//                    }
//                    case 2: {
//                        Plus otvet = new Plus();
//                        otvet.getPlus();
//                        break;
//                    }
//                    case 3: {
//                        Minus otvet = new Minus();
//                        otvet.getMinus();
//                        break;
//                    }
//                }
//            }
//        } catch (Exception e) {
//            System.out.println("Ошибка ввода ");
//        }
//    }
//
//    public static void printMenu() {
//        System.out.println("выберете что хотите выполнить \n"
//                + "0 - выход \n"
//                + "1 - проверка треугольника \n"
//                + "2 - проверка кол-ва положительных чисел \n"
//                + "3 - проверка кол-ва положительных и отрицательных чисел \n");
//    }
    }
}