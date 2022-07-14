package grp1.DemoProj;
import java.sql.*;
public class App 
{
    public static void main( String[] args )
    {
        Connection conn=null;
        try
        {
        	Class.forName("orcale.jdbc.driver.OracleDriver");
        	conn=DriverManager.getConnection("jdbc.oracle:thin:@localhost:1521:xe","system","1234");
        	
        }
        catch(SQLException | ClassNotFoundException e)
        {
        	System.out.println("Connected");
        }
        
    }
}
