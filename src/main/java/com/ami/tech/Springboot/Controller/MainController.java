package com.ami.tech.Springboot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// RestController is for REST API
// @Controller  - isme @Component lagane ki jarurat nhi hai ye is me hi laga hua hai

public class MainController {

  // @RequestMapping(value = "/", method = RequestMethod.GET)
  // or we can use direct get type of mapping
  @GetMapping("/")
  public String helloWorld() {
    return "Tech Talk India by Amitesh Thakur w3it ";
  }
}
