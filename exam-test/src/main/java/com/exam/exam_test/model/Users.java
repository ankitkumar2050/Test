package com.exam.exam_test.model;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "systemeventlogs")
public class Users implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "systemeventlogs_id_seq_generator")
	@SequenceGenerator(name = "systemeventlogs_id_seq_generator", sequenceName = "systemeventlogs_id_seq", allocationSize = 1)
	@Column(nullable = false, columnDefinition = "SERIAL")
	private int id;

	@Column(columnDefinition = "text")
	private String eventUserName;

	@Column(columnDefinition = "text")
	private String eventUserMac;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEventUserName() {
		return eventUserName;
	}

	public void setEventUserName(String eventUserName) {
		this.eventUserName = eventUserName;
	}

	public String getEventUserMac() {
		return eventUserMac;
	}

	public void setEventUserMac(String eventUserMac) {
		this.eventUserMac = eventUserMac;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", eventUserName=" + eventUserName + ", eventUserMac=" + eventUserMac + "]";
	}

}
