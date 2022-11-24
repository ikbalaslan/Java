package day28collections;

import java.util.*;

public class Sets01 {
    /*
    1)Sets are for staring multiple non-primitive data in the same data type
    2)Sets are for staring unique data like email addresses, SSN, Phone Numbers in a Country...
    3)There are 3 different Sets: i)HashSet: Uses "Hashing Technique".
                                             It does not put the elements in any order
                                             HashSet accepts "null" as element
                                   ii)LinkedHashSet:Puts the elements in "Insertion Order".
                                   iii)TreeSet:Puts the element in "Natural Order"(Ascending Order in numbers,alphabetical Order in Strings).
                                       TreeSet is slow in adding elements
     Question: If you need to store "unique elements" in "natural order", which collection do you use ?
               Answer:TreeSet
     Question: But as you know TreeSet is very slow in adding elements How can you improve your code ?
               Answer:I create HashSet then I add the element into HashSet then I convert HashSet to TreeSet.

     */
    public static void main(String[] args) {

        HashSet<String> emails = new HashSet<>();
        System.out.println(emails);
        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
        emails.add("Fig"); // When you try to add repeated data, Java doesn't give any error and the last data will be overwritten to the previous data.
        emails.add(null);
        System.out.println(emails); // [null, Apple, Fig, Mango, Apricot, Orange]

        emails.remove("Fig");
        System.out.println(emails); //[Apple, Mango, Apricot, Orange]

        //emails.clear(); //Deletes all element from the HashSet
        //System.out.println(emails); // []

       //When you use clone method you can make data type object.
        Object emails2 =  emails.clone();
        System.out.println(emails2);

         HashSet<String> emails3 = (HashSet<String>) emails.clone();
        System.out.println(emails3);

        // LinkedHashSet
        LinkedHashSet<Integer> Ssn = new LinkedHashSet<>();
        Ssn.add(123456789);
        Ssn.add(234567891);
        Ssn.add(345678912);
        Ssn.add(456789123);
        Ssn.add(null);
        System.out.println(Ssn); //[123456789, 234567891, 345678912, 456789123]

        //TreeSet
       //1.Way Slower
       Long starting =System.currentTimeMillis();
        TreeSet<Integer> nums1 = new TreeSet<>();
        nums1.add(23);
        nums1.add(5);
        nums1.add(17);
        nums1.add(67);
        nums1.add(41);
        nums1.add(-5);
        //TreeSet does not accept null as element.
        System.out.println(nums1); // [-5, 5, 17, 23, 41, 67]
      Long middle = System.currentTimeMillis();
       //2.Way Faster
        HashSet<Integer> nums2 = new HashSet<>();
        nums2.add(23);
        nums2.add(5);
        nums2.add(17);
        nums2.add(67);
        nums2.add(41);
        nums2.add(-5);


        TreeSet<Integer> perfectNums = new TreeSet<>(nums2);
        System.out.println(perfectNums);

        Long ending = System.currentTimeMillis();
        System.out.println("1.Way" + (middle-starting));
        System.out.println("2.Way" + (ending-middle));


        
    }
}
