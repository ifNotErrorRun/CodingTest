package study.codingtest.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_25314 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    double n = Double.parseDouble(br.readLine());
    System.out.println("long ".repeat((int) Math.ceil(n / 4)) + "int");
  }

}