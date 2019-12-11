package com.bw.rikao10;

import org.junit.Test;

import com.bw.rikao10.DateUtils;

public class DateTest {
	
	@Test
	public void test01(){//��ȡ����
		long years = DateUtils.getYears("2001-12-30");
		System.out.println(years);
	}
	
	@Test
	public void test02(){//��ȡ�³�����
		String init = DateUtils.getDateByMonthInit("2001-12-10");
		System.out.println(init);
	}
	
	@Test
	public void test03(){//��ȡ��ĩ����
		String init = DateUtils.getDateByMonthLast("2001-12-10");
		System.out.println(init);
	}
	
	@Test
	public void test04(){//��ȡ������ȥ������
		long departed = DateUtils.getDaysByDeparted("2001-12-10");
		System.out.println(departed);
	}
	
}
