package guru.springframework.domain;

import org.springframework.http.HttpStatus;

public class Response {

    private String id;
    private String status;
    private String message;

    public Response(String id,  String status, String message) {
        this.id = id;
        this.status = status;
        this.message = message;
    }

    public static Response getSuccessResopnse(String id) {
    	return new Response(id, HttpStatus.CREATED.toString(), "Data Added Successfully");
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
    
    
    
}