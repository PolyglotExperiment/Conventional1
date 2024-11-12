package dao;

import ef.qb.core.Repository;
import ef.qb.core.annotation.TargetEntity;
import java.time.LocalDateTime;
import java.util.List;
import model.Maintenance;

@TargetEntity(Maintenance.class)
public interface MaintenanceDAO extends Repository<Maintenance> {

    List<Maintenance> getMaintenance();

    List<Maintenance> getMaintenanceByLandmark(String landmark);

    List<Maintenance> getMaintenanceByInitialization(LocalDateTime initialization);

    List<Maintenance> getMaintenanceByFinalization(LocalDateTime finalization);

    List<Maintenance> getMaintenanceByCompany(String company);

    List<Maintenance> getMaintenanceByCosts(int costs);

}
