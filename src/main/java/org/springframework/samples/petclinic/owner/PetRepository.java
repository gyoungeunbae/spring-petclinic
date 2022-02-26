package org.springframework.samples.petclinic.owner;

import org.springframework.data.repository.Repository;

interface PetRepository extends Repository<Owner, Integer> {
}
