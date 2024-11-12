package dao;

import ef.qb.core.Repository;
import ef.qb.core.annotation.TargetEntity;
import java.util.List;
import model.Landmark;

@TargetEntity(Landmark.class)
public interface LandmarkDAO extends Repository<Landmark> {

    List<Landmark> getLandmark();

    List<Landmark> getLandmarkByName(String name);

    List<Landmark> getLandmarkByInauguration(Integer inauguration);

    List<Landmark> getLandmarkByLocation(String location);

    List<Landmark> getLandmarkByDesigner(String designer);

    List<Landmark> getLandmarkByCategory(String category);

}
