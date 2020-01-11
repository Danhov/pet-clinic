package com.hovorun.sfgpetclinic.repositories;

import com.hovorun.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
