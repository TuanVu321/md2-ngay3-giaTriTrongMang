import java.util.Scanner;

public class find {
    public static void main(String[] args) {
     String[] student = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ten sv muon tim kiem");
        String name = scanner.nextLine();
        boolean check = false;
        for(int i = 0;i<student.length;i++){
             if(student[i].equals(name)){
                 System.out.println("vi tri trong mang la "+ i);
                 check = true;
                 break;
             }
        }
        if(!check){
            System.out.println("Khong co trong mang");
        }

    }
}
