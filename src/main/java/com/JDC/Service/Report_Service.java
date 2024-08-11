package com.JDC.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.JDC.Dao.Report_Dao;

@Service
public class Report_Service {
	
	@Autowired
	@Qualifier("Oracle")
	private Report_Dao reportdao;
	
//	private Report_Dao Oracle;
	
//	@Autowired
//	public void setReportdao(Report_Dao reportdao) {
//		this.reportdao = reportdao;
//	}

	public void Generate_Report() {
		String report = reportdao.Report_Data_Status();
//		String report = Oracle.Report_Data_Status();
		
		System.out.println(report);
		System.out.println(report);
	}
}
