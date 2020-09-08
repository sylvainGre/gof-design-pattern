package behavioral.observer.impl;

import behavioral.observer.model.Observer;
import behavioral.observer.model.Subject;

public class MyTopicSubscriber implements Observer {
    private String name;
    private Subject topic;

    public MyTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String message = (String) topic.getUpdate(this);
        if(message == null){
            System.out.println(this.name + " no new mesage");
        }else{
            System.out.println(this.name + " message : "+message);
        }
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }
}
