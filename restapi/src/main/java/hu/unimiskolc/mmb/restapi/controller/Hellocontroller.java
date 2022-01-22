package hu.unimiskolc.mmb.restapi.controller;

import hu.unimiskolc.mmb.restapi.service.Hello;
import hu.unimiskolc.mmb.restapi.service.ScheduledTask;
import org.springframework.web.bind.annotation.*;


@RestController

public class Hellocontroller {


    @RequestMapping("/index")
    public String welcome() {
        return "index";
    }

    @GetMapping(value = "/hello")
    String helloVilag(){
        Hello hello = new Hello();
        return hello.toString();
    }

    @GetMapping(value = "/uptime")
    String szamlalo(){
        return "A szerver ennyi ideje fut: \n" + String.valueOf(ScheduledTask.szamlalo) +
                " sec";
    }

    @GetMapping(value = "/hello/{nev}")
    String helloSzemely(@PathVariable String nev){
        Hello hello = new Hello();
        return hello.toString(nev);
    }

    @GetMapping(value = "/ketto")
    String kettoproba(@RequestParam String a, String b){
        return a +"  "+b;

    }

}
