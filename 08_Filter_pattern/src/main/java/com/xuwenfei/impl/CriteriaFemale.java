package com.xuwenfei.impl;

import com.xuwenfei.Criteria;
import com.xuwenfei.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * created by xuwenfei 2021-03-17
 */
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}