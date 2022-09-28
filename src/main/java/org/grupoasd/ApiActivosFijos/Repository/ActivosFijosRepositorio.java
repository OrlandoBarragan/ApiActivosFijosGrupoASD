package org.grupoasd.ApiActivosFijos.Repository;

import org.grupoasd.ApiActivosFijos.Entities.ActivosFijos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivosFijosRepositorio extends JpaRepository<ActivosFijos, String> {

}
