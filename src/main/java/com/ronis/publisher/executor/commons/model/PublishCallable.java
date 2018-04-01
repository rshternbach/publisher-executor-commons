package com.ronis.publisher.executor.commons.model;

import java.io.Serializable;
import java.util.concurrent.Callable;

import com.ronis.publisher.executor.commons.services.ApplicationContextProvider;
import com.ronis.publisher.executor.commons.services.Executor;

public class PublishCallable implements Callable<String>, Serializable {

    private static final long serialVersionUID = -1750087749558322913L;

    private PublishParameters publishParameters;
    
    public PublishCallable() {
    }

    public PublishCallable(PublishParameters publishParameters){
        this.setPublishParameters(publishParameters);
    }
    
    public String call() throws Exception {
        return ((Executor) ApplicationContextProvider.getApplicationContext().getBean("executorService"))
                .execute(publishParameters);
    }

    public PublishParameters getPublishParameters() {
        return publishParameters;
    }

    public void setPublishParameters(PublishParameters publishParameters) {
        this.publishParameters = publishParameters;
    }

}
