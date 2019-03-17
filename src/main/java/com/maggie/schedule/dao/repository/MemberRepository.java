package com.maggie.schedule.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maggie.schedule.entity.MemberEntity;

/**
 * The Interface MemberRepository.
 */
@Repository
public interface MemberRepository extends JpaRepository<MemberEntity, Long> {

}
