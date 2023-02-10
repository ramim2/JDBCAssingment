package com.techpalle;

import java.sql.*;

public class Test {
	
		        private static final String url="jdbc:mysql://localhost:3306/palle";
				private static String username="root";
				private static String password="rootpassword";
				
				private static Connection con=null;
				private static Statement s=null;
				private static PreparedStatement ps=null;
			//	private static ResultSet rs=null;

				public void creating() {
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						con=DriverManager.getConnection(url,username,password);
						String qry ="create table Employee(eno int primary key,ename varchar(40),esal int)";
						s=con.createStatement();
						s.executeUpdate(qry);
				}
					catch(ClassNotFoundException e) 
					      {
						e.printStackTrace();
						
						}
					catch(SQLSyntaxErrorException e)
					{
						System.out.println("table exists");
					}
					catch(SQLException e){
						e.printStackTrace();
						
						}
					finally {
						try {
							
							if(s !=null) 
							{
								s.close();
							}
						
							if(con !=null) 
							{
						con.close();
							}
						}
						catch(SQLException e) {
							e.printStackTrace();
							}
						}
				}
						
					
				public void inserting(int eno,String ename ,int esal)
				{
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						con=DriverManager.getConnection(url,username,password);
						
						ps=con.prepareStatement("insert into Employee(eno,ename,esal) values (?,?,?)");
						ps.setInt(1, eno);
						ps.setString(2, ename);
						ps.setInt(3, esal);
						
						ps.executeUpdate();
						
					}
						catch(ClassNotFoundException e) {
							e.printStackTrace();
							
							}
					catch(SQLIntegrityConstraintViolationException e)
					{
						System.out.println("duplicate entry");
					}
					catch(SQLException e) {
						e.printStackTrace();
						
					}
					finally {
						try {
							if(ps!=null) {
								ps.close();
							}
							if(con!=null) {
								con.close();
							}
						}
						catch(SQLException e) {
							e.printStackTrace();
						}
					}
			}
				public void update(int eno,String ename,int esal) {
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						con=DriverManager.getConnection(url,username,password);
						String qry="update Employee set ename=?,esal=? where eno=?";
						
						ps=con.prepareStatement(qry);
					
						ps.setString(1,ename);
						ps.setInt(2,esal);
						ps.setInt(3,eno);
						
						ps.executeUpdate();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					 catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				
					
					finally {
						try {
							if(ps!=null) {
								ps.close();
							}
							if(con!=null) {
								con.close();
							}
							
						}
						catch(SQLException e) {
							e.printStackTrace();
							
						}
					}
					
					
				}
				public void delete(int eno) {
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						con=DriverManager.getConnection(url,username,password);
					
						ps=con.prepareStatement("delete from Employee where eno=?");
						ps.setInt(1, eno);
						ps.executeUpdate();
						
					}
					catch(ClassNotFoundException e) {
						e.printStackTrace();
						
						}
				catch(SQLException e) {
					e.printStackTrace();
					
				}
					finally {
						try {
							if(ps!=null) {
								ps.close();
							}
							if(con!=null) {
								con.close();
							}
					
				}
						catch(SQLException e) {
							e.printStackTrace();
							
						}
					}
						
				}			
}

