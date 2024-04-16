import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       HashSet<String> stringSet = new HashSet<String>();
       ArrayList<Integer> vector = new ArrayList<Integer>();
       Scanner scan = new Scanner(System.in);
       System.out.println("Dati numarul de perechi care vor fi citite: ");
       int n = scan.nextInt();
       scan.nextLine();
       int numberOfDistinctPairs=0;
       while(n>0)
       {
        String bigString =scan.nextLine();
        if(stringSet.add(bigString)==true)
        {
            numberOfDistinctPairs++;
        }
        vector.add(numberOfDistinctPairs);
        n--;
       }
       for( Integer i : vector)
       {
        System.out.println(i);
       }
       scan.close();
    }
}
