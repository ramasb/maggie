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

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class ScheduleEntity.
 */
@Entity
@Table(name = "SCHEDULES")
@Getter
@Setter
@ToString
public class ScheduleEntity extends CommonEntity {

	/** The schedule id. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SCHEDULE_ID")
	private Long scheduleId;

	/** The member. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MEMBER_ID")
	private MemberEntity member;

	/** The schedule name. */
	@Column(name = "SCHEDULE_NAME")
	private String scheduleName;

	/** The scheduled date. */
	@Column(name = "SCHEDULED_DATE")
	private LocalDate scheduledDate;

	/** The schedule status. */
	@Column(name = "SCHEDULE_STATUS")
	private String scheduleStatus;

}
