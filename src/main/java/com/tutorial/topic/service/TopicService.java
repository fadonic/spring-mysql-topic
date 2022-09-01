package com.tutorial.topic.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial.topic.entity.Topic;
import com.tutorial.topic.repository.TopicRepository;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<Topic>();

		topicRepository.findAll().forEach(topics::add);

		return topics;
	}

	public Topic addTopic(Topic topic) {

		Topic savedTopic = topicRepository.save(topic);

		return savedTopic;
	}

	public Topic updateTopic(Topic topic) {
		
		Topic savedTopic = topicRepository.save(topic);
		
		return savedTopic;
	}

	public void deleteTopic(int id) {
		
		topicRepository.deleteById(id);
	}
}
