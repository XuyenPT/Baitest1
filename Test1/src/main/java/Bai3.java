public class Bai3 {
    public void thangnam()
    {
        int n;
        System.out.println("Nhap vao một số: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        if (n == 1 | n == 3 | n == 5 | n == 7 | n == 8 | n == 10 | n == 12) {
            System.out.println("Thang: " + n +  " là tháng trong năm và" + " co 31 ngay");
        } else if (n == 2) {
            System.out.println("Thang: " + n + " là tháng trong năm và" + " co 28 hoac 29 ngay");
        } else if (n == 4 | n == 6 | n == 9 | n == 11) {
            System.out.println("Thang: " + n + " là tháng trong năm và" + " co 30 ngay");
        } else {
            System.out.println("Số đó không phải là tháng");
        }
    }
}

