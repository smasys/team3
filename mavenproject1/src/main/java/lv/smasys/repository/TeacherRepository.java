/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.smasys.repository;

import lv.smasys.model.Teacher;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author student
 */
public interface TeacherRepository extends CrudRepository<Teacher, Long>{
    
}
