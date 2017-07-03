package com.dharbor.carstore.repository;

import com.dharbor.carstore.domain.RegistryCarSold;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Martin on 27/6/17.
 */
public interface RegistryCarSoldRepository extends MongoRepository<RegistryCarSold, String>{
}
