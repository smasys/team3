/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.smasys.repository;

import org.springframework.data.repository.CrudRepository;
import lv.smasys.model.User;
/**
 *
 * @author student
 */
public interface UserRepository extends CrudRepository<User, String>{
    
}
