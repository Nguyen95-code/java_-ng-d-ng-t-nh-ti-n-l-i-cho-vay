import java.util.Scanner;

public class untitled {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double money;
        int month;
        double interset_rate;
        System.out.println("nhap tien : ");
        money = input.nextDouble();
        System.out.println("nhap thang");
        month = input.nextInt();
        System.out.println("nhap lai xuat : ");
        interset_rate = input.nextDouble();
        double total_interset = 0;
        for (int i = 0; i < month; i++) {
            total_interset = money * (interset_rate / 100) / 12 * 3;
        }
        System.out.println("Total of interset:" + total_interset);
    }
}
