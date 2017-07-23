package com.sm.highlight_spring4.ch3.taskscheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledTaskService {
	
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedRate = 5000)	//fixedRate表示每隔固定时间执行
	public void reportCurrentTime() {
		System.out.println("每隔五秒执行一次 " + dateFormat.format(new Date()));
	}
	
	@Scheduled(cron = "20 09 13 ? * *")
	public void fixTimmeExecution() {
		System.out.println("在指定时间 " + dateFormat.format(new Date()) + "执行");
	}
	
}
