package com.hovorun.sfgpetclinic.services.map;

import com.hovorun.sfgpetclinic.model.Speciality;
import com.hovorun.sfgpetclinic.model.Vet;
import com.hovorun.sfgpetclinic.services.SpecialitiesService;
import com.hovorun.sfgpetclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
@Profile({"default", "map"})
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialitiesService specialitiesService;

    public VetMapService(SpecialitiesService specialitiesService) {
        this.specialitiesService = specialitiesService;
    }

    @Override
    public Set <Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Vet save(Vet object) {

        if (object.getSpecialities().size() > 0){
            object.getSpecialities().forEach(speciality -> {
                if (speciality.getId() == null){
                    Speciality savedSpeciality = specialitiesService.save(speciality);
                    speciality.setId(savedSpeciality.getId());
                }
            });
        }

        return super.save(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
