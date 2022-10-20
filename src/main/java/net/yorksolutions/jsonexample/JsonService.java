package net.yorksolutions.jsonexample;

import org.springframework.stereotype.Service;

import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.time.LocalDateTime;


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

   String Tdate;
    public String getdate() {
        this.Tdate = String.valueOf(LocalDateTime.now());
        return "Date is " + Tdate;
    }




}
