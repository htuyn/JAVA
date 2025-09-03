interface Shape {
    void display();

    double chuVi();

    double dienTich();
}

class HinhChuNhat implements Shape {
    private double chieuDai;
    private double chieuRong;

    HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public void display() {
        System.out.printf("Chieu dai va chieu rong cua hinh chu nhat lan luot la: %.2f %.2f %n", chieuDai, chieuRong);

    }

    @Override
    public double chuVi() {
        return 2 * (chieuDai + chieuRong);
    }

    @Override
    public double dienTich() {
        return chieuDai * chieuRong;
    }
}

class HinhVuong implements Shape {
    private double canh;

    HinhVuong(double canh) {
        this.canh = canh;
    }

    @Override
    public void display() {
        System.out.println("Do dai canh hinh vuong la: " + canh);
    }

    @Override
    public double chuVi() {
        return 4 * canh;
    }

    @Override
    public double dienTich() {
        return canh * canh;
    }
}

public class tinhToan {
    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat(6, 4);
        hcn.display();
    }
}