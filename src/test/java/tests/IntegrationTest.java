package tests;

import dao.LandmarkDAO;
import dao.MaintenanceDAO;
import ef.qb.core.QueryBuilder;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import model.Landmark;
import model.Maintenance;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class IntegrationTest {

    private static LandmarkDAO landmarkDAO;
    private static MaintenanceDAO maintenanceDAO;

    @BeforeAll
    @SuppressWarnings("unused")
    static void setUp() {
        landmarkDAO = QueryBuilder.create(LandmarkDAO.class);
        maintenanceDAO = QueryBuilder.create(MaintenanceDAO.class);
    }

    @Test
    void testGetLandmarkByName() {
        List<Landmark> result = landmarkDAO.getLandmarkByName("Leaning Tower of Pisa");
        assertNotNull(result);
        assertFalse(result.isEmpty(), "The result list should not be empty");
        assertTrue(result.stream().allMatch(l -> "Leaning Tower of Pisa".equals(l.getName())), "All results should have name 'Leaning Tower of Pisa'");

    }

    @Test
    void testGetLandmarkByInauguration() {
        List<Landmark> result = landmarkDAO.getLandmarkByInauguration(1372);
        assertNotNull(result);
        assertFalse(result.isEmpty(), "The result list should not be empty");
        assertTrue(result.stream().allMatch(l -> 1372 == l.getInauguration()), "All results should have inauguration date '1372'");

    }

    @Test
    void testGetLandmarkByLocation() {
        List<Landmark> result = landmarkDAO.getLandmarkByLocation("Pisa");
        assertNotNull(result);
        assertFalse(result.isEmpty(), "The result list should not be empty");
        assertTrue(result.stream().allMatch(l -> "Pisa".equals(l.getLocation())), "All results should have location 'Pisa'");
    }

    @Test
    void testGetLandmarkByDesigner() {
        List<Landmark> result = landmarkDAO.getLandmarkByDesigner("Bonanno Pisano");
        assertNotNull(result);
        assertFalse(result.isEmpty(), "The result list should not be empty");
        assertTrue(result.stream().allMatch(l -> "Bonanno Pisano".equals(l.getDesigner())), "All results should have architect designer 'Bonanno Pisano'");
    }

    @Test
    void testGetLandmarkByCategory() {
        List<Landmark> result = landmarkDAO.getLandmarkByCategory("Bell Tower");
        assertNotNull(result);
        assertFalse(result.isEmpty(), "The result list should not be empty");
        assertTrue(result.stream().allMatch(l -> "Bell Tower".equals(l.getCategory())), "All results should have category 'Bell Tower'");
    }

    @Test
    void testGetMaintenanceByLandmark() {
        List<Maintenance> result = maintenanceDAO.getMaintenanceByLandmark("Leaning Tower of Pisa");
        assertNotNull(result);
        assertFalse(result.isEmpty(), "The result list should not be empty");
        assertTrue(result.stream().allMatch(m -> "Leaning Tower of Pisa".equals(m.getLandmark())), "All results should have landmark 'Leaning Tower of Pisa'");
    }

    @Test
    void testGetMaintenanceByInicialization() {
        String dateTimeString = "2018-09-02T00:47:09.273+00:00";
        ZonedDateTime zonedDateTime = ZonedDateTime.parse(dateTimeString, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        LocalDateTime localDateTimeUtc = zonedDateTime.withZoneSameInstant(ZoneOffset.UTC).toLocalDateTime();
        List<Maintenance> result = maintenanceDAO.getMaintenanceByInitialization(localDateTimeUtc);
        assertNotNull(result);
        assertFalse(result.isEmpty(), "The result list should not be empty");
        assertTrue(result.stream().allMatch(m -> localDateTimeUtc.equals(m.getInitialization())), "All results should have inicialization '2018-09-02T00:47:09.273+00:00'");
    }

    @Test
    void testGetMaintenanceByFinalization() {
        String dateTimeString = "2023-04-03T09:43:17.624+00:00";
        ZonedDateTime zonedDateTime = ZonedDateTime.parse(dateTimeString, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        LocalDateTime localDateTimeUtc = zonedDateTime.withZoneSameInstant(ZoneOffset.UTC).toLocalDateTime();
        List<Maintenance> result = maintenanceDAO.getMaintenanceByFinalization(localDateTimeUtc);
        assertNotNull(result);
        assertFalse(result.isEmpty(), "The result list should not be empty");
        assertTrue(result.stream().allMatch(m -> localDateTimeUtc.equals(m.getFinalization())), "All results should have finalization '2020-06-02T00:47:09.273+00:00'");
    }

    @Test
    void testGetMaintenanceByCompany() {
        List<Maintenance> result = maintenanceDAO.getMaintenanceByCompany("Historic Repairs Group");
        assertNotNull(result);
        assertFalse(result.isEmpty(), "The result list should not be empty");
        assertTrue(result.stream().allMatch(m -> "Historic Repairs Group".equals(m.getCompany())), "All results should have company 'Historic Repairs Group'");
    }

    @Test
    void testGetMaintenanceByCosts() {
        List<Maintenance> result = maintenanceDAO.getMaintenanceByCosts(95455);
        assertNotNull(result);
        assertFalse(result.isEmpty(), "The result list should not be empty");
        assertTrue(result.stream().allMatch(m -> 95455 == m.getCosts()), "All results should have costs '95455'");
    }

}
