package networking;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class URLDemo {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://jsonplaceholder.typicode.com/posts/1");
        System.out.println(url.getHost());
        System.out.println(url.getDefaultPort());

        URLConnection urlConn = url.openConnection();
        System.out.println(urlConn.getContentType());
        System.out.println(urlConn.getContentLength());
        int c;
        if (urlConn.getContentLength() != 0) {
            InputStream stream = urlConn.getInputStream();
            while ((c = stream.read()) != -1) {
                System.out.print((char) c);
            }
        }

        HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
        System.out.println(httpConn.getResponseMessage());

    }
}
