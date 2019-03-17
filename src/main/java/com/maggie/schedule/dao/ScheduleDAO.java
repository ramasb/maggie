package com.maggie.schedule.dao;

import java.util.List;

import com.maggie.schedule.entity.ScheduleEntity;

/**
 * The Interface ScheduleDAO.
 */
public interface ScheduleDAO {

	/**
	 * Retrieve schedules.
	 *
	 * @param memberID the member ID
	 * @return the list
	 */
	List<ScheduleEntity> retrieveSchedules(Long memberID);

	/**
	 * Retrieve schedule.
	 *
	 * @param scheduleId the schedule id
	 * @return the schedule entity
	 */
	ScheduleEntity retrieveSchedule(Long scheduleId);

	/**
	 * Save schedule.
	 *
	 * @param schedule the schedule
	 * @return the schedule entity
	 */
	ScheduleEntity saveSchedule(ScheduleEntity schedule);

	/**
	 * Delete schedule.
	 *
	 * @param schedule the schedule
	 */
	void deleteSchedule(ScheduleEntity schedule);
}
