/*
	12. Write a Java program to create a database, 
		table in the database, 
		insert values into the table, 
		update the values in the table, 
		and drop the table from the database with MySQL.
*/

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

class dbConnect {
	Statement s;
	Connection c;
	dbConnect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql://localhost/sys","root","root");
			s=c.createStatement();
			s.execute("create table stu1(regno INTEGER not NULL, name text(16), Dept text(6),city text(6))");
			System.out.println("Table created");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class dbInsert {
	dbInsert(dbConnect x) {
		try {
			x.s.execute("insert into stu1 values(001, 'sara', 'CS', 'beng')");
			x.s.execute("insert into stu1 values(002, 'mary', 'CS', 'beng')");
			System.out.println("Records inserted");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class dbUpdate {
	dbUpdate(dbConnect x) {
		try {		      
			String sql = "UPDATE stu1 " + "SET dept = 'CSE' WHERE regno in (001)";
			x.s.executeUpdate(sql);
			System.out.println("Table Updated");
		}
		catch (Exception e) {
			e.printStackTrace();
		} 
	 }  
}

class dbDrop {
	Statement s;
	Connection c;
	dbDrop(dbConnect x) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql://localhost/sys","root","root");
			s=c.createStatement();
			String sql = "DROP TABLE stu1";
         		s.executeUpdate(sql);
			System.out.println("Table Dropped");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class Database {
	public static void main(String args[]) {
		dbConnect x = new dbConnect();
		dbInsert y = new dbInsert(x);
		dbUpdate z = new dbUpdate(x);
		dbDrop w = new dbDrop(x);
	}
}