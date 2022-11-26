package day30maps;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap01 {
    /*
          1)TreeMap puts the entries in "Natural Order" according to "Keys"
          2)Tree map is the slowest Map
          3)TreeMap not "thread-safe", and it is not "synchronized". It means you cannot use in multi thread operation.
          4)
     */
    public static void main(String[] args) {
        TreeMap<String,Integer> countryPopulations = new TreeMap<>();
        countryPopulations.put("USA",40000000);
        countryPopulations.put("Germany",85000000);
        countryPopulations.put("Turkey",81000000);
        countryPopulations.put("Afghanistan",30000000);
        System.out.println(countryPopulations);//{Afghanistan=30000000, Germany=85000000, Turkey=8100000, USA=40000000}

        //If the "key" inside the ceilingEntry() method parenthesis is the same with any key inside the TreeMap, you will get the entry itself.
        //If the "key" inside the ceilingEntry() method parenthesis is before any key, it returns the next entry.
        Map.Entry<String,Integer> abc =  countryPopulations.ceilingEntry("");
        System.out.println(abc);

        //ceilingKey() It works for key's like the same logic of ceilingEntry().
        String x = countryPopulations.ceilingKey("S");
        System.out.println(x);//Turkey

        //descendingMap() It gives me the Entry's on a map with Descending Order.
        NavigableMap<String, Integer> mapInDescendingOrder = countryPopulations.descendingMap();
        System.out.println(mapInDescendingOrder);//{USA=40000000, Turkey=81000000, Germany=85000000, Afghanistan=30000000}

        //floorEntry() method is the reverse of the ceilingEntry(). When you use floorEntry() it will give me to previous element .
        //ceilingEntry gives the next Entry.
        Map.Entry<String,Integer> def = countryPopulations.floorEntry("Germany");
        System.out.println(def); //Germany=85000000


        //lowerEntry() method gives the previous one all the time . Even if you type existing key it will give the previous entry.
        //But floorEntry() will give the same value if you type existing value that is the difference between lowerEntry() and floorEntry()
        //lowerEntry() method is like "<", floorEntry() is like "<="
        Map.Entry<String,Integer> ghi = countryPopulations.lowerEntry("Germany");
        System.out.println(ghi);//Afghanistan=30000000

        //subMap("Afghanistan","Turkey"); Is this method first one is inclusive , Second one is exclusive.
        SortedMap<String,Integer> subMap1 = countryPopulations.subMap("Afghanistan","Turkey");
        System.out.println(subMap1);//{Afghanistan=30000000, Germany=85000000}

        //This is much useful.
        NavigableMap<String,Integer> subMap2 = countryPopulations.subMap("Afghanistan",false,"Turkey",true);
        System.out.println(subMap2);//{Germany=85000000, Turkey=81000000}

        //tailMap("Turkey"); It is like substring with a single number. It is like give me the Turkey and after entries from turkey.
        SortedMap<String, Integer> tailMap1 = countryPopulations.tailMap("Turkey");
        System.out.println(tailMap1);//{Turkey=81000000, USA=40000000}

        //It is much useful it is giving us the flexibility.
        NavigableMap<String,Integer> tailMap2 = countryPopulations.tailMap("Turkey",false);
        System.out.println(tailMap2);//{USA=40000000}
    }
}
