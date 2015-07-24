/**
 * Created by dawid on 24.07.15.
 */
import java.util.Scanner;
public class headtails {
    public static void main(String[] args) {
        System.out.println("Gra orzeł - reszka");
        Scanner sc = new Scanner(System.in);

        System.out.println("Co wybierasz? 1.orzeł, 2.reszka");

        System.out.print(": ");
        int menu = sc.nextByte();
        int x = 0;
        while(x==0){
            switch (menu) {
                case 1:
                    System.out.println("Wybrałeś orła!");
                    System.out.print("Czy chcesz grać dalej? t/n");
                    String wybor = sc.next();
                    char wyb = wybor.charAt(0);
                    if(wyb == 'n'){
                        x = 1;
                    } else {
                        x = 0;
                    }
                    break;

                case 2:
                    System.out.println("Wybrałeś reszkę!");
                    System.out.print("Czy chcesz grać dalej? t/n");
                    String wybor2 = sc.next();
                    char wyb2 = wybor2.charAt(0);
                    if(wyb2 == 'n'){
                        x = 1;
                    } else {
                        x = 0;
                    }
                    break;
            }
        }
    }
}