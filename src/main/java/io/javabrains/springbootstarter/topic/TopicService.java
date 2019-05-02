package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	
	 private List<Topics> topics = new ArrayList<>(Arrays.asList(
			 new Topics("1", "Spring Framework", " :V "),
			 new Topics("2", "Programacion Avanzada", " 4to Ti "),
			 new Topics("3", "Web 2", " :V "),
			 new Topics("4", "Inteligencia Artificial", " :V ")
			));
	 
	 
	 public List<Topics> getAllTopic() {	
			return topics;
	 }
	 
	 public Topics getTopic(String id){
			
		 return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
			
		}

	public void addTopic(Topics topic) {
		topics.add(topic);
	}

	public void updateTopic(Topics topic, String id) {
		int i=0;
		for (Topics t : topics) {
			if(t.getId().equals(id)) {
				System.out.println("Id modificar " + i);
				topics.set(i, topic);
				return;
			}
		i=i+1;
		}
		
	}

	public void deleteTopic(String id) {
		topics.removeIf(t->t.getId().equals(id));
		
	}
}

