<%@ page import="java.io.*, java.net.*" %>
<HTML>
    <HEAD>
        <TITLE>Creating Client/Server Applications</TITLE>
    </HEAD>
        <BODY>
        <H1>Creating Client/Server Applications</H1>
        <% 
        try{
            int character;
            Socket socket = new Socket("127.0.0.1", 8765);
            int i;
            FileInputStream fis = new FileInputStream ("/path/to/your/image.jpg");
            DataOutputStream os = new DataOutputStream(socket.getOutputStream());
            while ((i = fis.read()) > -1)
                os.write(i);
            InputStream inSocket = socket.getInputStream();
            OutputStream outSocket = socket.getOutputStream();
            String str = "Hello!\n";
            byte buffer[] = str.getBytes();
            outSocket.write(buffer);
            while ((character = inSocket.read()) != -1) {
                out.print((char) character);
            }
            socket.close();
        }
        catch(java.net.ConnectException e){
        %>
        <%
        }
        %>
    </BODY>
</HTML>