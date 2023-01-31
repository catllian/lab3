import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return "";
        }
        else if (url.getPath().contains("/add-message")) {
            String[] parameters = url.getQuery().split("=");
            return String.format(parameters[1] + "\n");
        }
        else {
            return "404 Not Found!";
        }
    }

}

class StringServer {

    public static void main (String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try an number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }

}