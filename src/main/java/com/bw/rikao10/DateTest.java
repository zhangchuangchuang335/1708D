package com.bw.rikao10;

import org.junit.Test;

import com.bw.rikao10.DateUtils;

public class DateTest {
	
	@Test
	public void test01(){//获取年龄
		long years = DateUtils.getYears("2001-12-30");
		System.out.println(years);
	}
	
	@Test
	public void test02(){//获取月初日期
		String init = DateUtils.getDateByMonthInit("2001-12-10");
		System.out.println(init);
	}
	
	@Test
	public void test03(){//获取月末日期
		String init = DateUtils.getDateByMonthLast("2001-12-10");
		System.out.println(init);
	}
	
	@Test
	public void test04(){//获取离今天过去的天数
		long departed = DateUtils.getDaysByDeparted("2001-12-10");
		System.out.println(departed);
	}
	
}
