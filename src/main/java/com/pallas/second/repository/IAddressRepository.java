package com.pallas.second.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pallas.second.model.Address;

@Repository
public interface IAddressRepository extends CrudRepository<Address, Long> {

}
