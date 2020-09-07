package com.github.perscholas.dao;

import com.github.perscholas.model.*;

import java.util.List;

public class CourseRepository extends AbstractJpaRepository<Integer, CourseInterface> implements CourseDao {
    public CourseRepository(String persistenceUnitName) {
        super(persistenceUnitName);
    }

    @Override
    public Class<CourseInterface> getEntityClass() {
        return CourseInterface.class;
    }

    @Override
    public CourseInterface update(CourseInterface dataToBeUpdated, CourseInterface newEntityData) {
        return new CourseBuilder(dataToBeUpdated)
                .setId(newEntityData.getId())
                .setName(newEntityData.getName())
                .setInstructor(newEntityData.getInstructor())
                .build();
    }

    @Override
    public List<CourseInterface> getAllCourses() {
        return super.findAll();
    }
}

