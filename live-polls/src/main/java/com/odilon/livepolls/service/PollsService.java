package com.odilon.livepolls.service;

import com.odilon.livepolls.entity.Polls;

import java.util.List;

public interface PollsService {

    void addPoll(Polls poll);

    void updatePoll(Integer id, Polls poll);

    List<Polls> getPolls();

    Polls getPollById(Integer id);

    void deletePoll(Integer id);
}
