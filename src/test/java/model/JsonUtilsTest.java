package model;


import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fasterxml.jackson.databind.JsonNode;
import cs3500.pa05.model.DayOfWeek;
import cs3500.pa05.model.EventJson;
import cs3500.pa05.model.JsonUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 *  test class for JsonUtil
 */

public class JsonUtilsTest {
  private Record eventJson;
  /**
   * Initializes an eventJson before each test
   */

  @BeforeEach
  void initJsonUtils() {
    eventJson = new EventJson("prom", "spring 2023", DayOfWeek.SUNDAY, 7, 30, 120);
  }
  /**
   * Tests the serializeRecord method of the JsonUtils class.
   * Verifies that a record object is successfully serialized to JSON.
   */

  @Test
  public void testSerializeRecordSuccess() {
    JsonNode response = JsonUtils.serializeRecord(eventJson);
    assertEquals("{\"name\":\"prom\",\"description\":\"spring 2023\","
        + "\"day\":\"SUNDAY\",\"hour\":7,\"minute\":30,\"duration\":120}", response.toString());
  }
}