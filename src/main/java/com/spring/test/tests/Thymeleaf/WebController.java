package com.spring.test.tests.Thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Thymeleaf是一个基于Java的库，用于创建Web应用程序。
 * 它为在Web应用程序中提供XHTML/HTML5提供了很好的支持。
 */
@Controller
public class WebController {

   @RequestMapping(value = "/index")
   public String index() {
      return "index";
   }
}
