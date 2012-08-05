package com.joelbyler.pomodorotimer;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;


public class TimeStringCalculatorTest {
	

	@Test
	public void findCurrentTime() throws Exception {
		
		TimeStringCalculator calc = new TimeStringCalculator();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
		
		String result = calc.getTimeString();
		
		String expected = simpleDateFormat.format(new Date()); 
		assertEquals(expected, result);
	}
	
	@Test
	public void findSpecificTime() throws Exception {
		TimeStringCalculator calc = new TimeStringCalculator();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");

		calc.setTime(simpleDateFormat.parse("09:00"));
		String result = calc.getTimeString();
		
		String expected = simpleDateFormat.format(simpleDateFormat.parse("09:00")); 
		assertEquals(expected, result);
	}
	
	@Test
	public void canAddTime() throws Exception {
		TimeStringCalculator calc = new TimeStringCalculator();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");

		calc.setTime(simpleDateFormat.parse("09:00"));
		calc.addMinutes(25);
		String result = calc.getTimeString();
		
		String expected = simpleDateFormat.format(simpleDateFormat.parse("09:25")); 
		assertEquals(expected, result);
	}
}
