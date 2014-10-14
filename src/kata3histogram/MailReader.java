/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3histogram;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class MailReader {
    
    private final String filepath;

    public MailReader(String filepath) {
        this.filepath = filepath;
    }
    
    public String[] readDomains(){
        ArrayList<String> domainList = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader (new FileReader(filepath));
            while (true){
                String line = reader.readLine();
                if(line == null) break;
                if(line.contains("@"))
                    domainList.add(line.split("@")[1]);
            }
        } catch (IOException ex) {
        }
        return domainList.toArray(new String[domainList.size()]);
    }
}
