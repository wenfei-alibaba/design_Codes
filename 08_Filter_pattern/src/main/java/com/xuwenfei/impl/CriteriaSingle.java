package com.xuwenfei.impl;

import com.xuwenfei.Criteria;
import com.xuwenfei.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * created by xuwenfei 2021-03-17
 */
public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}