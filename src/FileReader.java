import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import static java.lang.Character.toLowerCase;

public class FileReader {
    public Map ReadFile(String path) {
        Map<Character, Integer> hMap = new HashMap<>();
        hMap.put('a', 0);
        hMap.put('b', 0);
        hMap.put('c', 0);
        hMap.put('d', 0);
        hMap.put('e', 0);
        hMap.put('f', 0);
        hMap.put('g', 0);
        hMap.put('h', 0);
        hMap.put('i', 0);
        hMap.put('j', 0);
        hMap.put('k', 0);
        hMap.put('l', 0);
        hMap.put('m', 0);
        hMap.put('n', 0);
        hMap.put('o', 0);
        hMap.put('p', 0);
        hMap.put('q', 0);
        hMap.put('r', 0);
        hMap.put('s', 0);
        hMap.put('t', 0);
        hMap.put('u', 0);
        hMap.put('v', 0);
        hMap.put('w', 0);
        hMap.put('x', 0);
        hMap.put('y', 0);
        hMap.put('z', 0);

        try {
            File txtDoc = new File(path);
            Scanner docReader = new Scanner(txtDoc);
            while(docReader.hasNext()) {
                char c = toLowerCase(docReader.next().charAt(0));
                if (hMap.containsKey(c)) {
                    hMap.replace(c, hMap.get(c)+1);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Oops! It seems your file '"+path+"' cannot be found.");
        }
        return hMap;
    }

    public void writeInTerminal(Map m, String path, char[] cArr) {
        try {
            File txtDoc = new File(path);
            Scanner docReader = new Scanner(txtDoc);
            // correspondingChars contains which characters in the file actually correspond to.
            Map<Character, Character> correspondingChars = new HashMap<>();
            correspondingChars.put('a', 'a');
            correspondingChars.put('b', 'a');
            correspondingChars.put('c', 'a');
            correspondingChars.put('d', 'a');
            correspondingChars.put('e', 'a');
            correspondingChars.put('f', 'a');
            correspondingChars.put('g', 'a');
            correspondingChars.put('h', 'a');
            correspondingChars.put('i', 'a');
            correspondingChars.put('j', 'a');
            correspondingChars.put('k', 'a');
            correspondingChars.put('l', 'a');
            correspondingChars.put('m', 'a');
            correspondingChars.put('n', 'a');
            correspondingChars.put('o', 'a');
            correspondingChars.put('p', 'a');
            correspondingChars.put('q', 'a');
            correspondingChars.put('r', 'a');
            correspondingChars.put('s', 'a');
            correspondingChars.put('t', 'a');
            correspondingChars.put('u', 'a');
            correspondingChars.put('v', 'a');
            correspondingChars.put('w', 'a');
            correspondingChars.put('x', 'a');
            correspondingChars.put('y', 'a');
            correspondingChars.put('z', 'a');

            int largest = (int) m.get('a');
            int cutoff = -1;
            char largestChar = 'a';

            //iterators
            Iterator it = m.entrySet().iterator();
            Iterator itCc = correspondingChars.entrySet().iterator();


            while(it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if ((int)entry.getValue() > largest && (int)entry.getValue() < cutoff) {
                    largest = (int)entry.getValue();
                    largestChar = (char)entry.getKey();
                }
            }

            while (docReader.hasNext()) {
                char c = docReader.next().charAt(0);
                if (Character.isUpperCase(c)) {

                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Oops! It seems your file '"+path+"' cannot be found.");
        }
    }



    /*
    public static int charIdx(char c) {
        c = toLowerCase(c);
        switch(c) {
            case 'a' :
                return 0;
            case 'b' :
                return 1;
            case 'c' :
                return 2;
            case 'd' :
                return 3;
            case 'e' :
                return 4;
            case 'f' :
                return 5;
            case 'g' :
                return 6;
            case 'h' :
                return 7;
            case 'i' :
                return 8;
            case 'j' :
                return 9;
            case 'k' :
                return 10;
            case 'l' :
                return 11;
            case 'm' :
                return 12;
            case 'n' :
                return 13;
            case 'o' :
                return 14;
            case 'p' :
                return 15;
            case 'q' :
                return 16;
            case 'r' :
                return 17;
            case 's' :
                return 18;
            case 't' :
                return 19;
            case 'u' :
                return 20;
            case 'v' :
                return 21;
            case 'w' :
                return 22;
            case 'x' :
                return 23;
            case 'y' :
                return 24;
            case 'z' :
                return 25;
        }
        return -1;
    }
     */
}
