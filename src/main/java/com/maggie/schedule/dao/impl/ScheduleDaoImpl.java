package com.maggie.schedule.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.maggie.schedule.dao.ScheduleDAO;
import com.maggie.schedule.dao.repository.ScheduleRepository;
import com.maggie.schedule.entity.ScheduleEntity;

/**
 * The Class ScheduleDaoImpl.
 */
@Component
public class ScheduleDaoImpl implements ScheduleDAO {

	/** The schedule repository. */
	@Autowired
	ScheduleRepository scheduleRepository;

	/* (non-Javadoc)
	 * @see com.maggie.schedule.dao.ScheduleDAO#retrieveSchedules(java.lang.Long)
	 */
	@Override
	public List<ScheduleEntity> retrieveSchedules(Long memberId) {
		return scheduleRepository.findByMember_MemberId(memberId);
	}

	/* (non-Javadoc)
	 * @see com.maggie.schedule.dao.ScheduleDAO#retrieveSchedule(java.lang.Long)
	 */
	@Override
	public ScheduleEntity retrieveSchedule(Long scheduleId) {
		return scheduleRepository.getOne(scheduleId);
	}

	/* (non-Javadoc)
	 * @see com.maggie.schedule.dao.ScheduleDAO#saveSchedule(com.maggie.schedule.entity.ScheduleEntity)
	 */
	@Override
	public ScheduleEntity saveSchedule(ScheduleEntity schedule) {
		return scheduleRepository.save(schedule);
	}

	/* (non-Javadoc)
	 * @see com.maggie.schedule.dao.ScheduleDAO#deleteSchedule(com.maggie.schedule.entity.ScheduleEntity)
	 */
	@Override
	public void deleteSchedule(ScheduleEntity schedule) {
		scheduleRepository.delete(schedule);
	}

}
