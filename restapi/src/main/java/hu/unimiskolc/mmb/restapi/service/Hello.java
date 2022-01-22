package hu.unimiskolc.mmb.restapi.service;

import org.springframework.stereotype.Service;

@Service
public class Hello {

    public String toString(){
        return "Helló Világ!";
    }

    public String toString(String nev){
        return "Helló " + nev + "!";
    }
}
