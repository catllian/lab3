import java.util.ArrayList;
import java.util.List;

import java.io.IOException;
import java.net.URI;

    String[] str;

class Handler {

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return null;
        }
        else if (url.getPath().contains("/add-message")) {
            String[] parameters = url.getQuery().split("=");
            str[str.length-1] = parameters[1];
            for (int i = 0; i < str.length; i++) {
                System.out.println("\n" + str[i]);
            }
        }
        else {
            return "404 Not Found!";
        }
    }
}

class SearchEngine {
    public static void main (String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try an number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}