package testScripts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arrayList {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList(10);
        ArrayList list3 = new ArrayList(list2);
        ArrayList<String> list4 = new ArrayList<String>();
        ArrayList<String> list5 = new ArrayList<>();
        ArrayList<Integer> list6 = new ArrayList<>(1);
        ArrayList<Integer> list7 = new ArrayList<>(2);
        list2.add("hawk");
        list2.add(Boolean.TRUE);
        list2.add(Boolean.FALSE);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list2.size());
        System.out.println(list1.isEmpty());
        int primitive = Integer.parseInt("123");
        Integer wrapper = Integer.valueOf("123");
        System.out.println("primit:  " + primitive + "\nwrapp:  " + wrapper);
        //--------------------------------- 29-12-18
        List<Integer> numbersy = new ArrayList<>();
        numbersy.add(1);
        numbersy.add(2);
        numbersy.remove(0);
        System.out.println(numbersy);
        //--------------------------------- 29-12-18
        List<String> list8 = new ArrayList<>();
        list8.add("hawk");
        list8.add("robin");
        Object[] ObjectArray = list8.toArray();
        System.out.println(ObjectArray.length);
        String[] stringArray = list8.toArray(new String[0]);
        System.out.println(stringArray.length);
        //--------------------------------- 30-12-18
        list6.add(99);
        list6.add(100);
        list6.add((int) 0.56);
        Collections.sort(list6);
        System.out.println(list6);
        System.out.println(list7.add(100));
    }
}
