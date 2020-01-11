package com.hovorun.sfgpetclinic.services.springdatajapa;

import com.hovorun.sfgpetclinic.model.Vet;
import com.hovorun.sfgpetclinic.repositories.VetRepository;
import com.hovorun.sfgpetclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VetSDJpaService implements VetService {

    private final VetRepository vetRepository;
    //private final SpecialityRepository specialityRepository;

    public VetSDJpaService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }


    @Override
    public Set <Vet> findAll() {
        Set<Vet> vets = new HashSet <>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet findById(Long aLong) {
        return vetRepository.findById(aLong).orElse(null);
    }

    @Override
    public Vet save(Vet object) {
        return vetRepository.save(object);
    }

    @Override
    public void deleteById(Long aLong) {
        vetRepository.deleteById(aLong);
    }

    @Override
    public void delete(Vet object) {
        vetRepository.delete(object);
    }
}
