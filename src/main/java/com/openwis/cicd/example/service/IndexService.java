package com.openwis.cicd.example.service;

import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class IndexService {

  public int sumNumbers(int number1, int number2) {
    return number1 + number2;
  }

  private static int tarte;
  private static int tata;

  public String execMaliciousCode(String raw) throws IOException {
    Runtime.getRuntime().exec(raw);
    return raw;
  }

  private String method1() {
    return null;
  }

  private String method2() {
    return method1() + "aaa";
  }

  private String method3() {
    return null;
  }
}
