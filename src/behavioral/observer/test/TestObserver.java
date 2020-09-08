package behavioral.observer.test;

import behavioral.observer.impl.MyTopic;
import behavioral.observer.impl.MyTopicSubscriber;
import behavioral.observer.model.Observer;
import behavioral.observer.model.Subject;

public class TestObserver {
    public static void main(String[] args){
        MyTopic topic = new MyTopic();

        Observer topicSubscriber1 = new MyTopicSubscriber("Sub1");
        topic.register(topicSubscriber1);

        topicSubscriber1.setSubject(topic);
        topicSubscriber1.update();

        topic.postMessage("test");

        Observer topicSubscriber2 = new MyTopicSubscriber("Sub2");
        topic.register(topicSubscriber2);

        topicSubscriber2.setSubject(topic);
        topicSubscriber2.update();

        topic.postMessage("test 2");

        Observer topicSubscriber3 = new MyTopicSubscriber("Sub3");
        //topic.register(topicSubscriber3);

        topicSubscriber3.setSubject(topic);
        topicSubscriber3.update();

        topic.postMessage("test 3");
    }
}
