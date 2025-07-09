package com.educandoweb.course.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 4264470429498806113L;
	
	
	public ResourceNotFoundException(Object id) {
		super("Resource not found. Id " + id);
	}
	
}
