package com.buildappswithpaulo.com;

import com.buildappswithpaulo.com.interfaces.Observer;
import com.buildappswithpaulo.com.model.EmailTopic;
import com.buildappswithpaulo.com.model.EmailTopicSubscriber;

public class Main {
    public static void main(String[] args) {
        EmailTopic topic = new EmailTopic();
        //create observers
        Observer firstObserver = new EmailTopicSubscriber("FirstObserver");
        Observer secondObserver = new EmailTopicSubscriber("SecondObserver");
        Observer thirdObserver = new EmailTopicSubscriber("ThirdObserver");
        //register them
        topic.register(firstObserver);
        topic.register(secondObserver);
        topic.register(thirdObserver);
        //attaching observer to subject
        firstObserver.setSubject(topic);
        secondObserver.setSubject(topic);
        thirdObserver.setSubject(topic);
        //check for update
        firstObserver.update();//no msg becaususe no post yet
        //privuder - bloodcast - all 3 receives the message
        topic.postMessage("Hello subscribers");
    }
}
