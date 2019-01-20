/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.grh.Repository;

import com.example.grh.Model.User;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Med Said M'bareck
 */
public interface UserRepository extends CrudRepository<User, Long> {
    
}
