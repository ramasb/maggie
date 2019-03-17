package com.maggie.schedule.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class MemberEntity.
 */
@Entity
@Table(name = "MEMBERS")
@Getter
@Setter
@ToString
public class MemberEntity extends CommonEntity {

	/** The member id. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "MEMBER_ID")
	private Long memberId;

	/** The full name. */
	@Column(name = "FULL_NAME")
	private String fullName;

	/** The join date. */
	@Column(name = "JOIN_DATE")
	private LocalDate joinDate;

	/** The expiry date. */
	@Column(name = "EXPIRY_DATE")
	private LocalDate expiryDate;

}
