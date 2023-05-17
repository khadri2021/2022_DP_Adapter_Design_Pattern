package com.khadri.dp.adapter.main;

import com.khadri.dp.adapter.driver.GovtJobDriverAdapter;
import com.khadri.dp.adapter.driver.adaptee.PHReservationCategoryAdaptee;
import com.khadri.dp.adapter.driver.adaptee.ReservationJobAdaptee;
import com.khadri.dp.adapter.driver.impl.OpenCategoryDriverImpl;
import com.khadri.dp.adapter.driver.impl.ReservationCategoryDriverAdaptorImpl;

public class TestAdapterPattern {

	public static void main(String[] args) {
		 
		
		// This logic is doesn't have two unknown interface communication
		GovtJobDriverAdapter govtJobDriverAdapter1 = new OpenCategoryDriverImpl();
		govtJobDriverAdapter1.getJobByMerit();
		
		// This logic interacting two different unknown interfaces communication
		ReservationJobAdaptee reservationJobAdaptee = new PHReservationCategoryAdaptee();
		GovtJobDriverAdapter govtJobDriverAdapter2 = new ReservationCategoryDriverAdaptorImpl(reservationJobAdaptee);
		govtJobDriverAdapter2.getJobByMerit();
	}
}
