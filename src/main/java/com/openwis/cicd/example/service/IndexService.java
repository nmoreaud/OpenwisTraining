package com.openwis.cicd.example.service;

import org.springframework.stereotype.Service;

import java.io.*;
import java.util.regex.Pattern;

@Service
public class IndexService {

  public int sumNumbers(int number1, int number2) {
    return number1 + number2;
  }
}
