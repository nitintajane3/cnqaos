package com.cnqaos.collectionexample;

import java.util.Calendar;
import java.util.TimeZone;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class checktwo 
{
	
	ExtentHtmlReporter htmlReporter ;
	ExtentReports reportees;
	ExtentTest test;
	
	public void experreor() 
	{
		/*htmlReporter =  new ExtentHtmlReporter("");
		reportees = new ExtentReports();
		reportees.attachReporter(htmlReporter);
		test = reportees.createTest("hfbhdj");*/
		
		//test.log(Status.PASS,MarkupHelper.createLabel(text, color))
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		/*String vairblename = "kjfsdfkjsbdfkjsdbk";
		
	        String substringdevdee = vairblename.substring(vairblename.length()-3);
	        String substringdevde = vairblename.substring(0,3);
	        System.out.println(substringdevde);
	        String removeingspace = substringdevde.replaceAll("-","").trim();*/
		
		checkone[] namedetails ;
		namedetails =  new checkone[5];
		namedetails[0] = new checkone(12, "nitin");
		namedetails[1] = new checkone(13, "tajane");
		namedetails[2] = new checkone(14, "ashwini");
		namedetails[3] =  new checkone(11, "kaphare");
		namedetails[4] = new checkone(9, "vijendra");
		
		checkone antr = namedetails[3];
		
		for(int i=0;i<namedetails.length;i++)
		{
			
			if(namedetails[i]==antr)
			{
				System.out.println("array mache " + namedetails[i].name);
			}
			
			System.out.println(namedetails[i].name   +   namedetails[i].rollno);
		}
	       
	        
	      
		
				
	}

	
	}


