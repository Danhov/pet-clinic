package com.hovorun.sfgpetclinic.repositories;

import com.hovorun.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

import java.nio.file.LinkOption;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
