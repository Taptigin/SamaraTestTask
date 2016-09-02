package com.mycomp.ws;

import javax.jws.WebService;
import java.util.Date;

/**
 *  implementation of the interface TimeWebService
 *
 * Created by Александр on 02.09.2016.
 */
@WebService(endpointInterface = "com.mycomp.ws.TimeWebService")
public class TimeWebServiceImpl implements TimeWebService{
    /**
     * @see TimeWebService
     * @return
     */
    @Override
    public Date getTime() {
        return new Date(System.currentTimeMillis());
    }
}
