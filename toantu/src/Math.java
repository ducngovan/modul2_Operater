import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.getData();
        System.out.println("Dien tich hinh chu nhat la: "+rec.getAcreage());
    }
}
class Rectangle {
    float width, leng, acreage;
    public void getData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("hay nhap chieu dai: ");
        leng = scanner.nextFloat();
        System.out.println("hay nhap chieu rong: ");
        width = scanner.nextFloat();
    }
    public float getAcreage(){
        acreage = width * leng;
        return acreage;
    }
}