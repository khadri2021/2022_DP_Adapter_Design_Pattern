package com.khadri.dp.adapter.driver.impl;

import com.khadri.dp.adapter.driver.GovtJobDriverAdapter;

public class OpenCategoryDriverImpl implements GovtJobDriverAdapter {
	@Override
	public void getJobByMerit() {
		System.out.println("Got the job by 90% merit marks");
	}
}
