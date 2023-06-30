package InteractiveDictionary;

import java.util.*;

public class Dictionary {
    Map<String, String> dictionary= new HashMap<String,String>();

    public Dictionary(){}

    public void newEntry(String key, String value){
        dictionary.put(key, value);
    }

    public String look(String key){
        if(dictionary.get(key) == null) {return "Cant find entry for " + key;}
        return dictionary.get(key);
    }
}
