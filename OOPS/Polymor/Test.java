// package Polymor;

public class Test {
     public static void main(String[] args) {
          Test t = new Test();
          t.m(('a'));// char
          t.m(97); // Int
          t.m('a' + 'b');// Int
          t.m((char) 'a' + 'b');// Int
          t.m((char) ('a' + 'b'));// Char
          // t.m(10L);
     }

     public void m(char c) {
          System.out.println("Char");
     }

     public void m(int i) {
          System.out.println("Int");
     }
     // public void m(String s) {
     // System.out.println("String");
     // }

     // public void m(Object o) {
     // System.out.println("Object");
     // }

     // public void m(Integer i) {
     // System.out.println("Interger = " + i);
     // }
     // public void m(byte b) {
     // System.out.println("byte");
     // }

     // public void m(int i) {
     // System.out.println("Int");
     // }

     // public void m(short s) {
     // System.out.println("short");
     // }
     // public void m(int n) {
     // System.out.println("int");
     // }

     // public void m(float f) {
     // System.out.println("float");
     // }
}
