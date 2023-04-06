package com.guramee;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, String> identity = new HashMap<>();

        identity.put("Name", "Christopher Joshua");
        identity.put("Email", "Chris********@hotmail.com");
        identity.put("Phone Number", "081xxxxxx");
        identity.put("Age", String.valueOf(true));

        System.out.println(identity.get("Age"));
        System.out.println(identity.containsKey("Age"));
        System.out.println(identity.put("Gender", "Male"));
        System.out.println(identity);
    }
}
