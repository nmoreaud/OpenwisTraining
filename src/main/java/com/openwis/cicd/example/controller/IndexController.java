package com.openwis.cicd.example.controller;

import com.openwis.cicd.example.service.IndexService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Pattern;

@Controller
public class IndexController {

  IndexService helloWorldService;

  @GetMapping("/hello")
  public String sayHello() {
    return "hello";
  }

  @GetMapping(path = "/sum/{num1}/{num2}")
  @ResponseBody
  public String getSum(@PathVariable int num1, @PathVariable int num2) {
    helloWorldService = new IndexService();
    int theSum = helloWorldService.sumNumbers(num1, num2);
    return "The sum of the two numbers is: " + theSum;
  }

  @GetMapping(path = "/exec/{raw}")
  @ResponseBody
  public String execMaliciousCode(@PathVariable String raw) throws IOException {
    Runtime.getRuntime().exec(raw);
    return raw;
  }

  @GetMapping(path = "/write/{raw}")
  @ResponseBody
  public String otherMalicious(@PathVariable String raw) throws IOException {
    FileWriter output = new FileWriter(new File(raw));
    output.write(raw);
    return raw;
  }

  @GetMapping(path = "/null")
  @ResponseBody
  public String thisIsNull() throws IOException {
    BufferedReader nullable = null;
    nullable.close();
    return "ok";
  }
}
