package com.eduLive.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduLive.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
