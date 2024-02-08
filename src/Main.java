import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = in.nextInt();
        double ar[] = new double[size];
        double sum = 0;
        for (int i = 0; i < size; i++) {
            System.out.println("Введите значение элемента массива: ");
            ar[i] = in.nextDouble();
            sum += ar[i];
        }
        double sr = sum/size;
        for (int i = 0; i < size; i++){
            System.out.print(" "+ar[i]*sr);
        }
    }
}