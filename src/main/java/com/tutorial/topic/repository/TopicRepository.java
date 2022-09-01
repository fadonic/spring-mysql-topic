package com.tutorial.topic.repository;

import org.springframework.data.repository.CrudRepository;

import com.tutorial.topic.entity.Topic;

public interface TopicRepository extends CrudRepository<Topic, Integer> {

}
