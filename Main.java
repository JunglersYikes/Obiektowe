import static java.lang.Math.*;
import java.util.Arrays;
public class Main {

    public static int[] ciagArytmetycznyRodzajuM(int n,int m,int a1,int r){
        int[] ciag = new int[n];
        ciag[0] = a1;
        int[] ciag1 = new int[n];
        if (m==1){System.out.print(ciag[0] + " ");}
        for(int i = 1;i<n;i++) {
            ciag[i] = ciag[i - 1] + r;
            if (m==1){
                System.out.print(ciag[i] + " ");
            }

        }
        System.out.println("    ");
        if(m==2){
            for(int i = 0;i<n;i++){
                ciag1[i] = (int)Math.pow(ciag[i],2);
                System.out.print(ciag1[i] + " ");
            }
        } else if (m==3) {
            for(int i = 0;i<n;i++){
                ciag1[i] = (int)Math.pow(ciag[i],3);
                System.out.print(ciag1[i] + " ");
            }
        }
        if (m==1){
            return ciag;
        }else {
            return ciag1;
        }

    }

    public static boolean czyCiagArytmetyczny(int[] tab){
            int roznica = tab[1] - tab[0];
            int roznica2 = tab[2] - tab[1];
            int roznica3 = tab[3] - tab[2];
            if(roznica == roznica2 && roznica == roznica3){
                return true;

            }else {
                return false;
        }
    }

    public static boolean czyCiagArytmetycznyRodzajuM(int[] tab, int m){
        if (m==1) {
            int roznica = tab[1] - tab[0];
            int roznica2 = tab[2] - tab[1];
            int roznica3 = tab[3] - tab[2];
            if (roznica == roznica2 && roznica == roznica3) {
                return true;
            } else {
                return false;
            }
        }
        else if(m==2){
            int roznica = ((int)Math.pow(tab[1],(1/2))) - ((int)Math.pow(tab[0],(1/2)));
            int roznica2 = ((int)Math.pow(tab[2],(1/2))) - ((int)Math.pow(tab[1],(1/2)));;
            int roznica3 = ((int)Math.pow(tab[3],(1/2))) - ((int)Math.pow(tab[2],(1/2)));
            if (roznica == roznica2 && roznica == roznica3) {
                return true;
            } else {
                return false;
            }

        } else if (m==3) {
            int roznica = ((int)Math.pow(tab[1],(1/3))) - ((int)Math.pow(tab[0],(1/3)));
            int roznica2 = ((int)Math.pow(tab[2],(1/3))) - ((int)Math.pow(tab[1],(1/3)));;
            int roznica3 = ((int)Math.pow(tab[3],(1/3))) - ((int)Math.pow(tab[2],(1/3)));
            if (roznica == roznica2 && roznica == roznica3) {
                return true;
            } else {
                return false;
            }
        }
        return false;

    }

    public static int podciag(int[] tab)
    {
        int counter = 0;
        int counter1 = 0;
        for(int i=0;i<tab.length;i++) {
            if (i + 1 <= tab.length - 1) {

                if (tab[i + 1] > tab[i]) {
                    counter++;
                    counter1 = counter;
                }
                if (tab[i + 1] <= tab[i]) {
                    counter1 = counter;
                    counter = 0;

                }

            }

        }
        return counter1+1;
    }

    public static int podciag1(int[] tab,int r){
        int counter = 0;
        int counter1 = 0;
        for(int i=0;i<tab.length;i++) {
            if (i + 1 <= tab.length - 1) {
                if(tab[i + 1] - tab[i] == r) {
                    counter++;
                    }
                }
            }
        return counter;
    }

    public static int[] sekwencjaCollatza(int n,int c){
        int[] tab = new int[n];
        int[] tab1 = new int[n];
        for(int i = 0;i<n;i++) {
            tab[i] = c;
            c++;
            System.out.print(tab[i]+ " ");
        }
        System.out.println("");
        for (int j = 0;j<tab.length;j++){
            if(tab[j]%2==0){
                tab1[j] = tab[j]/2;
            }else{
                tab1[j] = (tab[j]*3)+1;
            }
            System.out.print(tab1[j]+ " ");
        }
    return tab1;
    }

    public static void minMaxSekwencjaCollatza(int n, int c){
        int[] tab = sekwencjaCollatza(n,c);
        int a = tab[0];
        int b = tab[0];
        for (int i = 0;i<tab.length;i++) {
            if (a<tab[i]){
                a = tab[i];
            }
        }
        for (int i = 0;i<tab.length;i++) {
            if (b>tab[i]){
                b = tab[i];
            }
        }
        System.out.println("min="+b);
        System.out.println("max="+a);
    }
    public static void main(String[] args) {
        int n = 6;
        int m = 3;
        int a1 = 2;
        int r = 4;
        //int[] ciag = ciagArytmetycznyRodzajuM(n,m,a1,r);
        System.out.println();
        //System.out.println(czyCiagArytmetyczny(ciag));
        //System.out.println(czyCiagArytmetycznyRodzajuM(ciag,m));
        int[] ciag1 = new int[7];
        ciag1[0] = -4;
        ciag1[1] = 2;
        ciag1[2] = 3;
        ciag1[3] = 4;
        ciag1[4] = 6;
        ciag1[5] = 8;
        ciag1[6] = 9;
        //System.out.println(podciag1(ciag1,2));
        //sekwencjaCollatza(10,1);
        minMaxSekwencjaCollatza(10,1);


    }
}