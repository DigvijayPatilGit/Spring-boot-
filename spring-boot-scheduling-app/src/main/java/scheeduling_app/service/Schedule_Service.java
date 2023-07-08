package scheeduling_app.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class Schedule_Service {
	
	@Scheduled(cron = "*/10 * * * * *")
	public void display() {
		System.out.println("Hello World!");
	}

}
