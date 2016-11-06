/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.smasys.repository;

import java.util.List;
import lv.smasys.model.Post;
import lv.smasys.model.Student;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author student
 */
public interface StudentRepository extends CrudRepository<Student, Long>{
    List<Student> findByMail(String mail);
}
