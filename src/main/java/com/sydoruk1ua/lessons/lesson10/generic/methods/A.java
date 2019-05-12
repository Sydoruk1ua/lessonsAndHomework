package com.sydoruk1ua.lessons.lesson10.generic.methods;

public class A {
  /*  private static Object k;

    public static <P> void methodStatic(P p) {

    }*/

   /* public <S> A(S s) {

    }*/
  /*  public static <P> P methodStatic2(P p) {
        return null;
    }*/

    public static void main(String[] args) {
        A a = new A();
        String string = a.method1("String"); // todo
    }

    public <S> S method1(S k) {
        return null;
    }


  /*  public <T extends Number, E> T method(T o, E e, int a, K k) {
        System.out.println(o);
        //
        return o;
    }*/
}
