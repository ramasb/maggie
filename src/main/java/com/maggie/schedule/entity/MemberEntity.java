package com.maggie.schedule.entity;

import java.time.LocalDate;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.ToString;

/**
 * The Class MemberEntity.
 */
@Entity
@Table(name = "MEMBERS")
@Data
@ToString
public class MemberEntity extends CommonEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2814458788406087438L;

	/** The member id. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "MEMBER_ID")
	@JsonProperty("memberId")
	private Long memberId;

	/** The full name. */
	@Column(name = "FULL_NAME")
	@JsonProperty("fullName")
	private String fullName;

	/** The join date. */
	@Column(name = "JOIN_DATE")
	@JsonProperty("joinDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = CommonEntity.JSON_DATE_FORMAT)
	private LocalDate joinDate;

	/** The expiry date. */
	@Column(name = "EXPIRY_DATE")
	@JsonProperty("expiryDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = CommonEntity.JSON_DATE_FORMAT)
	private LocalDate expiryDate;

	@OneToMany
	@JoinColumn(name = "MEMBER_ID")
	Collection<ScheduleEntity> schedules;
}
