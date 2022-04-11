package com.kruger.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * 
 * @author Gustavo Parco
 *
 * @param <T>
 * @param <ID>
 */
@NoRepositoryBean
public interface IGenericRepo<T, ID> extends JpaRepository<T, ID> {

}
