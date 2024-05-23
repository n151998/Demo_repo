package com.example.demo_first;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstApi {

    @RequestMapping("/Hello")
    public String SayHello(){

        return "Hello World....I will become very good developer in 4.5 months";

    }

    @RequestMapping("/Hello/{name}")
    public String SayHelloName(@PathVariable("name") String name){

        return "Hello World.....I am "+name;

    }

    @RequestMapping("/Hello/{name}/{times}")
    public String SayHelloNameTimes(@PathVariable("name") String name,@PathVariable("times") int times){
       String str="";
       for(int i=0; i<times; i++){
           str+=name+" "+(i+1);
           str=str+"<br>";
       }
       return str;

    }

}
