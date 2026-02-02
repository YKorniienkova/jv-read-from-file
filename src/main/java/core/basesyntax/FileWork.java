package core.basesyntax;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class FileWork {
    public String[] readFromFile(String fileName) {
        //write your code here
        List<String> list = new ArrayList<>();
        File file = new File(fileName);

        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            String value;
            while ((value = reader.readLine()) != null) {
                String[] words = value.split("[\\s\\p{Punct}]+");
                for (String i : words) {
                    if (!value.isEmpty() && Character.toLowerCase(value.charAt(0)) == 'w') {
                        list.add(value.toLowerCase());
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Can't read file", e);
        }
        return null;
    }
}
