/*Copyright (c) 2016-2017 profiles.com All Rights Reserved.
 This software is the confidential and proprietary information of profiles.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with profiles.com*/
package com.custom_profile_deploy.services.countryinfoservice;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This DataFlex Web Service opens up country information. 2 letter ISO codes are used for Country code. There are functions to retrieve the used Currency, Language, Capital City, Continent and Telephone code.
 *
 * This class was generated by Apache CXF 2.7.11
 * 2017-04-18T06:16:57.866Z
 * Generated source version: 2.7.11
 * 
 */
@WebServiceClient(name = "CountryInfoService", 
                  wsdlLocation = "CountryInfoService.wsdl",
                  targetNamespace = "http://www.oorsprong.org/websamples.countryinfo") 
public class CountryInfoService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.oorsprong.org/websamples.countryinfo", "CountryInfoService");
    public final static QName CountryInfoServiceSoap = new QName("http://www.oorsprong.org/websamples.countryinfo", "CountryInfoServiceSoap");
    public final static QName CountryInfoServiceSoap12 = new QName("http://www.oorsprong.org/websamples.countryinfo", "CountryInfoServiceSoap12");
    static {
        URL url = CountryInfoService.class.getResource("CountryInfoService.wsdl");
        if (url == null) {
            url = CountryInfoService.class.getClassLoader().getResource("CountryInfoService.wsdl");
        } 
        if (url == null) {
            java.util.logging.Logger.getLogger(CountryInfoService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "CountryInfoService.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public CountryInfoService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CountryInfoService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CountryInfoService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CountryInfoService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CountryInfoService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CountryInfoService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns CountryInfoServiceSoapType
     */
    @WebEndpoint(name = "CountryInfoServiceSoap")
    public CountryInfoServiceSoapType getCountryInfoServiceSoap() {
        return super.getPort(CountryInfoServiceSoap, CountryInfoServiceSoapType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CountryInfoServiceSoapType
     */
    @WebEndpoint(name = "CountryInfoServiceSoap")
    public CountryInfoServiceSoapType getCountryInfoServiceSoap(WebServiceFeature... features) {
        return super.getPort(CountryInfoServiceSoap, CountryInfoServiceSoapType.class, features);
    }
    /**
     *
     * @return
     *     returns CountryInfoServiceSoapType
     */
    @WebEndpoint(name = "CountryInfoServiceSoap12")
    public CountryInfoServiceSoapType getCountryInfoServiceSoap12() {
        return super.getPort(CountryInfoServiceSoap12, CountryInfoServiceSoapType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CountryInfoServiceSoapType
     */
    @WebEndpoint(name = "CountryInfoServiceSoap12")
    public CountryInfoServiceSoapType getCountryInfoServiceSoap12(WebServiceFeature... features) {
        return super.getPort(CountryInfoServiceSoap12, CountryInfoServiceSoapType.class, features);
    }

}