import java.util.Scanner;

public class Minus extends Option {

    public Minus(int var1, int var2, int var3) {
        super(var1, var2, var3);
    }

    @Override
    public void doWork() {
        int countPos = 0;
        int countNeg = 0;
        if (var1 > 0){
            countPos ++;
        } else {
            countNeg ++;
        }

        if (var2 > 0){
            countPos ++;
        } else {
            countNeg ++;
        }

        if (var3 > 0){
            countPos ++;
        } else {
            countNeg ++;
        }

        System.out.println("Положительных - " + countPos + " ,отрицательных - " + countNeg);
    }
}
