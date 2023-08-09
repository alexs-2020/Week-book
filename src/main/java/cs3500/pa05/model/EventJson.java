package cs3500.pa05.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a JSON object for an event.
 */
public record EventJson(
    @JsonProperty("name") String name,
    @JsonProperty("description") String description,
    @JsonProperty("day") DayOfWeek day,
    @JsonProperty("hour") int hour,
    @JsonProperty("minute") int minute,
    @JsonProperty("duration") int duration) {
}
