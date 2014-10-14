/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3histogram;

/**
 *
 * @author usuario
 */
import java.util.HashMap;
public class Histogram <Type> extends HashMap <Type, Integer>{
    
    @Override
    public Integer get(Object key){
        if(containsKey(key))
            return super.get(key);
        return 0;
    }
    
}
