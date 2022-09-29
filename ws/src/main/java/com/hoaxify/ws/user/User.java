package com.hoaxify.ws.user;


 
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import lombok.Data;


@Data 
@Entity
@Table(name="users")

public class User {
	

	@Id
	@GeneratedValue
	private long id; 
	
	
	@NotNull(message="{hoaxify.constraints.username.NotNull.message}")
	@Size(min =4, max= 255)
	@UniqueUsername  
	private String username;
	
    @NotNull
    @Size(min=4, max=255)
	private String displayName;
	
    @NotNull
    @Size(min=5, max=255)
	private String password;

	
}	 