import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Random random =new Random();
        ArrayList<String> kerdesek = new ArrayList<>(){{add("OSI modell 1. réteg");add("OSI modell 2. réteg");add("OSI modell 3. réteg");add("OSI modell 4. réteg");add("OSI modell 5. réteg");add("OSI modell 6. réteg");add("OSI modell 7. réteg");add("TCP/IP modell 1. réteg");add("TCP/IP modell 2. réteg");add("TCP/IP modell 3. réteg");add("TCP/IP modell 4. réteg");}};
        ArrayList<String> plusz = new ArrayList<>(){{add(" adat típusok");add(" adat típusok");add(" adat típusok angolul");add(" adat típusok angolul");add(" protokolok");add(" protokolokangolul");add(" angolul");add(" angolul");add(" angolul");add("");add("");add("");add("");add("");add("");add("");add("");}};
        ArrayList<String> Tmodellek = new ArrayList<>() {{add("OSI modell");add("OSI modell angolul");add("OSI modell visszafelé");add("OSI modell visszafelé angolul");add("TCP/IP modell");add("TCP/IP modell angolul");add("TCP/IP modell visszafelé");add("TCP/IP modell visszafelé angolul");}};

        while (true)
        {
            int rszam = random.nextInt(4);
            int rkerdesek = random.nextInt(kerdesek.size());
            int rmodellek = random.nextInt(Tmodellek.size());
            int rplusz = random.nextInt(plusz.size());
            if(rszam == 0) System.out.println(kerdesek.get(rkerdesek)+plusz.get(rplusz));
            if(rszam == 1) System.out.println(kerdesek.get(rkerdesek)+plusz.get(rplusz));
            if(rszam == 2) System.out.println(kerdesek.get(rkerdesek)+plusz.get(rplusz));
            else System.out.println(Tmodellek.get(rmodellek));

            
            Scanner belvass = new Scanner(System.in);
            String alma = belvass.nextLine();
        }
    }

}