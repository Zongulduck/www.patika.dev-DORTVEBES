import java.util.Scanner;
public class DORTVEBES {
    public static void main(String[]args){
        int sınır;
        Scanner inp=new Scanner(System.in);
        System.out.println("Sayı giriniz.");
        sınır= inp.nextInt();
        System.out.println("4'ün üsleri");
        for(int i=1;i<=sınır;i*=4){
            System.out.print(" "+i+" ");
        }
        System.out.println();
        System.out.println("5'in üsleri");
        for(int i=1;i<=sınır;i*=5){
            System.out.print(" "+i+" ");
        }
    }

}
