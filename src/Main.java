import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // instantiating
        FileReader reader1 = new FileReader();
        // creating array that lists letters in order of abundance
        final char[] charArray = {'e','a','r','i','o','t','n','s','l','c','u','d','p','m','h','g','b','f','y','w','k','v','x','z','j','q'};
        // reads from file 1, sets map1 to the return
        Map<Character, Integer> map1 = new HashMap<>(reader1.ReadFile("src//file1.txt"));


    }
}


