import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

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
            while(docReader.hasNextLine()) {
                String line = docReader.nextLine();
                for (int i=0; i<line.length();i++) {
                    char c = toLowerCase(line.charAt(i));
                    if (hMap.containsKey(c)) {
                        hMap.replace(c, hMap.get(c)+1);
                    }
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

            ArrayList<Character> usedChars = new ArrayList<>();

            int largest = 0;
            char largestChar = 'a';

            //iterators
            Iterator itM = m.entrySet().iterator();
            Iterator itCc = correspondingChars.entrySet().iterator();
            int idx = 0;


            while (itCc.hasNext()) {
                while(itM.hasNext()) {
                    Map.Entry entry = (Map.Entry) itM.next();
                    if ((int)entry.getValue() >= largest && !usedChars.contains(entry.getKey())) {
                        largest = (int)entry.getValue();
                        largestChar = (char)entry.getKey();
                    }
                }
                correspondingChars.put(largestChar,cArr[idx]);
                largest = 0;
                usedChars.add(largestChar);
                itM = m.entrySet().iterator();
                idx++;
                itCc.next();
            }


            while (docReader.hasNextLine()) {
                String line = docReader.nextLine();
                for (int i=0; i<line.length(); i++) {
                    char c1 = Character.toLowerCase(line.charAt(i));
                    char c2 = line.charAt(i);
                    if (correspondingChars.containsKey(c1)) {
                        if (Character.isUpperCase(c2)) {
                            System.out.print(Character.toUpperCase(correspondingChars.get(c1)));
                        } else {
                            System.out.print(correspondingChars.get(c1));
                        }
                    } else {
                        System.out.print(c1);
                    }
                }
                System.out.println("");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Oops! It seems your file '"+path+"' cannot be found.");
        }
    }
}
