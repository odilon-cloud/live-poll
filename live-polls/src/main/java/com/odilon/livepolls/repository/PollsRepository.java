package com.odilon.livepolls.repository;

import com.odilon.livepolls.entity.Polls;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PollsRepository extends JpaRepository<Polls, Integer> {
}
