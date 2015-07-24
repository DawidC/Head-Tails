/**
 * Created by dawid on 24.07.15.
 */
import java.util.Scanner;
public class headtails {
    public static void main(String[] args){
        System.out.println("Gra orzeł - reszka");
        Scanner sc = new Scanner(System.in);

        label: do{
            System.out.println("Co wybierasz? 1.orzeł, 2.reszka");

            System.out.print(": ");
            int menu = sc.nextByte();
            if (menu == 1) {

                System.out.print("Jeszcze raz?(t/n): ");
                String m = sc.next();
                if(m == " "){
                    break label;
                } else {
                    System.exit(1);
                }
            } else if (menu == 2) {
                System.out.print("Jeszcze raz?(t/n): ");
                String m = sc.next();
                if(m == "2"){
                    break label;
                } else {
                    System.exit(2);
                }
            } else {
                System.out.println("Zły wybór! Spróbuj jeszcze raz. ");
                break label;
            }
        } while(true);
    }
}
