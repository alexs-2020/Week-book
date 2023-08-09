package cs3500.pa05.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Represents a JSON object containing a list of events.
 */
public record EventsJson(
    @JsonProperty("events") List<EventJson> events) {
}
