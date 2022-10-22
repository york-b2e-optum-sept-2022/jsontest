package net.yorksolutions.jsonexample;


import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
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
    public String gendate() {
        return this.jsonService.getdate();
    }

    @GetMapping("/header")
    public HashMap genHeader(HttpServletRequest request){
        return this.jsonService.getHeader(request) ;
    }

    @GetMapping("/echo/**")
    public HashMap getecho(HttpServletRequest request) {
        return this.jsonService.getecho(request);

    }

    @GetMapping("/md5")
    public HashMap getMD5(HttpServletRequest request) {
        return this.jsonService.getMD5();
    }


}
