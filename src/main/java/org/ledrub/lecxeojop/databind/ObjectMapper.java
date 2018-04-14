package org.ledrub.lecxeojop.databind;

import java.io.File;

import org.ledrub.lecxeojop.reflection.ReflectionHelper;

public class ObjectMapper {
    public <T> T readAggregateRoot(File file, Class <T> type) {
        return ReflectionHelper.newInstance(type);
    }
}
