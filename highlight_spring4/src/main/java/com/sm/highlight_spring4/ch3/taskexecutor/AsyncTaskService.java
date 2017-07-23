package com.sm.highlight_spring4.ch3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {

	@Async	//表名方法是个异步方法，注解在类级别，则表名该类所有的方法都是异步方法
	public void executeAsyncTask(Integer i) {
		System.out.println("执行异步任务：" + i);
	}
	
	@Async
	public void executeAsyncTaskPlus(Integer i) {
		System.out.println("执行异步任务+1：" + (i + 1));
	}
}
