/**
 * 
 */
package com.example.model;

/**
 * @author RAM
 *
 */
public class Response {
	private int status;
	private String respMessage;

	public Response() {
		super();
	}

	public Response(int status, String respMessage) {
		super();
		this.status = status;
		this.respMessage = respMessage;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getRespMessage() {
		return respMessage;
	}

	public void setRespMessage(String respMessage) {
		this.respMessage = respMessage;
	}

}
