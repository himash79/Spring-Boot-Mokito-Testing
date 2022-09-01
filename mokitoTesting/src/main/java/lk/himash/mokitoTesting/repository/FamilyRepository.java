package lk.himash.mokitoTesting.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import lk.himash.mokitoTesting.entity.Family;

@Repository
public interface FamilyRepository extends MongoRepository<Family, String> {

}
