package com.mycomp.endpoint;
import javax.xml.ws.Endpoint;
import com.mycomp.ws.TimeWebServiceImpl;
/**
 * Created by Александр on 02.09.2016.
 */

public class TimeWebServicePublisher {
    static boolean isStart = false;
    public static void main(String[] args) {

        startTime();

    }

    public static void startTime(){
        if(!isStart){
            Endpoint.publish("http://localhost:1986/wss/time", new TimeWebServiceImpl());
            isStart = true;
        }
    }
}
