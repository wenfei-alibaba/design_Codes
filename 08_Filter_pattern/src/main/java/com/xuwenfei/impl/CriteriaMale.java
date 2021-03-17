package com.xuwenfei.impl;

import com.xuwenfei.Criteria;
import com.xuwenfei.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * created by xuwenfei 2021-03-17
 */
public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}