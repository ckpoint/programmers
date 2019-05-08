package com.algorithm.study.day16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    class Project {
        int progress;
        int spreed;

        public Project(int progress, int spreed) {
            this.progress = progress;
            this.spreed = spreed;
        }

        public Project addProgress() {
            this.progress += this.spreed;
            return this;
        }

        public boolean isComplete() {
            return this.progress > 100;
        }
    }

    public int[] solution(int[] progresses, int[] speeds) {
        List<Project> projects = new LinkedList<>();

        for(int i = 0 ; i < progresses.length ; i++) {
            projects.add(new Project(progresses[i], speeds[i]));
        }

        List<Integer> result = new LinkedList<>();
        while (!projects.isEmpty()) {
            projects.forEach(Project::addProgress);

            int completeCount = 0;

            List<Project> removeProject = new ArrayList<>();
            for(Project project : projects) {
                if(!project.isComplete()) break;
                completeCount++;
                removeProject.add(project);
            }

            projects.removeAll(removeProject);

            if(completeCount > 0) {
                result.add(completeCount);
            }

        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
