/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.smasys.repository;

import java.io.Serializable;
import lv.smasys.model.Authorities;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author student
 */
public interface AuthoritiesRepository extends CrudRepository<Authorities, String>{
    
}
