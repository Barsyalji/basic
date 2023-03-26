import java .sql.*;
import java .util.*;
class SQlTest{
	public static void main (String [] args){
	
	Class.Forname("com.mysql.jdbc.Driver")
	Connection con = DriverManager.getConnection("jdbc:mysql:///db1","root","2338");
	Statement st=con.createSatement();
	ResultSet rs= st.excuteQuery("select*from student");
	while(rs.next())
	{
	System.out.println(rs.getint(1)""rs.getstring(2)=""=rs.getstring(3));
	}
	rs.close();
	st.close();
	con.close();
	}
	}