package com.JDC.Dao;

import org.springframework.stereotype.Repository;

//@Repository
//@Repository("reportdao")
@Repository("Oracle")
public class Oracle_Report_Dao_Impl implements Report_Dao {

	@Override
	public String Report_Data_Status() {
		// TODO Auto-generated method stub
		
		String str = "Oracle database reported data received";
		
		return str;
	}

}
