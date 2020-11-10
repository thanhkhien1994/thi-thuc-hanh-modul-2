import java.util.ArrayList;
import java.util.Scanner;

public class Function {
    Scanner s = new Scanner(System.in);

    public DanhBa initDanhBa() {
        System.out.println("Họ tên đầy đủ: ");
        String fullName = s.nextLine();
        System.out.println("Nhập vào số điện thoại: ");
        int phoneNumber = s.nextInt();
        s.nextLine();
        System.out.println("Nhập vào địa chỉ: ");
        String address = s.nextLine();
        System.out.println("Nhập vào Email: ");
        String email = s.nextLine();
        System.out.println("Nhập vào địa chỉ facebook: ");
        String facebook = s.nextLine();
        return new DanhBa(fullName, phoneNumber, address, email, facebook);
    }

    public boolean isCheckExitNow(String mess) {
        do {
            System.out.println(mess + ":\tC\\K");
            String choice = s.nextLine().toUpperCase();
            boolean isContinue = choice.equals("C");
            boolean isExitNow = choice.equals("K");
            if (isContinue) return true;
            if (isExitNow) return false;
            System.out.println("Cảnh báo nhập sai!");
        } while (true);
    }

    public void showDanhBa(ArrayList<DanhBa> danhBaArrayList) {
        for (DanhBa danhBa : danhBaArrayList) {
            System.out.println(danhBa.toString());
        }
    }

    public int index(ArrayList<DanhBa> danhBaArrayList, int phoneNumber) {
        for (int i = 0; i < danhBaArrayList.size(); i++) {
            if (danhBaArrayList.get(i).getPhoneNumber() == phoneNumber) {
                return i;
            }
        }
        return -1;
    }

    public void deleteDanhBa(ArrayList<DanhBa> danhBaArrayList, int phoneNumber) {
        for (int i = 0; i < danhBaArrayList.size(); i++) {
            if (danhBaArrayList.get(i).getPhoneNumber() == phoneNumber) {
                if (isCheckExitNow("Xác nhận xóa: ")) {
                    danhBaArrayList.remove(i);
                } else System.out.println("Danh bạ chưa bị xóa!");

            }
        }
    }

    public void editDanhBa(ArrayList<DanhBa> danhBaArrayList, int phoneNumber) {
        for (int i = 0; i < danhBaArrayList.size(); i++) {
            if (danhBaArrayList.get(i).getPhoneNumber() == phoneNumber) {
                System.out.println("Họ tên đầy đủ mới: ");
                String fullName = s.nextLine();
                System.out.println("Nhập vào số điện thoại mới: ");
                int number = s.nextInt();
                s.nextLine();
                System.out.println("Nhập vào địa chỉ  mới: ");
                String address = s.nextLine();
                System.out.println("Nhập vào Email mới: ");
                String email = s.nextLine();
                System.out.println("Nhập vào địa chỉ facebook mới: ");
                String facebook = s.nextLine();
                danhBaArrayList.get(i).setFullName(fullName);
                danhBaArrayList.get(i).setAddress(address);
                danhBaArrayList.get(i).setEmail(email);
                danhBaArrayList.get(i).setFacebook(facebook);
                danhBaArrayList.get(i).setPhoneNumber(number);
            }
        }
    }
}

