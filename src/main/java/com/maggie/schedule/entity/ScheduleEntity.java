package com.maggie.schedule.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.ToString;

/**
 * The Class ScheduleEntity.
 */
@Entity
@Table(name = "SCHEDULES")
@Data
@ToString
public class ScheduleEntity extends CommonEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6807959219218799316L;

	/** The schedule id. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SCHEDULE_ID")
	@JsonProperty("scheduleId")
	private Long scheduleId;

	/** The member. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MEMBER_ID")
	@JsonProperty("member")
	private MemberEntity member;

	/** The schedule name. */
	@Column(name = "SCHEDULE_NAME")
	@JsonProperty("scheduleName")
	private String scheduleName;

	/** The scheduled date. */
	@Column(name = "SCHEDULED_DATE")
	@JsonProperty("scheduledDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = CommonEntity.JSON_DATE_FORMAT)
	private LocalDate scheduledDate;

	/** The schedule status. */
	@Column(name = "SCHEDULE_STATUS")
	@JsonProperty("scheduleStatus")
	private String scheduleStatus;

}
