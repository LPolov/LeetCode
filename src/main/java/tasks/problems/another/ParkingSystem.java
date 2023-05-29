package tasks.problems.another;

import java.util.HashMap;
import java.util.Map;

public class ParkingSystem {
  private final Map<Integer, Integer> carPlaces = new HashMap<>();

  public ParkingSystem(int big, int medium, int small) {
    carPlaces.put(1, big);
    carPlaces.put(2, medium);
    carPlaces.put(3, small);
  }

  public boolean addCar(int carType) {
    if (carPlaces.get(carType) == 0) {
      return false;
    }
    carPlaces.compute(carType, (k, v) -> --v);
    return true;
  }
}
