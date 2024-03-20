package com.athang.javatraining.basicjava;

import java.util.Arrays;
import java.util.List;

public class StringSplitting {
    public static void main(String[] args) {
        String names = "Tshering,   Sonam,   Tashi,   Sunil     , Thinley";
        String nameArray[] = names.split(",");
        List<String> nameList = Arrays.asList(nameArray);

        for(String n: nameList){
            System.out.println(n.strip());
        }
    }
}
