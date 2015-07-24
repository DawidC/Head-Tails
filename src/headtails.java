/**
 * Created by dawid on 24.07.15.
 */
import java.util.Random;
import java.util.Scanner;
public class headtails {
    public static void main(String[] args) {
        System.out.println("Gra orzeł - reszka");
        Scanner sc = new Scanner(System.in);


        int x = 0;
        while(x==0){
            System.out.println("Co wybierasz? 1.orzeł, 2.reszka");
            Random generator  = new Random();
            System.out.print(": ");
            int menu = sc.nextByte();
            switch (menu) {
                case 1:
                    System.out.println("Wybrałeś orła!");
                    boolean y = generator.nextBoolean();
                    System.out.println("Rzucanie monetą...");
                    if(y == true){
                        System.out.println("Gratulacje wypadł orzeł :)");
                    } else {
                        System.out.println("Niestety wypadła reszka :(");
                    }
                   // System.out.println(y);
                    System.out.print("Czy chcesz grać dalej? t/n");
                    String wybor = sc.next();
                    char wyb = wybor.charAt(0);
                    if(wyb == 't'){
                        for(int clear = 0; clear < 1000; clear++) {
                            System.out.println() ;
                        }
                        x = 0;
                    } else {
                        x = 1;
                    }
                    break;

                case 2:
                    System.out.println("Wybrałeś reszkę!");
                    y = generator.nextBoolean();
                    System.out.println("Rzucanie monetą...");
                    if(y == false){
                        System.out.println("Gratulacje wypadła reszka :)");
                    } else {
                        System.out.println("Niestety wypadł orzeł :(");
                    }
                    System.out.print("Czy chcesz grać dalej? t/n");
                    String wybor2 = sc.next();
                    char wyb2 = wybor2.charAt(0);
                    if(wyb2 == 't'){
                        for(int clear = 0; clear < 1000; clear++) {
                            System.out.println() ;
                        }
                        x = 0;
                    } else {
                        x = 1;
                    }
                    break;
            }
        }
    }
}