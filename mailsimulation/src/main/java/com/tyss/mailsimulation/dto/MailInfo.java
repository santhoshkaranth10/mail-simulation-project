package com.tyss.mailsimulation.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Mail_Info")
public class MailInfo {
	@Column
	@Id
	@GeneratedValue
	private int id;
	@Column
	private int from_id;
	@Column
	private int to_id;
	private String subject;
	@Column
	private String message;
	@Column
	private String status;
	
	
	}
