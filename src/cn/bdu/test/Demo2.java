package cn.bdu.test;

import cn.bdu.utils.MailUtils;

public class Demo2 {
	
	public static void main(String[] args) {
		try {
			MailUtils.sendMail("1046404387@qq.com", "你好！");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
