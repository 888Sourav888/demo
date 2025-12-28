package LLD.CreationalPatterns.BuilderPattern;

public class HttpRequestBuilder {
    //Builder class
    private String method;
    private String url;
    private String body;
    private String token;

    public HttpRequestBuilder setMethod(String method) {
        this.method = method;
        return this;
    }

    public HttpRequestBuilder setUrl(String url) {
        this.url = url;
        return this;
    }

    public HttpRequestBuilder setBody(String body) {
        this.body = body;
        return this;
    }

    public HttpRequestBuilder setToken(String token) {
        this.token = token;
        return this;
    }

    public HttpRequest build() {
        return new HttpRequest(method, url, body, token);
    }
}