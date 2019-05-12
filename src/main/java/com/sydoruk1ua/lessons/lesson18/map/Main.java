package com.sydoruk1ua.lessons.lesson18.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Map<Key, Value> map = new HashMap<>();
        Key key1 = new Key(1);
        Key key2 = new Key(1);
        map.put(key1, new Value("One"));
        map.put(key2, new Value("Two"));

        System.out.println(map.size());
        System.out.println(map.get(key2));

        key2.a = 10;

        System.out.println(map.size());
        System.out.println(map.get(key2));

        Set<Map.Entry<Key, Value>> entries = map.entrySet();

      /*  for (Map.Entry<Key, Value> entry:             ) {

        }*/

      entries.forEach(x -> System.out.println(x.getKey() + ": " + x.getValue()));
    }
}

class Key {
    public int a;

    public Key(int a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key = (Key) o;
        return a == key.a;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }
}

class Value {
    public String value;

    public Value(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
