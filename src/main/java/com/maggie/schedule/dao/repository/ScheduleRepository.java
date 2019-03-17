package com.maggie.schedule.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maggie.schedule.entity.ScheduleEntity;

/**
 * The Interface ScheduleRepository.
 */
@Repository
public interface ScheduleRepository extends JpaRepository<ScheduleEntity, Long> {

	/**
	 * Find schedules by member id.
	 *
	 * @param memberId the member id
	 * @return the list
	 */
	List<ScheduleEntity> findByMember_MemberId(Long memberId);
}
