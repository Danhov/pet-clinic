package com.hovorun.sfgpetclinic.repositories;

import com.hovorun.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);

}
