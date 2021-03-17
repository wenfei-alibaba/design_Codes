package com.xuwenfei;

import java.util.List;

/**
 * created by xuwenfei 2021-03-17
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}