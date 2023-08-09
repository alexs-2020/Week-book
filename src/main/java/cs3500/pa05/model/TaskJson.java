package cs3500.pa05.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * Represents a JsonNode for storing information on a Task
 */
public record TaskJson(
    @JsonProperty("name") String name,
    @JsonProperty("description") String description,
    @JsonProperty("day") DayOfWeek day,
    @JsonProperty("isComplete") boolean isComplete) {
}

