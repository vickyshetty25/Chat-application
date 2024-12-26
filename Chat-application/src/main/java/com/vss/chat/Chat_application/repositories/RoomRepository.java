package com.vss.chat.Chat_application.repositories;

import com.vss.chat.Chat_application.entities.Room;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoomRepository extends MongoRepository<Room, String> {

    // get room using room id
    Room findByRoomId(String roomId);
}
