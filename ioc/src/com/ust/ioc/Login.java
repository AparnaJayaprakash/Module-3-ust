package com.ust.ioc;

public class Login {
	
	private String userName;
	private String password;
	DbConnection db;                    //for initialising this we are using set method
	
	
	
	public DbConnection getDb() {
		return db;
	}



	public void setDb(DbConnection db) {
		this.db = db;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String validate() {
		
		//obtain connections to database and writes sql
		//to verify username and passwords exist in database.
		
		//db = new DbConnection();           commenting this wont give error coz it is already declared in set method
		Connection con = db.getConnection();
		return "Login Validated...!!!";
		
		
	}

}
