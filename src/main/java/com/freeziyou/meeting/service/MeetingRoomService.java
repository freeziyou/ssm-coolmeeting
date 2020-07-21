package com.freeziyou.meeting.service;

import com.freeziyou.meeting.mapper.MeetingRoomMapper;
import com.freeziyou.meeting.model.MeetingRoom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Dylan Guo
 * @date 7/21/2020 13:51
 * @description TODO
 */
@Service
public class MeetingRoomService {

    @Autowired
    MeetingRoomMapper meetingRoomMapper;

    public List<MeetingRoom> getAllMr() {
        return meetingRoomMapper.getAllMr();

    }

    public MeetingRoom getMrById(Integer roomid) {
        return meetingRoomMapper.getMrById(roomid);
    }

    public Integer updateRoom(MeetingRoom meetingRoom) {
        return meetingRoomMapper.updateRoom(meetingRoom);
    }

    public Integer doAddMr(MeetingRoom meetingRoom) {
        return meetingRoomMapper.doAddMr(meetingRoom);
    }
}
