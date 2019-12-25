package com.hovorun.sfgpetclinic.services;

import com.hovorun.sfgpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner finByLasName(String lastName);

}
