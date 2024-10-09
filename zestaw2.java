import static java.lang.Math.*;
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        
        double x1 = 23.0 + 76;
        double x2= 41*2.0+3;
        int x3 = 5-33;
        int x4 = 109%3;
        int x5 = 50/2;
        int x6 = 4|2;
        double x7 = Math.pow(3,5);
        int x8 = 7&9;
        
        double q = ((Math.sqrt(7) - 1)/2) + (Math.pow(3,3)%2);
        int w = (int)q;
        System.out.println(w);
        
        double e = 2003/(22*10);
        int r = (int)e;
        System.out.println(r);
        
        double t = (3+Math.sqrt(3))/((Math.sqrt(5)/2)/3) + 1;
        int y = (int)t;
        System.out.println(y);
        
        double u = 16%5%2;
        int i = (int)u;     
        System.out.println(i);
        
        double o = (6%5+1)/(Math.pow(2,1/4));
        int p = (int)o;
        System.out.println(p);
        
        Scanner a = new Scanner(System.in); 
        System.out.println("Podaj pierwsze slowo: ");
        String slowo1 = a.nextLine();
        
         Scanner s = new Scanner(System.in); 
        System.out.println("Podaj drugie slowo: ");
        String slowo2 = s.nextLine();
        System.out.println(slowo1 + slowo2);
        
        Scanner d = new Scanner(System.in); 
        System.out.println("Podaj pierwsza liczbe: ");
        int liczba1 = d.nextInt();
        
        Scanner f = new Scanner(System.in); 
        System.out.println("Podaj druga liczbe: ");
        int liczba2 = f.nextInt();
        System.out.println(liczba1 + liczba2);
        System.out.println(liczba1 - liczba2);
        System.out.println(liczba1 * liczba2);
        System.out.println(liczba1 / liczba2);
        
        
        Scanner g = new Scanner(System.in); 
        System.out.println("Podaj liczbe: ");
        int liczba3 = g.nextInt();
        System.out.println(liczba3 + 140);
        System.out.println(liczba3 - 31);
        System.out.println(liczba3 * 7);
        System.out.println(liczba3 / 13);
        System.out.println(liczba3 % 7);
        System.out.println((int)liczba3 / 7);
        System.out.println(Math.pow(liczba3,45));
        System.out.println(liczba3&67);
        System.out.println(liczba3 | 59);
        System.out.println(liczba3 ^ 23);
        System.out.println(liczba3 << 5);
        System.out.println(liczba3 >> 6);
    }
}