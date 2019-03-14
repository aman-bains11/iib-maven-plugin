/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2015.
 */
package ch.sbb.maven.plugins.iib.utils;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.collections.Predicate;

/**
 *
 *
 *
 * 
 */
public class DependencyPredicate implements Predicate {

    private Object expected;
    private String propertyName;

    public DependencyPredicate(String propertyName, Object expected) {
        super();
        this.propertyName = propertyName;
        this.expected = expected;
    }

    public boolean evaluate(Object object) {
        try {
            return expected.equals(PropertyUtils.getProperty(object, propertyName));
        } catch (Exception e) {
            return false;
        }
    }
}
