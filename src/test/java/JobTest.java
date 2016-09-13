import org.junit.*;
import static org.junit.Assert.*;

public class JobTest {

  @Test
  public void newJob_instanttiatesCorrectly() {
    Job testJob = new Job("Position", "Company", "Location", "Description", "Start", "End");
    assertEquals(true, testJob instanceof Job);
  }

  @Test
  public void newJob_returnsPosition_Position() {
    Job testJob = new Job("Position", "Company", "Location", "Description", "Start", "End");
    assertEquals("Position", testJob.getPosition());
  }

  @Test
  public void newJob_returnsCompany_Company() {
    Job testJob = new Job("Position", "Company", "Location", "Description", "Start", "End");
    assertEquals("Company", testJob.getCompany());
  }

  @Test
  public void newJob_returnsLocation_Location() {
    Job testJob = new Job("Position", "Company", "Location", "Description", "Start", "End");
    assertEquals("Location", testJob.getLocation());
  }

  @Test
  public void newJob_returnsDescription_Description() {
    Job testJob = new Job("Position", "Company", "Location", "Description", "Start", "End");
    assertEquals("Description", testJob.getDescription());
  }

  @Test
  public void newJob_returnsStart_Start() {
    Job testJob = new Job("Position", "Company", "Location", "Description", "Start", "End");
    assertEquals("Start", testJob.getStart());
  }

  @Test
  public void newJob_returnsEnd_End() {
    Job testJob = new Job("Position", "Company", "Location", "Description", "Start", "End");
    assertEquals("End", testJob.getEnd());
  }
}
