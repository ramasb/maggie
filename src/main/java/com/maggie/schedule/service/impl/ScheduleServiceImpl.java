package com.maggie.schedule.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maggie.schedule.dao.ScheduleDAO;
import com.maggie.schedule.entity.ScheduleEntity;
import com.maggie.schedule.service.ScheduleService;

/**
 * The Class ScheduleServiceImpl.
 */
@Service
public class ScheduleServiceImpl implements ScheduleService {

	/** The schedule DAO. */
	@Autowired
	ScheduleDAO scheduleDAO;

	/* (non-Javadoc)
	 * @see com.maggie.schedule.service.ScheduleService#retrieveSchedules(java.lang.Long)
	 */
	@Override
	public List<ScheduleEntity> retrieveSchedules(Long memberId) {
		return scheduleDAO.retrieveSchedules(memberId);
	}

	/* (non-Javadoc)
	 * @see com.maggie.schedule.service.ScheduleService#retrieveSchedule(java.lang.Long)
	 */
	@Override
	public ScheduleEntity retrieveSchedule(Long scheduleId) {
		return scheduleDAO.retrieveSchedule(scheduleId);
	}

	/* (non-Javadoc)
	 * @see com.maggie.schedule.service.ScheduleService#saveSchedule(com.maggie.schedule.entity.ScheduleEntity)
	 */
	@Override
	public ScheduleEntity saveSchedule(ScheduleEntity schedule) {
		return scheduleDAO.saveSchedule(schedule);
	}

	/* (non-Javadoc)
	 * @see com.maggie.schedule.service.ScheduleService#deleteSchedule(com.maggie.schedule.entity.ScheduleEntity)
	 */
	@Override
	public void deleteSchedule(ScheduleEntity schedule) {
		scheduleDAO.deleteSchedule(schedule);
	}

}
