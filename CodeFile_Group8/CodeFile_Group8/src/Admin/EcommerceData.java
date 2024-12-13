
package Admin;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;

public class EcommerceData {
    //create method for connection to SQL database
    public static Connection mycon(){
        Connection con = null; 
        try {
        String servername = "LAPTOP-0PRD4KEQ\\TMYSQLEXPRESS";
        String user = "sa";
        String password = "pyqq";
        String db = "EcommerceData";
        int port = 1433;
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser(user);
        ds.setPassword(password);
        ds.setDatabaseName(db);
        ds.setServerName(servername);
        ds.setPortNumber(port);
        
        con = ds.getConnection();
        } catch(SQLServerException e) {
            System.out.println(e);
        }
        return con;
        
    }
}
