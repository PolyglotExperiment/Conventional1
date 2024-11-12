package controller;

import dao.LandmarkDAO;
import dao.MaintenanceDAO;
import ef.qb.core.QueryBuilder;

public class Conventional1 {

    private static LandmarkDAO landmarkDAO;
    private static MaintenanceDAO maintenanceDAO;

    public Conventional1() {
        landmarkDAO = QueryBuilder.create(LandmarkDAO.class);
        maintenanceDAO = QueryBuilder.create(MaintenanceDAO.class);
    }

    public int sumCostsByLocation(String location) {
        /*
        * implement here
         */
        return 0;
    }

}
