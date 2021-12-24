package com.lao.vehicle.repository;

import com.lao.vehicle.domain.Vehicle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepo extends CrudRepository<Vehicle, String> {
}
