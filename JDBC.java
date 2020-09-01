
import java.sql.*;

public class JDBC {
	
	public static String firstname = new String();
	public static String lastname = new String();
	public static String major = new String();
	public static int nnumber = 0;
	public static String[][] data;
	

	public static void testing() {
		
		JDBC init = new JDBC();
		
	}
	
	public Object[][] initdb() {
		
		Object[] dat = new Object[4];
		Object[][] data = new Object[3][4];
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbtest", "root", "YES");
			
			Statement myst = con.createStatement();
			
			ResultSet myrs = myst.executeQuery("select * from students");
			
			int num = 0;
			while (myrs.next()) {
				
				firstname = myrs.getString("FirstName");
				lastname = myrs.getString("LastName");
				major = myrs.getString("Major");
				nnumber = myrs.getInt("Nnumber");
				
				dat = new Object[] {
						firstname,
						lastname,
						major,
						nnumber
					};
				data[num] = dat;
				num++;
			}
			
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		
		return data;
	}

}
