package com.mycomp.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.Date;

/**
 * interface for a soap web service
 *
 * Created by Александр on 02.09.2016.
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)

public interface TimeWebService {
    /**
     * method of getting current time
     * @return Date
     */
    @WebMethod
    public Date getTime();
}
