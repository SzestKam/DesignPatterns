package pattern.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>(){{
            add("a");
            add("b");
            add("c");
            add("d");
        }};

        list.add("c");

/*        for (String el : list) {
            if("c".equals(el)){
                list.remove(el);
            }
        }*/
        System.out.println("Full list");
        for (String el : list) {
            System.out.println(el);
        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String el = iterator.next();
            if("c".equals(el)){
                iterator.remove();
            }
        }

        System.out.println("Shorter list");
        for (String el : list) {
            System.out.println(el);
        }
    }
}
