package com.javabootcamp.bootcamp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.RequestWrapper;
import java.util.Scanner;

@RestController
public class MAinController {

    @RequestMapping("/")
    public String ShowIndex()
    {
        String UserName="";
        Scanner keyboard = new Scanner(System.in);
        UserName = keyboard.nextLine();
        String greet = "Hello " + UserName;
        System.out.println(greet);
        return greet;
    }
}
