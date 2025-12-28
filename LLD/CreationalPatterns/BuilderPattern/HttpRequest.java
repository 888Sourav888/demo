package LLD.CreationalPatterns.BuilderPattern;

public class HttpRequest {
    //Product class
    String method ; 
    String url ; 
    String body ; 
    String token ; 

    public HttpRequest(String method, String url, String body, String token) {
        this.method = method;
        this.url = url;
        this.body = body;
        this.token = token;
    }

    public void sendRequest() {
        System.out.println("Sending " + method + " request to " + url);
        if (body != null) {
            System.out.println("Request Body: " + body);
        }
        if (token != null) {
            System.out.println("Using Token: " + token);
        }
        // Simulate sending request
        System.out.println("Request sent successfully!");
    }
}
