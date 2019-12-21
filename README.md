## SOAP Service Producer
#### Description for executing:
 * In MAVEN window choose jaxb2 -> jaxb2.xjc -> start
 * Start application
 * In 'POSTMAN' select "POST" method, 
    
    insert: http://localhost:8080/ws for URL,
 
    in 'Headers' select Content-Type and type text/xml in value column,
    
    in Body insert this:
 
 

         <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
          xmlns:gs="http://spring.io/guides/gs-producing-web-service">
             <soapenv:Header/>
             <soapenv:Body>
                <gs:getAddressRequest>
                   <gs:id>2</gs:id>
                </gs:getAddressRequest>
             </soapenv:Body>
          </soapenv:Envelope>
 
 
* Push "Send".
 