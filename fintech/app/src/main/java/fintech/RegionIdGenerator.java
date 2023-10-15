package fintech;

import java.util.HashMap;

public class RegionIdGenerator {
    final static private Integer COUNT_REGION = 89;
    static private Integer countAddedElements = 0;
    final static private HashMap<String, Integer> database = new HashMap<>(COUNT_REGION * 2);

    static public Boolean containsElement(String element)  {
        return database.containsKey(element);
    }

    static public Integer getElement(String element) { 
        return database.get(element);
    }

    // return and keep first value for key 
    static public Integer putElement(String element) {
        if(!containsElement(element)) {
            database.put(element, ++countAddedElements);
        }
        return getElement(element);
    }
}
