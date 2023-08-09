package cs3500.pa05.model;

import java.util.List;

/**
 * Calculates the tasks, regarding whether they have been completed or not.
 */
public class CalculateTasks {
  /**
   * Calculates the percentage of tasks completed in the given list.
   *
   * @param tasks the list of tasks
   * @return the percentage of tasks completed
   */
  public int tasksCompletePercentage(List<Task> tasks) {
    int totalTasks = 0;
    int tasksCompleted = 0;
    for (Task task : tasks) {
      totalTasks++;
      if (task.getIsComplete()) {
        tasksCompleted++;
      }
    }

    if (tasks.size() != 0) {
      return (tasksCompleted * 100) / (totalTasks);
    } else {
      return 100;
    }
  }
}
