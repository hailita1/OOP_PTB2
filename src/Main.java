import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap c: ");
        double c = scanner.nextDouble();
        PTB2 ptb2 = new PTB2(a, b, c);
        if (ptb2.delta() > 0) {
            System.out.print("Phuong trinh co 2 nghiem, x1= " + ptb2.getX1() + " x2=" + ptb2.getX2());
        } else if (ptb2.delta() == 0) {
            System.out.print("Phuong trinh co nghiem kep, x= " + ptb2.getX());
        } else {
            System.out.print("Phuong trinh vo nghiem !!! ");
        }

    }
}
class PTB2 {
    private double a, b, c;

    PTB2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double delta() {
        return (this.b * this.b) - (4 * this.a * this.c);
    }

    double getX1() {
        return (-this.b + (Math.pow(this.delta(), 0.5))) / (2 * this.a);
    }

    double getX2() {
        return (-this.b - (Math.pow(this.delta(), 0.5))) / (2 * this.a);
    }

    double getX() {
        return -this.b / (2 * this.a);
    }
}
