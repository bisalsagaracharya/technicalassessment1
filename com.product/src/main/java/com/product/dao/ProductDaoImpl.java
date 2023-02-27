package com.product.dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.product.entity.Product;

public class ProductDaoImpl implements ProductDao {
	
		private Connection con;
		public ProductDaoImpl () {
			super();
			 try {
				con =DriverManager.getConnection("jdbc:postgresql://localhost:5432/product", "postgres","P@ssw0rd");
	System.out.println("PostGres Sql Connection is Sucessfull");
			 } catch (Exception e) {
				e.printStackTrace();
			}
			
		}

		@Override
		public Boolean addProduct(Product newProduct) throws SQLException {
			Boolean isRecordAdded =false;
			String sql = "insert into product (id,name,price) values(?,?,?)";
		   try {
			PreparedStatement prepStatmnt = this.con.prepareStatement(sql);
			   prepStatmnt.setInt(1, newProduct.getProductId());
			   prepStatmnt.setString(2, newProduct.getProductName());
			   prepStatmnt.setDouble(3, newProduct.getProductPrice());
			   int recordCount = prepStatmnt.executeUpdate();
			   if(recordCount==1)
				   isRecordAdded = true;
		} catch (SQLException e) {
			//e.printStackTrace();
			throw e;
		}
		   
			return isRecordAdded;
		}

		@Override
		public Product getProduct(Integer productId) {
			
			String sql ="select id,name,price from product  where id =?";
			Product productFound =null;
			try {
				PreparedStatement prepStment = this.con.prepareStatement(sql);
				 prepStment.setInt(1, productId);
				 ResultSet result = prepStment.executeQuery();
				 if(result.next()) {
					productFound = new Product(result.getInt("id"),result.getString("name"),result.getDouble("price"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return productFound;
		}

		@Override
		public Boolean updateProduct(Product updateProduct) {
			String sql = "update product set  name=?,price=? where id =?";
			Boolean RecordIsUPdated = false;
			  try {
				PreparedStatement prepStmnt = this.con.prepareStatement(sql);
				prepStmnt.setString(1, updateProduct.getProductName());
				prepStmnt.setDouble(2, updateProduct.getProductPrice());
				prepStmnt.setInt(3, updateProduct.getProductId());
				 int count = prepStmnt.executeUpdate();
				 if(count==1)
					 RecordIsUPdated=true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return RecordIsUPdated;
		}

		@Override
		public Boolean updateByName(Integer productId, String name) {
	     String sql = "update product set name = ? where id =? ";		
	     Boolean updateProductRecord =false;
	     try {
			PreparedStatement prepStamnt = this.con.prepareStatement(sql);
			prepStamnt.setString(1, name);
			prepStamnt.setInt(2, productId);
			int count = prepStamnt.executeUpdate();
			if(count ==1)
				updateProductRecord =true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return updateProductRecord;
		}

		@Override
		public Boolean deleteProduct(Integer productId) {
			Boolean isRecordDelete= false;
			String sql = "delete from product where id =?";
			try {
				PreparedStatement prepStatemnts =this.con.prepareStatement(sql);
				  prepStatemnts.setInt(1, productId);
				  int count = prepStatemnts.executeUpdate();
				  if(count ==1)
					  isRecordDelete =true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return isRecordDelete;
		}

		@Override
		public List<Product> getAllProduct() {
	List<Product> product = new ArrayList<>();
	String sql ="select id,name,price from product";
	   
	   try {
		   Statement statement = (Statement) this.con.createStatement();
		   ResultSet result = executeQuery(sql);
		   while(result.next()) {
			Product newproduct = new Product(result.getInt("id"),result.getString("name"),result.getDouble("price"));
			product.add(newproduct);
		}
		   
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			return product;
		}

		private ResultSet executeQuery(String sql) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Boolean updateProductPrice(Integer productId, Double productPrice) {
			Boolean updateProductRecord =false;
			String sql ="update product set price = ? where id =?";
			try {
				PreparedStatement prepStamnt =this.con.prepareStatement(sql);
				prepStamnt.setDouble(1, productPrice);
				prepStamnt.setInt(2, productId);
				   int count = prepStamnt.executeUpdate();
				   if(count==1)
					   updateProductRecord =true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return updateProductRecord;
		}

}
