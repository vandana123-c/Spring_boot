package om.message.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Message {
	
	public String message;

	public String getMessage() {
		return message;
	}

	public String setMessage(String message) {
		return this.message = message;
	}

	public Message(String message) {
		this.message = message;
	}
	

}
