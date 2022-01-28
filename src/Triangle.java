public class Triangle extends Option {


    public Triangle(int var1, int var2, int var3) {
        super(var1, var2, var3);
    }

    @Override
    public void doWork() {
        if ((var1 + var2) > var3 && (var1 + var3) > var2 && (var2 + var3) > var1) {
            System.out.println("Такой треугольник существует ");
            System.out.println();
        } else {
            System.out.println("Такой треугольник не существует: ");
            System.out.println();
        }
    }
//    double a;
//    double b;
//    double c;
//
//    Triangle() {
//
//    }
//
//    void getTriangle() throws Exception {
//        try (Scanner sc = new Scanner(System.in)) {
//            System.out.println("Введите сторону a");
//            a = sc.nextDouble();
//            System.out.println("Введите сторону b");
//            b = sc.nextDouble();
//            System.out.println("Введите сторону c");
//            c = sc.nextDouble();
//
//            if ((a + b) > c && (a + c) > b && (b + c) > a) {
//                System.out.println("Такой треугольник существует ");
//                System.out.println();
//            } else {
//                System.out.println("Такой треугольник не существует: ");
//                System.out.println();
//            }
//        } catch (Exception exception) {
//            System.out.println("Ошибка ввода, вы ввели не число");
//        }
//    }

}
