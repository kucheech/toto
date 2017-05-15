
import java.security.SecureRandom;
import java.util.HashSet;

// Generates unique 6 numbers from 1 to 49, unsorted
public class Toto {
   
    public static void main(String[] args) {
        
        SecureRandom r;
        HashSet<Integer> s = new HashSet<Integer>();
        do {
            r = new SecureRandom();
            int n = r.nextInt(49) + 1;
            s.add(n);
        } while(s.size() < 6);
        
        for(int n: s) {
            System.out.println(n);
        }
    }
    
}
