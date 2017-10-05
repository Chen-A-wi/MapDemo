package com.example.a_wi.mapdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MainActivity extends AppCompatActivity {
    private Map<String, String> hashMap;
    private Map<String, String> linkedHashMap;
    private Map<String, String> treeMap;
    private Map<Keys, String> enumMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hashMap = new HashMap<String, String>();
        linkedHashMap = new LinkedHashMap<String, String>();
        treeMap = new TreeMap<String, String>();
        enumMap = new EnumMap<Keys, String>(Keys.class);
        hashMap();
        linkedHashMap();
        treeMap();
        enumMap();
    }

    private void hashMap() {
        System.out.println("======= HashMap =======");

        hashMap.put("2", "Tue");
        hashMap.put("3", "Wed");
        hashMap.put("1", "Mon");
        hashMap.put("4", "Thu");
        hashMap.put("5", "Fri");

        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + "   " + entry.getValue());
        }
    }

    private void linkedHashMap() {
        System.out.println("======= LinkedHashMap =======");

        linkedHashMap.put("2", "Tue");
        linkedHashMap.put("3", "Wed");
        linkedHashMap.put("1", "Mon");
        linkedHashMap.put("4", "Thu");
        linkedHashMap.put("5", "Fri");

        for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + "   " + entry.getValue());
        }
    }

    private void treeMap() {
        System.out.println("======= TreeMap =======");

        treeMap.put("2", "Tue");
        treeMap.put("3", "Wed");
        treeMap.put("1", "Mon");
        treeMap.put("4", "Thu");
        treeMap.put("5", "Fri");

        for (Map.Entry<String, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + "   " + entry.getValue());
        }

        System.out.println("----------by comparator");

        treeMap = new TreeMap<String, String>(new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        treeMap.put("2", "Tue");
        treeMap.put("3", "Wed");
        treeMap.put("1", "Mon");
        treeMap.put("4", "Thu");
        treeMap.put("5", "Fri");

        for (Map.Entry<String, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + "   " + entry.getValue());
        }
    }

    enum Keys {

        A(1), B(2), C(3), D(4), E(5);

        private int code;

        Keys(int code) {
            this.code = code;
        }

        public int getCode() {
            return this.code;
        }
    }

    private void enumMap() {
        System.out.println("======= EnumMap =======");

        enumMap.put(Keys.B, "Tue");
        enumMap.put(Keys.C, "Wed");
        enumMap.put(Keys.A, "Mon");
        enumMap.put(Keys.D, "Thu");
        enumMap.put(Keys.E, "Fri");

        for (Map.Entry<Keys, String> entry: enumMap.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getKey().getCode()+" "+entry.getValue());
        }
    }
}
