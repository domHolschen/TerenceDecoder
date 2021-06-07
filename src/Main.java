import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // instantiating
        FileReader reader1 = new FileReader();
        // creating array that lists letters in order of abundance
        final char[] charArray = {'e','a','r','i','o','t','n','s','l','c','u','d','p','m','h','g','b','f','y','w','k','v','x','z','j','q'};
        final char[] charArray2 = {'e','t','a','o','i','n','s','h','r','d','l','c','u','m','w','f','g','y','p','b','v','k','j','x','q','z'};
        final char[] charArray3 = {'e','s','i','a','r','n','t','o','l','c','d','u','g','p','m','h','b','y','f','v','k','w','z','x','j','q'};
        final char[] charArray4 = {'e','t','a','o','i','n','s','r','h','d','l','u','c','m','f','y','w','g','p','b','v','k','x','q','j','z'};
        //this is charArray4 but I swapped around some of the letters
        final char[] charArray5 = {'e','t','n','i','o','a','s','r','h','l','d','u','m','c','f','y','g','p','b','w','v','k','x','q','j','z'};
        // reads from file 1, sets map1 to the return
        Map<Character, Integer> map1 = new HashMap<>(reader1.ReadFile("src//file1.txt"));
        reader1.writeInTerminal(map1,"src//file1.txt",charArray5);

    }
}


