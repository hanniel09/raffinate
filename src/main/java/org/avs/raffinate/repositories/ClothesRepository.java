package org.avs.raffinate.repositories;

import org.avs.raffinate.domain.clothes.Clothes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClothesRepository extends JpaRepository<Clothes,String> {
}
