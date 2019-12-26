package com.hovorun.sfgpetclinic.services.map;

import com.hovorun.sfgpetclinic.model.Owner;
import com.hovorun.sfgpetclinic.services.CrudService;
import com.hovorun.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Set <Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner finByLasName(String lastName) {
        return null;
    }
}
