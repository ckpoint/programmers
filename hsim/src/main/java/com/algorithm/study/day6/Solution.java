package com.algorithm.study.day6;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public String[] solution(String[] record) {

        Map<String, User> userMap = new HashMap<>();
        List<Event> events = Arrays.stream(record).map(msg -> new Event(msg, userMap)).collect(Collectors.toList());

        return events.stream().map(event -> event.getEventMessage(userMap)).filter(Objects::nonNull).toArray(String[]::new);
    }


    private void putUser(Map<String, User> userMap, String uid, String nicName) {
        User user = userMap.get(uid);
        if (user == null) {
            user = new User(uid, nicName);
            userMap.put(uid, user);
        }
        user.name = nicName;
    }

    enum MessageType {
        Enter("님이 들어왔습니다."),
        Leave("님이 나갔습니다."),
        Change(null);

        private String tailMessage;

        MessageType(String tailMsg) {
            this.tailMessage = tailMsg;
        }

        public String getMessage(User user) {
            if (this.tailMessage == null) {
                return null;
            }

            return user.name + this.tailMessage;
        }
    }

    class Event {
        private MessageType messageType;
        private String uid;
        private String nickName;

        Event(String message, Map<String, User> userMap) {
            String[] msgs = message.split(" ");
            this.messageType = MessageType.valueOf(msgs[0]);
            this.uid = msgs[1];
            if (!this.messageType.equals(MessageType.Leave)) {
                this.nickName = msgs[2];
                putUser(userMap, this.uid, this.nickName);
            }

        }

        public String getEventMessage(Map<String, User> userMap) {
            return this.messageType.getMessage(userMap.get(this.uid));
        }

    }

    class User {
        private String uid;
        private String name;

        User(String uid, String name) {
            this.uid = uid;
            this.name = name;
        }

    }
}
