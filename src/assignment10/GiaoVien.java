
package assignment10;
import java.util.*;

public class GiaoVien extends Nguoi {

    private String maGiaoVien;
    private String loaiThiDua;

    public GiaoVien() {
    }

    public GiaoVien(String maGiaoVien, String loaiThiDua) {
        this.maGiaoVien = maGiaoVien;
    }

    public String getMaGiaoVien() {
        return maGiaoVien;
    }

    public void setMaGiaoVien(String maGiaoVien) {
        this.maGiaoVien = maGiaoVien;
    }

    public String getLoaiThiDua() {
        return loaiThiDua;
    }

    public void setLoaiThiDua(String loaiThiDua) {
        this.loaiThiDua = loaiThiDua;
    }

    void xepLoaiThiDua() {
        Scanner scanner = new Scanner(System.in);
        int luaChonThiDua;
        System.out.print("Lua chon thi dua: 1-Loai A, 2-Loai B, 3-Loai C: ");
        luaChonThiDua = Integer.parseInt(scanner.nextLine());
        switch (luaChonThiDua) {
            case 1 -> {
                System.out.println("Thi dua loai A");
                setLoaiThiDua("Loai A");
            }
            case 2 -> {
                System.out.println("Thi dua loai B");
                setLoaiThiDua("Loai B");
            }
            case 3 -> {
                System.out.println("Thi dua loai C");
                setLoaiThiDua("Loai C");
            }
        }
    }

    void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        super.nhapThongTin();
        System.out.print("Ma giao vien: ");
        setMaGiaoVien(scanner.nextLine());
        System.out.print("Loai thi dua: ");
        xepLoaiThiDua();
    }

    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println(toString());
    }

    @Override
    public void traTienDoXe() {
        System.out.println("Giao vien: mien phi");
    }
}
