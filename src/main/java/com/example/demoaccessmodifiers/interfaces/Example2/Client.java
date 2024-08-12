package com.example.demoaccessmodifiers.interfaces.Example2;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        ListStack st = new ListStack();

        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st.top());
        st.pop();
        System.out.println(st.top());

        Map<String, String> map = new HashMap<>();
        map.put("id1", "Saharsh");
        map.get("id1");

        List<String> list = new ArrayList<>();
        list.add("10");
        list.get(0);


//        Map<Integer, String> map2 = new TreeMap<>();
    }
}
