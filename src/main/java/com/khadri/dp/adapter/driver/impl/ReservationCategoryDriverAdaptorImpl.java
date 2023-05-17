package com.khadri.dp.adapter.driver.impl;

import com.khadri.dp.adapter.driver.GovtJobDriverAdapter;
import com.khadri.dp.adapter.driver.adaptee.ReservationJobAdaptee;

public class ReservationCategoryDriverAdaptorImpl implements GovtJobDriverAdapter {

	private ReservationJobAdaptee adaptee;

	public ReservationCategoryDriverAdaptorImpl(ReservationJobAdaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void getJobByMerit() {
		adaptee.getJobByReservation();
	}
}
