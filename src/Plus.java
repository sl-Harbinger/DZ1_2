import java.util.Scanner;

public class Plus  {
    double a;
    int count = 0;

    double[] Massiv = new double[3];


    Plus() {

    }

    void getPlus() throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            double[] Massiv = new double[3];

            for (int i = 1; i < 4; i++){
            System.out.println("Введите " + i + "-е число");
            a = sc.nextDouble();
            Massiv[i-1] = a;}

            for (int i = 0; i < 3; i++){
                if (Massiv[i]>0){
                    count++;
                }
            }
            System.out.println("положительных чисел " + count);
            System.out.println();

        } catch (Exception exception) {
            System.out.println("Ошибка ввода, идите лесом");
        }
    }

    }


