package com.mycomp.endpoint;
import javax.xml.ws.Endpoint;
import com.mycomp.ws.TimeWebServiceImpl;
/**
 * Created by Александр on 02.09.2016.
 */

public class TimeWebServicePublisher {
    public static void main(String[] args) {

        Endpoint.publish("http://localhost:1986/wss/time", new TimeWebServiceImpl());

    }
}
