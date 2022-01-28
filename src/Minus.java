import java.util.Scanner;

public class Minus  {
    double a;
    int count = 0;
    int ucount = 0;
    double[] Massiv = new double[3];
    Minus() {

    }

    void getMinus() throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            double[] Massiv = new double[3];
            for (int i = 1; i < 4; i++){
                System.out.println("Введите " + i + "-е число");
                a = sc.nextDouble();
                Massiv[i-1] = a;}

            for (int i = 0; i < 3; i++){
                if (Massiv[i]>0){
                    count++;
                }else {
                    ucount++;
                }
            }
            System.out.println("отрицательных чисел " + count);
            System.out.println("Положительных чисел " + ucount);
            System.out.println();

        } catch (Exception exception) {
            System.out.println("Ошибка ввода, Ошибка ввода");
        }
    }


}
