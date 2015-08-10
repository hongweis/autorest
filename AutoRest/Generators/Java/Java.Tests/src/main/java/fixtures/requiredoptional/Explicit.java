// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.


package fixtures.requiredoptional;

import com.microsoft.rest.ServiceException;
import retrofit.Callback;
import retrofit.client.Response;

public interface explicit {
    @POST("/reqopt/requied/integer/parameter")
    ErrorModel postRequiredIntegerParameter(int bodyParameter);

    @POST("/reqopt/requied/integer/parameter")
    void postRequiredIntegerParameterAsync(int bodyParameter, Callback<ErrorModel> cb);

    @POST("/reqopt/optional/integer/parameter")
    void postOptionalIntegerParameter(int bodyParameter);

    @POST("/reqopt/optional/integer/parameter")
    void postOptionalIntegerParameterAsync(int bodyParameter, Callback<Response> cb);

    @POST("/reqopt/requied/integer/property")
    ErrorModel postRequiredIntegerProperty(IntWrapper bodyParameter);

    @POST("/reqopt/requied/integer/property")
    void postRequiredIntegerPropertyAsync(IntWrapper bodyParameter, Callback<ErrorModel> cb);

    @POST("/reqopt/optional/integer/property")
    void postOptionalIntegerProperty(IntOptionalWrapper bodyParameter);

    @POST("/reqopt/optional/integer/property")
    void postOptionalIntegerPropertyAsync(IntOptionalWrapper bodyParameter, Callback<Response> cb);

    @POST("/reqopt/requied/integer/header")
    ErrorModel postRequiredIntegerHeader(int headerParameter);

    @POST("/reqopt/requied/integer/header")
    void postRequiredIntegerHeaderAsync(int headerParameter, Callback<ErrorModel> cb);

    @POST("/reqopt/optional/integer/header")
    void postOptionalIntegerHeader(int headerParameter);

    @POST("/reqopt/optional/integer/header")
    void postOptionalIntegerHeaderAsync(int headerParameter, Callback<Response> cb);

    @POST("/reqopt/requied/string/parameter")
    ErrorModel postRequiredStringParameter(String bodyParameter);

    @POST("/reqopt/requied/string/parameter")
    void postRequiredStringParameterAsync(String bodyParameter, Callback<ErrorModel> cb);

    @POST("/reqopt/optional/string/parameter")
    void postOptionalStringParameter(String bodyParameter);

    @POST("/reqopt/optional/string/parameter")
    void postOptionalStringParameterAsync(String bodyParameter, Callback<Response> cb);

    @POST("/reqopt/requied/string/property")
    ErrorModel postRequiredStringProperty(StringWrapper bodyParameter);

    @POST("/reqopt/requied/string/property")
    void postRequiredStringPropertyAsync(StringWrapper bodyParameter, Callback<ErrorModel> cb);

    @POST("/reqopt/optional/string/property")
    void postOptionalStringProperty(StringOptionalWrapper bodyParameter);

    @POST("/reqopt/optional/string/property")
    void postOptionalStringPropertyAsync(StringOptionalWrapper bodyParameter, Callback<Response> cb);

    @POST("/reqopt/requied/string/header")
    ErrorModel postRequiredStringHeader(String headerParameter);

    @POST("/reqopt/requied/string/header")
    void postRequiredStringHeaderAsync(String headerParameter, Callback<ErrorModel> cb);

    @POST("/reqopt/optional/string/header")
    void postOptionalStringHeader(String bodyParameter);

    @POST("/reqopt/optional/string/header")
    void postOptionalStringHeaderAsync(String bodyParameter, Callback<Response> cb);

    @POST("/reqopt/requied/class/parameter")
    ErrorModel postRequiredClassParameter(Product bodyParameter);

    @POST("/reqopt/requied/class/parameter")
    void postRequiredClassParameterAsync(Product bodyParameter, Callback<ErrorModel> cb);

    @POST("/reqopt/optional/class/parameter")
    void postOptionalClassParameter(Product bodyParameter);

    @POST("/reqopt/optional/class/parameter")
    void postOptionalClassParameterAsync(Product bodyParameter, Callback<Response> cb);

    @POST("/reqopt/requied/class/property")
    ErrorModel postRequiredClassProperty(ClassWrapper bodyParameter);

    @POST("/reqopt/requied/class/property")
    void postRequiredClassPropertyAsync(ClassWrapper bodyParameter, Callback<ErrorModel> cb);

    @POST("/reqopt/optional/class/property")
    void postOptionalClassProperty(ClassOptionalWrapper bodyParameter);

    @POST("/reqopt/optional/class/property")
    void postOptionalClassPropertyAsync(ClassOptionalWrapper bodyParameter, Callback<Response> cb);

    @POST("/reqopt/requied/array/parameter")
    ErrorModel postRequiredArrayParameter(List<String> bodyParameter);

    @POST("/reqopt/requied/array/parameter")
    void postRequiredArrayParameterAsync(List<String> bodyParameter, Callback<ErrorModel> cb);

    @POST("/reqopt/optional/array/parameter")
    void postOptionalArrayParameter(List<String> bodyParameter);

    @POST("/reqopt/optional/array/parameter")
    void postOptionalArrayParameterAsync(List<String> bodyParameter, Callback<Response> cb);

    @POST("/reqopt/requied/array/property")
    ErrorModel postRequiredArrayProperty(ArrayWrapper bodyParameter);

    @POST("/reqopt/requied/array/property")
    void postRequiredArrayPropertyAsync(ArrayWrapper bodyParameter, Callback<ErrorModel> cb);

    @POST("/reqopt/optional/array/property")
    void postOptionalArrayProperty(ArrayOptionalWrapper bodyParameter);

    @POST("/reqopt/optional/array/property")
    void postOptionalArrayPropertyAsync(ArrayOptionalWrapper bodyParameter, Callback<Response> cb);

    @POST("/reqopt/requied/array/header")
    ErrorModel postRequiredArrayHeader(List<String> headerParameter);

    @POST("/reqopt/requied/array/header")
    void postRequiredArrayHeaderAsync(List<String> headerParameter, Callback<ErrorModel> cb);

    @POST("/reqopt/optional/array/header")
    void postOptionalArrayHeader(List<String> headerParameter);

    @POST("/reqopt/optional/array/header")
    void postOptionalArrayHeaderAsync(List<String> headerParameter, Callback<Response> cb);

}
