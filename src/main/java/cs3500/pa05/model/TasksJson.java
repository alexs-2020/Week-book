package cs3500.pa05.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Represents a list of TaskJsons
 *
 * @param tasks tasks of a week
 */
public record TasksJson(
    @JsonProperty("tasks") List<TaskJson> tasks) {
//  public List<Task> getList() {
//    List<Task> list = new ArrayList<>();
//    for (TaskJson taskJson : tasks) {
//      Task task = taskJson.getTask();
//      list.add(task);
//    }
//    return list;
//  }
}
