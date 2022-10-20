package net.yorksolutions.jsonexample;

import org.springframework.stereotype.Service;

import java.net.Inet4Address;
import java.net.UnknownHostException;


@Service
public class JsonService {

    String ipaddress;

    public String getIp() {
        try {
            this.ipaddress = String.valueOf(Inet4Address.getLocalHost());
            return this.ipaddress;
        } catch (UnknownHostException e) {
           return ("Something went wrong");
        }
    }




}
