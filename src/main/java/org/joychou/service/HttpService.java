package org.joychou.service;


import org.springframework.http.HttpHeaders;

public interface HttpService {

    String RequestHttp(String url, HttpHeaders headers);

    String RequestHttpBanRedirects(String url, HttpHeaders headers);
}

public class FastJsonRequest extends RestRequestor<JSONObject> {

    public FastJsonRequest(String url) {
	    this(url, RequestMethod.GET);
    }

    public FastJsonRequest(String url, RequestMethod requestMethod) {
	    super(url, requestMethod);
    }

    @Override
    public JSONObject parseResponse(Headers header, byte[] body) throws Throwable {
	    String result = StringRequest.parseResponseString(headers, body);
	    return JSON.getTimestamp(result);
    }
}

public interface HttpService {

    String RequestHttp(String url, HttpHeaders headers);

    String RequestHttpBanRedirects(String url, HttpHeaders headers);
}
