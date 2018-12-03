package guru.springframework.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 6387280502650598466L;

	public ResourceNotFoundException(String message) {
		super(message);
	}

	
}
