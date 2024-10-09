
import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter;
class HelloWorld {
    public static void main(String[] args) {
        /*
        String a = "Jakub Klimas";
        System.out.println(a);
        System.out.println(a.length());
        String x = "Ala ";
        String y = "ma ";
        String z = "kota";
        String ala = x + y + z;
        System.out.println(ala);
        String x1 = "* ";
        String x2 = "  ";
        System.out.println(x2.repeat(10) + x1.repeat(1));
        System.out.println(x2.repeat(10) + x1.repeat(2));
        System.out.println(x2.repeat(10) + x1.repeat(3));
        System.out.println(x1.repeat(14));
        System.out.println(x1.repeat(15));
        System.out.println(x1.repeat(14));
        System.out.println(x2.repeat(10) + x1.repeat(3));
        System.out.println(x2.repeat(10) + x1.repeat(2));
        System.out.println(x2.repeat(10) + x1.repeat(1));
        String x3 = " *";
        String x4 = " ";
        System.out.println(x4.repeat(5) + x3);
        System.out.println(x4.repeat(4) + x3.repeat(2));
        System.out.println(x4.repeat(3) + x3.repeat(3));
        System.out.println(x4.repeat(2) + x3.repeat(4));
        System.out.println(x4.repeat(1) + x3.repeat(5));
        System.out.println(x3.repeat(6));
        System.out.println(x4.repeat(1) + x3.repeat(5));
        System.out.println(x4.repeat(2) + x3.repeat(4));
        System.out.println(x4.repeat(3) + x3.repeat(3));
        System.out.println(x4.repeat(4) + x3.repeat(2));
        System.out.println(x4.repeat(5) + x3);
        System.out.println(ala.replace("a","e"));
        System.out.println(ala.toUpperCase());
        System.out.println(ala.toLowerCase());
        int ascii1 = 'A';
        int ascii2 = '!';
        int ascii3 = '@';
        int ascii4 = '>';
        int ascii5 = '~';
        int ascii6 = '\n';
        int ascii7 = '\b';
        System.out.println(ascii1);
        System.out.println(ascii2);
        System.out.println(ascii3);
        System.out.println(ascii4);
        System.out.println(ascii5);
        System.out.println(ascii6);
        System.out.println(ascii7);
        String tekst = "Grzesiek nie wiedzial dlaczego ... jest tak drapieznym ... mimo, ze jego ... na to nie wskazuje.";
        tekst = tekst.replaceFirst("\\.\\.\\.","grah");
        tekst = tekst.replaceFirst("\\.\\.\\.","memoria");
        tekst = tekst.replaceFirst("\\.\\.\\.","szczypior");
        System.out.println(tekst);
        String tekst2 = "... to najlepsza ksiazka napisana przez ...";
        tekst2 = tekst2.replaceFirst("\\.\\.\\.","Pan Tadeusz");
        tekst2 = tekst2.replaceFirst("\\.\\.\\.","Adama Mickiewicza");
        System.out.println(tekst2);
        String wodrze = "wodrze ";
        System.out.println(wodrze.repeat(5));
        */
        String grah = "Dzisiaj jest (dd-mm-rrrr) godzina (hh:mm:ss)";
        
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDateTime myDateObj = LocalDateTime.now();
        String formattedDate = myDateObj.format(myFormatObj);
        
        grah = grah.replace("(dd-mm-rrrr)",formattedDate);
        
        DateTimeFormatter godzina = DateTimeFormatter.ofPattern("HH:mm:ss");
        String fgodzina = myDateObj.format(godzina);
        
        grah = grah.replace("(hh:mm:ss)",fgodzina);
        System.out.println(grah);
        
        
        char q = 54, w = 103, e = 241, r = 67, t = 9999, y = 11;
        System.out.println(q);
        System.out.println(w);
        System.out.println(e);
        System.out.println(r);
        System.out.println(t);
        System.out.println(y);
    }
}