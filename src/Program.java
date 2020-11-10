import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Function function = new Function();
        ArrayList<DanhBa> danhBaArrayList = new ArrayList<>();
        int choice;
        boolean isCheckExit = true;
        do {
            System.out.println("---- CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ ----");
            System.out.println("Chọn chức năng theo số để tiếp tục: ");
            System.out.println("1.Xem danh sách");
            System.out.println("2.Thêm mới");
            System.out.println("3.Cập nhật");
            System.out.println("4.Xóa");
            System.out.println("5.Tìm kiếm");
            System.out.println("6.Đọc file");
            System.out.println("7.Ghi file");
            System.out.println("8.Thoát");
            System.out.print("Chọn chức năng: ");


            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("----HIỂN THỊ DANH BẠ----");
                    if (danhBaArrayList.size() <= 0) {
                        if (function.isCheckExitNow("Damh bạ đang trống\n Thêm ngay")) {
                            danhBaArrayList.add(function.initDanhBa());
                            System.out.println("Đã thêm thành công!");
                        } else {
                            System.out.println("Danh bạ chưa được thêm!");
                            break;
                        }
                    } else function.showDanhBa(danhBaArrayList);
                    break;
                case 2:
                    System.out.println("---->>THÊM DANH BẠ<<----");
                    danhBaArrayList.add(function.initDanhBa());
                    System.out.println("Thêm thành công!");
                    break;
                case 3:
                    System.out.println("----CẬP NHẬT DANH BẠ----");
                    System.out.println("Nhập vào số điện thoại trong danh bạ: ");
                    int number = scanner.nextInt();
                    function.editDanhBa(danhBaArrayList, number);
                    System.out.println("Đã thay đổi");
                    break;
                case 4:
                    System.out.println("---->>XÓA DANH BẠ<<----");
                    function.showDanhBa(danhBaArrayList);
                    if (danhBaArrayList.size() <= 0) {
                        if (function.isCheckExitNow("Damh bạ đang trống\n Thêm ngay")) {
                            danhBaArrayList.add(function.initDanhBa());
                            System.out.println("Đã thêm thành công!");
                        } else {
                            System.out.println("Danh bạ chưa được thêm!");
                            break;
                        }
                    } else {
                        System.out.println("Nhập vào số điện thoại muốn xóa: ");
                        int phoneNumber = scanner.nextInt();
                        scanner.nextLine();
                        function.deleteDanhBa(danhBaArrayList, phoneNumber);
                        function.showDanhBa(danhBaArrayList);
                    }
                    break;
                case 5:
                    System.out.println("---->>TÌM KIẾM DANH BẠ<<----");
                    if (danhBaArrayList.size() <= 0) {
                        if (function.isCheckExitNow("Damh bạ đang trống\n Thêm ngay")) {
                            danhBaArrayList.add(function.initDanhBa());
                            System.out.println("Đã thêm thành công!");
                        } else {
                            System.out.println("Danh bạ chưa được thêm!");
                            break;
                        }
                    } else {
                        System.out.println("Nhập số điện thoại muốn tìm: ");
                        int phoneNumber = scanner.nextInt();
                        scanner.nextLine();
                        int i = function.index(danhBaArrayList, phoneNumber);
                        if (i == -1){
                            System.out.println("Không tìm thấy người có số điện thoại này: ");
                        } else danhBaArrayList.get(i);
                    }
                    break;
                case 6:
                    System.out.println("---->>ĐỌC FILE<<----");
                    System.out.println("Chưa cập nhật!");
                    break;
                case 7:
                    System.out.println("---->>GHI FILE<<----");
                    System.out.println("Chưa cập nhật!");
                    break;
                case 8:
                    System.out.println("---->>GOOD BEY!<<----");
                    isCheckExit = false;
                    break;
                default:

            }
        } while (isCheckExit);
    }
}
