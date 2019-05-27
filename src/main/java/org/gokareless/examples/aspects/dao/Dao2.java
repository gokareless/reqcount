package org.gokareless.examples.aspects.dao;

import org.springframework.stereotype.Repository;

@Repository
public class Dao2 {

    public String retrieveSomething(){
        return "Dao2";
    }

}