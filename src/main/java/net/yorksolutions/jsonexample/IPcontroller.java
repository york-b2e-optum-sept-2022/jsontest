package net.yorksolutions.jsonexample;


import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
public class IPcontroller {

    JsonService jsonService;

    public IPcontroller(JsonService jsonService) {
        this.jsonService = jsonService;
    }

    @GetMapping("/ip")
    public String genIp() {
        return this.jsonService.getIp();
    }

    @GetMapping("/date")
    public String genHeader() {
        return this.jsonService.getdate();
    }

}
