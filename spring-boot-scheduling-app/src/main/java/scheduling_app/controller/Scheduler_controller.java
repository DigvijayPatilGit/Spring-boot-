package scheduling_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import scheeduling_app.service.Schedule_Service;

@RestController
@Component
public class Scheduler_controller {

	@Autowired
	Schedule_Service service;
	
	public void display() {
		service.display();
	}
}
