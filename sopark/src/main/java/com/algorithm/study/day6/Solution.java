package com.algorithm.study.day6;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    Map<String, String> printResult;

    Map<String, String> nickNameMapper;

    public Solution() {
        this.printResult = new HashMap<>();
        this.nickNameMapper = new HashMap<>();
        this.printResult.put("Enter", "{user}님이 들어왔습니다.");
        this.printResult.put("Leave", "{user}님이 나갔습니다.");
    }

    public String[] solution(String[] record) {
        List<ChatCommand> chatCommands = Arrays.stream(record)
                .map(ChatCommand::new)
                .map(chatCommand -> {
                    if(chatCommand.isNotLeaveCommand()){
                        nickNameMapper.put(chatCommand.getUserId(), chatCommand.getNickName());
                    }
                    return chatCommand;
                })
                .filter(ChatCommand::isNotChangeCommand)
                .collect(Collectors.toList());

        List<String> answer = chatCommands.stream()
                .map(chatCommand -> {
                    String print = this.printResult.get(chatCommand.getCommand());
                    return print.replace("{user}", nickNameMapper.get(chatCommand.getUserId()));
                })
                .collect(Collectors.toList());

        return answer.toArray(new String[answer.size()]);
    }

    class ChatCommand {
        private String command;
        private String userId;
        private String nickName;

        public ChatCommand(String commandLine) {
            String[] commands = commandLine.split(" ");
            this.command = commands[0];
            this.userId = commands[1];

            if(!this.isLeaveCommand()){
                this.nickName = commands[2];
            }
        }

        public String getCommand(){
            return this.command;
        }

        public String getUserId(){
            return this.userId;
        }

        public String getNickName(){
            return this.nickName;
        }

        public boolean isLeaveCommand(){
            return "Leave".equals(this.command);
        }

        public boolean isNotLeaveCommand() {
            return !this.isLeaveCommand();
        }

        public boolean isChangeCommand(){
            return "Change".equals(this.command);
        }

        public boolean isNotChangeCommand(){
            return !this.isChangeCommand();
        }
    }
}
