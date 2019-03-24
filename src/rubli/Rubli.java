package rubli;

import java.util.Scanner;

public class Rubli {

    public static void main(String[] args) {
       Scanner num = new Scanner (System.in);
       System.out.println("Введите сумму");
       int first,second;
       first = num.nextInt(); 
       second = num.nextInt();
     
       if (first==1 || first==101 || first==1001 ){
           System.out.println(first+"Рубль");
       }else if (second<=4) {
        System.out.println(second +"Рубля");
    } else {
            System.out.println(first + "Рублей");
            }
    }
}

    
    



