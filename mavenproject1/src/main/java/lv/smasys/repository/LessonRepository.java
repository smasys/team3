/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.smasys.repository;

import lv.smasys.model.Lesson;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author USER
 */
public interface LessonRepository extends CrudRepository<Lesson, Long>{
    
}
