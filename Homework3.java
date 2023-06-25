package Homework;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
       // System.out.println("Введите слово с четным количеством букв");
       // String Word1 = sc.nextLine();
        //System.out.println("Введите слово с четным количеством букв");
       // String Word2 = sc.nextLine();
       // System.out.println(Word1.length());
       // System.out.println(Word2.length());
        // System.out.println(returnNewWord(Word1,Word2));
// ------------------------------------------------------
   Scanner scanner1 = new Scanner(System .in);
        // System.out.println("Введите первое число");
       // double zahl1 = scanner1.nextDouble();
      //  System.out.println("Введите второе число");
       // double zahl2 = scanner1.nextDouble();

       // System.out.println(summary(zahl1,zahl2));
       // System.out.println(minus(zahl1,zahl2));
       // System.out.println(multiply(zahl1,zahl2));
       // System.out.println(divide(zahl1,zahl2));
//-------------------------------------------------------
        //System.out.println("Сколько евро желаете поменять в доллары?:");
        //double € = scanner1.nextDouble();
        //System.out.println("Введите курс евро к доллару:");
        //double courseOf$ = scanner1.nextDouble();

        //converter(€, courseOf$);

// --------------------------------------


    }


    public static void converter (double summe, double course){
        double convertation = summe * course;
        System.out.println("При курсе:" + course + " USD за EUR, при обмене: "+ summe + " EUR, вы получите " +
                convertation + " $");
    }






  public static double summary (double x, double y){
        double result = x + y;
        return result;

  }
  public static double minus (double x, double y){
        double result = x - y;
        return result;

  }
    public static double multiply (double x, double y){
        double result = x * y;
        return result;


    }

    public static  double divide (double x, double y){
        double result = x/y;
        return  result;

    }

    public static String returnNewWord(String str1, String str2){
        str1 = str1.substring(0,str1.length()/2);
        str2 = str2.substring(str2.length()/2,str2.length());
        String str3 = str1 + str2;
        return str3;


    }
}
