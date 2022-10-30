package com.hoaxify.ws.file;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.hoaxify.ws.hoax.Hoax;

import lombok.Data;

@Data
@Entity
@Table(name="file")
public class FileAttachment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String name;

	@Temporal(TemporalType.TIMESTAMP)
	private Date date;

	@OneToOne
	private Hoax hoax;
}