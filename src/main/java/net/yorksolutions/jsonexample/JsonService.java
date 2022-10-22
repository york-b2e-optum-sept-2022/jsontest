package net.yorksolutions.jsonexample;

import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.util.Enumeration;
import java.util.HashMap;


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

public HashMap getecho(HttpServletRequest request) {
        String uri = request.getRequestURI();
        String[] tokenList = uri.split("/");

        HashMap map = new HashMap();
        for (int i = 2; i < tokenList.length; i+= 2) {
            String key = tokenList[i];

            String value = "";
            if (i + 1 < tokenList.length) {
                value = tokenList[i + 1];
            }

            map.put(
                    key,
                    value
            );
    }
        return map;

}

public HashMap getMD5() {
        return new HashMap();
}

public HashMap getHeader(HttpServletRequest request) {
        HashMap map = new HashMap();
    Enumeration<String> headerNameList = request.getHeaderNames();
    while(headerNameList.hasMoreElements()) {
        String headerName = headerNameList.nextElement();
        String headerData = request.getHeader(headerName);
        map.put(headerName, headerData);
    }
        return map;
}




}
