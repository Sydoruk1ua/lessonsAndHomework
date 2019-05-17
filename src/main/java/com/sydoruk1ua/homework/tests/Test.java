package com.sydoruk1ua.homework.tests;

public class Test {
    private static void method() {

    }

    public static void main(String[] args) {
        String s1 = "$BBaa";
        String s2 = "111";
        String s3 = "9a";
        String s4 = "FJ012";
        System.out.println(s1.matches("$([A-F.*|\\d]+[\\d]+)"));
        System.out.println(s2.matches("$([A-F.*|\\d]+[\\d]+)"));
        System.out.println(s3.matches("$([A-F.*|\\d]+[\\d]+)"));
        System.out.println(s4.matches("$([A-F.*|\\d]+[\\d]+)"));
    }
}

class Item {
    public int item;

    Item(int item) {
        this.item = item;
    }
}


/*  try {
            ArrayList<Integer> ar = new ArrayList<Integer>();
            List temp = ar; //1
            temp.add(new java.util.Date()); //2
            temp.add(new Float(1.66));
            Iterator it = ar.iterator();
            while (it.hasNext())
                System.out.println(it.next());
            System.out.println(ar.get(0));
        } catch (Exception e) {
            System.out.println(e.getClass());
        }
        }*/