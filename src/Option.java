import java.io.BufferedReader;
import java.util.Scanner;

public abstract class Option {

    int var1;
    int var2;
    int var3;

    public Option(int var1, int var2, int var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }

    public abstract void doWork();
}
