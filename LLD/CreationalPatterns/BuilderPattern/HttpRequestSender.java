package LLD.CreationalPatterns.BuilderPattern;

public class HttpRequestSender {
    //Director class
    HttpRequestBuilder builder;
    public HttpRequestSender(HttpRequestBuilder builder) {
        this.builder = builder;
    }
    public void sendRequest() {
        HttpRequest request = builder.build();
        request.sendRequest();
        
    }

}
