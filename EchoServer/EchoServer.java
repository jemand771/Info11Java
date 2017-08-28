import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static void main(String[] args) throws IOException {

		ServerSocket server = new ServerSocket( 8080 );

		System.out.println("Server started, waiting for clients..");
		
		while (true) {
			Socket client = null;
			
			try
		      {
		        client = server.accept();
		        new Handler(client).handle();
		        System.out.println("New client!");
		        }
		      catch ( IOException e ) {
		        e.printStackTrace();
		      }
		      finally {
		        if ( client != null )
		          try { client.close(); } catch ( IOException e ) { }
		      }

		}
	}

}