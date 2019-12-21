package soap.endpoints;

import io.spring.guides.gs_producing_web_service.GetAddressRequest;
import io.spring.guides.gs_producing_web_service.GetAddressResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import soap.repository.AddressRepository;

@Endpoint
public class AddressEndpoint {
    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

    @Autowired
    private AddressRepository repository;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAddressRequest")
    @ResponsePayload
    public GetAddressResponse getAddress(@RequestPayload GetAddressRequest request) {
        GetAddressResponse response = new GetAddressResponse();
        response.setAddress(repository.findAddress(request.getId()));
        return response;
    }
}
