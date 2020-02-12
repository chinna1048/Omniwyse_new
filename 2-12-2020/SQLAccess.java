package DataCollection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.lang.NumberFormatException;
public class SQLAccess {

	public void data_send_Database(String str,LocalDate[] dates) {
		String data[]=str.split(",");
		int sn = Integer.parseInt(data[0]);
		String empNo = data[1];
		String name = data[2];
		String manNo = data[3];
		String manName= data[4];
		String loc = data[5];
		LocalDate postdt=dates[0];
		LocalDate fromdt=dates[1];
		LocalDate todt = dates[2];
		Double ddd=Double.parseDouble(data[6]);
		int days=(int)Math.round(ddd);
		String expdt=data[7];
		String reason = data[8];
		String remarks = data[9];
		String decisition="E";
		int dec=1;
		String url="jdbc:mysql://localhost:3306/leave";
		String user="root";
		String passwd="";
		
		try(Connection conn = DriverManager.getConnection(url, user, passwd))
		{	
	       if (conn != null) {
	    	   System.out.println("Connected");
	    	   String sql = "INSERT INTO employee_details"+" VALUES ("+
	    			   									sn+","+
														"'"+empNo+"'"+","+
														"'"+name+"'"+","+
														"'"+manNo+"'"+","+
														"'"+manName+"'"+","+
														"'"+loc+"'"+","+
														"'"+postdt+"'"+","+
														"'"+fromdt+"'"+","+
														"'"+todt+"'"+","+
														days+","+
														"'"+expdt+"'"+","+
														"'"+reason+"'"+","+
														"'"+remarks+"'"+","+
														"'"+decisition+"'"+","+
														dec+
														")";	
	    	   
	    	   
	            PreparedStatement preparedStmt = conn.prepareStatement(sql);
	            preparedStmt.execute();
	            conn.close();
	       }
		}
		catch (SQLException ex) 
		{
	        System.out.println("An error occurred. Maybe user/password is invalid");
	        ex.printStackTrace();
	    }
	}
}
