package com.openwis.cicd.example.service;

import static org.junit.Assert.assertEquals;

import com.openwis.cicd.example.controller.IndexController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IndexServiceTest {

  @InjectMocks
  private IndexService helloWorldService;

  @InjectMocks
  private IndexController indexController;

  @Test
  public void getSumTest() {
    int theSum = helloWorldService.sumNumbers(1, 1);
    assertEquals(2, theSum);
  }

  @Test
  public void sayHelloTest() {
    String res = indexController.sayHello();
    assertEquals("hello", res);
  }

  @Test
  public void getSum2Test() {
    String res = indexController.getSum(100, 1000);
    assertEquals("The sum of the two numbers is: " + Integer.toString(1100), res);
  }
}
