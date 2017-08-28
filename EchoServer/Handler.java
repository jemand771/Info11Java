import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Handler {

	private Scanner in;
	PrintWriter out;
	
	public Handler(Socket connection) throws IOException {
	    in  = new Scanner( connection.getInputStream() );
	    out = new PrintWriter( connection.getOutputStream(), true );
	}
	
	public void handle() {
		String input = in.nextLine();
		out.println(input);		
	}
}
