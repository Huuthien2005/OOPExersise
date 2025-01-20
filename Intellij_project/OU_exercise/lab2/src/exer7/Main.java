package exer7;

import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IOException, ParseException{
        String inputPath="D:\\Intellij_project\\OU_exercise\\lab2\\src\\exer7\\input.txt";
        String outputPath="D:\\Intellij_project\\OU_exercise\\lab2\\src\\exer7\\output.txt";
        // Khởi tạo đối tượng QuanLiHocVien
        StudentManagement SM=new StudentManagement();

        // Thêm học viên vào danh sách
        Student hv1 = new Student("Nguyen Thi Lan", "Ha Noi", LocalDate.of(2002, 5, 15));
        hv1.setScore(8.5, 7.0, 9.0);

        Student hv2 = new Student("Tran Minh Tu", "Hai Duong", LocalDate.of(2003, 3, 20));
        hv2.setScore(6.5, 7.5, 8.0);

        Student hv3 = new Student("Le Thi Mai", "Da Nang", LocalDate.of(2001, 12, 10));
        hv3.setScore(5.0, 5.5, 6.0);

        SM.inputStudent(hv1, hv2, hv3);
        // Hiển thị danh sách học viên
        System.out.println("Danh sách học viên:");
        SM.displayStudentList();

        // Nhập điểm cho học viên
        SM.inputScore(2, 8.0, 7.5, 7.0);

        // Hiển thị danh sách học viên sau khi nhập điểm
        System.out.println("\nDanh sách học viên sau khi nhập điểm:");
        SM.displayStudentList();

        // Sắp xếp học viên theo điểm trung bình
        SM.sortStudent();
        System.out.println("\nDanh sách học viên sau khi sắp xếp theo điểm trung bình:");
        SM.displayStudentList();
        // Thống kê độ tuổi học viên
        SM.sumAge();
        SM.inputStudentFile(inputPath);
        SM.displayStudentList();
        SM.inputScore(19, 10, 10, 10);

        // Tìm kiếm học viên theo tên
        System.out.println("\nTìm kiếm học viên theo từ khóa 'Lan':");
        SM.findStudent("Lan");

        // Ghi danh sách học viên đủ học bổng vào file
        SM.findStudentHaveScholarship(outputPath);
    }
}
