package hu.unimiskolc.mmb.restapi.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTask {

     public static int szamlalo = 0;

    @Scheduled(fixedRate = 1000)
    private void szamol(){
        szamlalo++;
    }

    int getSzamlalo(){
        return szamlalo;
    }

}
