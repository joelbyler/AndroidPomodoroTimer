package com.joelbyler.pomodorotimer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeStringCalculator {

	private Date date = new Date();

	public String getTimeString() {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
		return simpleDateFormat.format(date);
	}

	public void setTime(Date date) {
		this.date  = date;
	}

	public void addMinutes(int minutes) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MINUTE, minutes);
		date = cal.getTime();
	}

}
