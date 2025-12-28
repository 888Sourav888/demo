package LLD.CreationalPatterns.BuilderPattern;

public class client {
    public static void main(String[] args) {
        HttpRequestBuilder builder = new HttpRequestBuilder()
            .setMethod("POST")
            .setUrl("https://api.example.com/data")
            .setBody("{\"key\":\"value\"}")
            .setToken("abcdef123456");
        HttpRequestSender sender = new HttpRequestSender(builder);
        sender.sendRequest();
    }
}
