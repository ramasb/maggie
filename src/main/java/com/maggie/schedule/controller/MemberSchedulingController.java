package com.maggie.schedule.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maggie.schedule.dao.ControllerHelper;
import com.maggie.schedule.entity.ScheduleEntity;
import com.maggie.schedule.service.ScheduleService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * The Class ScheduleController.
 */
@RestController
@RequestMapping(ControllerHelper.MEMBER_PATH)
@Api("This controller contains endpoints to manage schedules for a member")
public class MemberSchedulingController {

	/** The schedule service. */
	@Autowired
	ScheduleService scheduleService;

	/**
	 * Retrieve schedules.
	 *
	 * @param memberid the memberid
	 * @return the list
	 */
	@GetMapping("/{memberid}/schedule")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation("This endpoint retrieve schedules for a member")
	public List<ScheduleEntity> retrieveSchedules(@PathVariable("memberid") Long memberid) {
		List<ScheduleEntity> schedules = scheduleService.retrieveSchedules(memberid);
		return schedules;
	}

	/**
	 * Adds the schedule.
	 *
	 * @param schedule the schedule
	 * @param memberid the memberid
	 * @return the schedule entity
	 */
	@PostMapping("/{memberid}/schedule")

	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation("This endpoint will add schedule for a member")
	public ScheduleEntity addSchedule(@RequestBody ScheduleEntity schedule, @PathVariable("memberid") Long memberid) {
		return scheduleService.saveSchedule(schedule);
	}

	/**
	 * Update schedule.
	 *
	 * @param schedule   the schedule
	 * @param memberid   the memberid
	 * @param scheduleid the scheduleid
	 * @return the schedule entity
	 */
	@PutMapping("/{memberid}/schedule/{scheduleid}")

	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation("This endpoint will update schedule for a member")
	public ScheduleEntity updateSchedule(@RequestBody ScheduleEntity schedule, @PathVariable("memberid") Long memberid,
			@PathVariable("scheduleid") Long scheduleid) {
		return scheduleService.saveSchedule(schedule);
	}

	/**
	 * Retrieve schedule.
	 *
	 * @param memberid   the memberid
	 * @param scheduleid the scheduleid
	 * @return the schedule entity
	 */
	@GetMapping("/{memberid}/schedule/{scheduleid}")

	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation("This endpoint retrieve schedule of a member")
	public ScheduleEntity retrieveSchedule(@PathVariable("memberid") Long memberid,
			@PathVariable("scheduleid") Long scheduleid) {
		return scheduleService.retrieveSchedule(scheduleid);
	}
}
