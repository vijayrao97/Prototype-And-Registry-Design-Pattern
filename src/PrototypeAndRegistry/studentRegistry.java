package PrototypeAndRegistry;

import java.util.HashMap;
import java.util.Map;

public class studentRegistry {
    private Map<String,Student> map = new HashMap<>();

    void setRegister(String s, Student val){
        map.put(s,val);
    }

    Student getRegister(String s){
        return map.get(s).copy();
    }

}
