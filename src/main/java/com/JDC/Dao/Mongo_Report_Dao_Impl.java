package com.JDC.Dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

//@Repository
//@Repository("reportdao")
@Repository("Mongo")
//@Primary
public class Mongo_Report_Dao_Impl implements Report_Dao {

	@Override
	public String Report_Data_Status() {
		// TODO Auto-generated method stub
		
		String str = "MongoDB database reported data received";
		
		return str;
	}

}
