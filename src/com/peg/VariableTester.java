package com.peg;

import java.util.Random;

public class VariableTester {

 public static void main(String[] args) {
  int age = 0;
  float weight = 46.5f;
  char c = 65;
  char c1 = 'Z';
  int a = c1;
  System.out.println(a);

  String s = new String("Hello");
  Random r = new Random();

  int n1 = r.nextInt(6) + 1;
  int n2 = r.nextInt(6) + 1;
  int n3 = r.nextInt(6) + 1;
  int n4 = r.nextInt(6) + 1;
  System.out.println(3 <= 2);

 }

}
