/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pfe.Repositories;

import com.example.pfe.Entities.Message;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author khali
 */
public interface MessageRepository extends CrudRepository<Message, Long> {
    
}
