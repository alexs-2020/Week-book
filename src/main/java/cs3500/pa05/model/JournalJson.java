package cs3500.pa05.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a JSON object that holds all the information of the journal/calendar
 */
public record JournalJson(
    @JsonProperty("name") String name,
    @JsonProperty("theme") Theme theme,
    @JsonProperty("limit") int limit,
    @JsonProperty("schedule") EventsJson schedule,
    @JsonProperty("todos") TasksJson todos,
    @JsonProperty("notes") String notes) {
}