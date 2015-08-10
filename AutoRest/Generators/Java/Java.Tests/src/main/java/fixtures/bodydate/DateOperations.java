// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.


package fixtures.bodydate;

import com.microsoft.rest.ServiceException;
import retrofit.Callback;
import retrofit.client.Response;

public interface dateOperations {
    @GET("/date/null")
    Date getNull();

    @GET("/date/null")
    void getNullAsync(Callback<Date> cb);

    @GET("/date/invaliddate")
    Date getInvalidDate();

    @GET("/date/invaliddate")
    void getInvalidDateAsync(Callback<Date> cb);

    @GET("/date/overflowdate")
    Date getOverflowDate();

    @GET("/date/overflowdate")
    void getOverflowDateAsync(Callback<Date> cb);

    @GET("/date/underflowdate")
    Date getUnderflowDate();

    @GET("/date/underflowdate")
    void getUnderflowDateAsync(Callback<Date> cb);

    @PUT("/date/max")
    void putMaxDate(Date dateBody);

    @PUT("/date/max")
    void putMaxDateAsync(Date dateBody, Callback<Response> cb);

    @GET("/date/max")
    Date getMaxDate();

    @GET("/date/max")
    void getMaxDateAsync(Callback<Date> cb);

    @PUT("/date/min")
    void putMinDate(Date dateBody);

    @PUT("/date/min")
    void putMinDateAsync(Date dateBody, Callback<Response> cb);

    @GET("/date/min")
    Date getMinDate();

    @GET("/date/min")
    void getMinDateAsync(Callback<Date> cb);

}
