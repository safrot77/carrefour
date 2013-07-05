package com.intellemodules.carrefour.web;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;
import com.intellemodules.carrefour.web.beans.Branch;
import com.intellemodules.carrefour.web.beans.Department;
import com.intellemodules.carrefour.web.beans.DepartmentSection;
import com.intellemodules.carrefour.web.beans.Product;
import com.intellemodules.carrefour.web.beans.Promotion;
import com.intellemodules.carrefour.web.beans.PromotionProduct;
import com.intellemodules.carrefour.web.beans.Service;

public class WebServiceController {
	
	
	
	
	public Promotion[] getPromotion() throws IOException{
		URL url;
		try {
			url = new URL("http://196.221.166.222/carrefour-api2/api/getpromotion");
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			String json = new DataInputStream(con.getInputStream()).readLine();
			Gson gson = new Gson();
			Promotion[] promotions = gson.fromJson(json, Promotion[].class);
			return promotions;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	public PromotionProduct[] getProducts(String promID) throws MalformedURLException{
		URL url;
		try {
			url = new URL("http://196.221.166.222/carrefour-api/api/getpromotion?PromID="+promID);
			
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			String json = new DataInputStream(con.getInputStream()).readLine();
			Gson gson = new Gson();
			PromotionProduct[] products = gson.fromJson(json, PromotionProduct[].class);
			return products;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	public Department[] getDepartments() throws IOException{
		URL url;
		try {
			url = new URL("http://196.221.166.222/carrefour-api/api/getDepartments");
			
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			String json = new DataInputStream(con.getInputStream()).readLine();
			Gson gson = new Gson();
			Department[] departments = gson.fromJson(json, Department[].class);
			return departments;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	public DepartmentSection[] getDepartmentSections(String departmentID) throws IOException{
		URL url;
		try {
			url = new URL("http://196.221.166.222/carrefour-api/api/getDepartments?CatId="+departmentID);
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			String json = new DataInputStream(con.getInputStream()).readLine();
			Gson gson = new Gson();
			DepartmentSection[] departmentSections = gson.fromJson(json, DepartmentSection[].class);
			return departmentSections;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public Product[] getDepartmentProducts(String sectionID) throws MalformedURLException{
		URL url;
		try {
			url = new URL("http://196.221.166.222/carrefour-api/api/getDepartments?SectionId="+sectionID);
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			String json = new DataInputStream(con.getInputStream()).readLine();
			Gson gson = new Gson();
			Product[] products = gson.fromJson(json, Product[].class);
			return products;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	public Service[] getAllServices() throws IOException{
		URL url;
		try {
			url = new URL("http://196.221.166.222/carrefour-api/api/getServices");
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			String json = new DataInputStream(con.getInputStream()).readLine();
			Gson gson = new Gson();
			Service[] services = gson.fromJson(json, Service[].class);
			return services;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	public Branch[] getAllBranches() throws MalformedURLException{
		URL url;
		try {
			url = new URL("http://196.221.166.222/carrefour-api/api/getBranches");
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			DataInputStream dis = new DataInputStream(con.getInputStream());
			String json = dis.readUTF();
			Gson gson = new Gson();
			Branch[] branches = gson.fromJson(json, Branch[].class);
			
			return branches;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	public Service[] getBranchServices(String branchID) throws IOException{
		URL url;
		try {
			url = new URL("http://196.221.166.222/carrefour-api/api/getBranches?BranchID="+branchID);
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			con.setDoInput(true);
			con.setDoOutput(true);
			con.setRequestProperty("BranchID", branchID);
			
			DataOutputStream dos = new DataOutputStream(con.getOutputStream());
			DataInputStream dis = new DataInputStream(con.getInputStream());
			String json = dis.readLine();
			Gson gson = new Gson();
			Service[] services = gson.fromJson(json, Service[].class);
			
			dos.close();
			dis.close();
			return services;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	

}
