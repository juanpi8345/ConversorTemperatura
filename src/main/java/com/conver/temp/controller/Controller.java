
 
package com.conver.temp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @GetMapping("temp/{temperatura}")
    public int devolverTemperatura(@PathVariable int temperatura){
        int tempFaren = temperatura;
        int gradosCel=  (tempFaren-32) * 5/9;
        return gradosCel;
    }
    
}
