package net.yorksolutions.jsonexample;


import org.springframework.web.bind.annotation.*;




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

    @GetMapping("/ip")
    public String genHeader() {
        return this.jsonService.getIp();
    }

}
