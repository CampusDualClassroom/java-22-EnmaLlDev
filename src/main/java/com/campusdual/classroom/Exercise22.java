package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Exercise22 {

    public static List<String> createArrayList() {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("GKFFD");
        arrayList.add("TNANA");
        arrayList.add("MPMSL");
        arrayList.add("PSWME");
        arrayList.add("LZMLF");
        arrayList.add("JYEBV");
        arrayList.add("YELNT");
        arrayList.add("JSNKR");
        arrayList.add("JFESF");
        arrayList.add("TMJLL");
        return arrayList;
    }

    public static void printElementsAndIndex(List<String> customList) {
        for (String item : customList) {
            System.out.println("Element: " + item + ", Index: " + customList.indexOf(item));
        }
    }

    public static boolean addElementToList(List<String> customList, String element) {
        customList.add(element);
        return true;
    }

    public static void main(String[] args) {
        List<String> exampleArrayList = createArrayList();
        addElementToList(exampleArrayList, "AAAAA");
        addElementToList(exampleArrayList, "AAAAA");
        printElementsAndIndex(exampleArrayList);
    }
}
