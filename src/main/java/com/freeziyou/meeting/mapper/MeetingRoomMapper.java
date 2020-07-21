package com.freeziyou.meeting.mapper;

import com.freeziyou.meeting.model.MeetingRoom;

import java.util.List;

/**
 * @author Dylan Guo
 * @date 7/21/2020 13:50
 * @description TODO
 */
public interface MeetingRoomMapper {
    List<MeetingRoom> getAllMr();

    MeetingRoom getMrById(Integer roomid);

    Integer updateRoom(MeetingRoom meetingRoom);

    Integer doAddMr(MeetingRoom meetingRoom);
}
