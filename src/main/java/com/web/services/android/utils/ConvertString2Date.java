package com.web.services.android.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConvertString2Date {
	private static final Logger logger = LoggerFactory.getLogger(ConvertString2Date.class);
	
	public static final DateFormat FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
	
	public static Date string2Date(String time) {
		Date date = null;
		try {
			date = FORMAT.parse(time);
		} catch (ParseException e) {
			logger.info("[ConvertString2Date] String2Date(String time) 日期转换异常，传入参数time: {}", time);
			logger.error(e.getMessage(), e);
		}
		
		return date;
	}
	
	public static Date string2Date(String time, String format) {
		DateFormat fmt = new SimpleDateFormat(format); 
		Date date = null;
		try {
			date = fmt.parse(time);
		} catch (ParseException e) {
			logger.info("[ConvertString2Date] String2Date(String time, String format) 日期转换异常，传入参数time: {}, format: {}", time, format);
			logger.error(e.getMessage(), e);
		}
		
		return date;
	}
}
