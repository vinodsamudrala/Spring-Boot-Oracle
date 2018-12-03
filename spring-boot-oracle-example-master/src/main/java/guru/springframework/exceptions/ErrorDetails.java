package guru.springframework.exceptions;

import java.util.Date;

public class ErrorDetails {
	private String staus;
	private Date timestamp;
	private String message;
	private String details;

	public ErrorDetails(Date timestamp, String message, String details, String staus) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
		this.staus = staus;
	}
	
	

	public String getStaus() {
		return staus;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}

}