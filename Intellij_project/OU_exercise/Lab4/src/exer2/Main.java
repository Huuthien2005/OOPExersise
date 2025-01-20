package exer2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Management qlgv = new Management();
        Scanner scanner = new Scanner(System.in);

        // Thêm một số giảng viên để test
        GiangVienCoHuu gvch1 = new GiangVienCoHuu("Nguyễn Văn A", LocalDate.parse("1980/01/01", Config.FORMATTER),
                "PGS", "Tiến sĩ", LocalDate.parse("2010/01/01", Config.FORMATTER), 5000000, 2.5);
        GiangVienThinhGiang gvtg1 = new GiangVienThinhGiang("Trần Thị B", LocalDate.parse("1985/02/02", Config.FORMATTER),
                "Không", "Thạc sĩ", LocalDate.parse("2015/01/06", Config.FORMATTER), "Đại học X");

        qlgv.addProfessor(gvch1, gvtg1);

        // Nhập số giờ làm
        qlgv.inputHourWork();

        // Hiển thị danh sách theo lương
        qlgv.sortProfessorByDecreasedSalary();

        // Test tra cứu
        System.out.println("\nTra cứu theo tên 'Nguyễn':");
        qlgv.searchProfessor("Nguyễn").forEach(h->System.out.println(h));;

        // Test xóa giảng viên
        qlgv.removeProfessor("Trần Thị B");

        scanner.close();
    }
}
