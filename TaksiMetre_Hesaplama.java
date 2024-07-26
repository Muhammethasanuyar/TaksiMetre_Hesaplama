import java.util.Scanner;

public class TaksiMetre_Hesaplama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int km;
        double tutar;
        int AçılısUcreti = 10;
        System.out.print("Kaç kilometre gidildi : ");
        km = scanner.nextInt();
        tutar = ((km * 2.2) + AçılısUcreti);
        if (tutar <= 20) {
            System.out.println("borcunuz 20 tl");
        } else {
            System.out.println("Borcunuz : " + (int) tutar + " TL");
        }
        if (tutar > 20) {
            int[] list = new int[km + 1];
            int[] list1 = new int[1];
            for (int i = 0; i < list.length; i++) {
                for (int j = 0; j < list1.length; j++) {
                    System.out.println(list1[j] + "." + "kilometrede ki tutar : "
                            + ((int) (list1[j] * 2.2) + AçılısUcreti) + " TL");
                    list1[j] = list1[j] + 1;
                }
            }
        }
    }
}