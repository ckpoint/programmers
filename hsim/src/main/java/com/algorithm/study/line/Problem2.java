package com.algorithm.study.line;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.Collectors;

public class Problem2 {

    private Properties properties;
    private List<String> outputs = new ArrayList<>();
    private Queue<String> strQeueu = new ConcurrentLinkedQueue<>();

    public String commands(String commands) {

        Arrays.stream(commands.split("\n")).forEach(cmdStr -> {
            if (properties == null) {
                this.properties = new Properties(cmdStr);
                return;
            }
            String[] cmd = cmdStr.split(" ");
            assert cmd.length > 0;

            Command command = Command.valueOf(cmd[0]);

            outputs.add(command.execute(properties, strQeueu, cmd.length > 1 ? cmd[1] : null));
        });

        return outputs.stream().collect(Collectors.joining("\n"));
    }

    public void clear() {
        this.outputs.clear();
    }

}

class Properties {
    private int nodeSize;
    private int maxQueueSize;

    public Properties(String command) {
        String[] values = command.split(" ");
        assert values.length == 2;
        this.nodeSize = Integer.valueOf(values[0]);
        this.maxQueueSize = Integer.valueOf(values[1]);
    }

    public boolean isMaxQeuue(Queue<String> queue) {
        return queue.size() >= maxQueueSize;
    }
}

enum Command {
    OFFER, TAKE, SIZE;

    public String execute(Properties properties, Queue<String> queue, String str) {
        switch (this) {
            case OFFER:
                return putQueue(properties, queue, str);
            case TAKE:
                return getQueue(queue);
            case SIZE:
                return queue.size() + "";
        }
        return "";
    }

    private String getQueue(Queue<String> queue) {
        if (queue.isEmpty()) {
            return "";
        }
        return queue.poll();

    }

    private String putQueue(Properties properties, Queue<String> queue, String str) {
        if (properties.isMaxQeuue(queue)) {
            return "false";
        }

        queue.add(str);
        return "true";
    }
}

