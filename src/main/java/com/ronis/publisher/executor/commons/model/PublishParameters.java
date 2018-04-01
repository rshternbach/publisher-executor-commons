package com.ronis.publisher.executor.commons.model;

import java.io.Serializable;
import java.util.Date;

public class PublishParameters implements Serializable  {

    private static final long serialVersionUID = 7382992705335841316L;

    private String taskName;

    private String publisherName;

    private Date publishTimestamp = new Date();

    private Date executeTimestamp = new Date();

    private String executorResponse;

    public PublishParameters(){
    }

    public PublishParameters(String taskName, String publisherName) {
        this.taskName = taskName;
        this.publisherName = publisherName;
        this.publishTimestamp = new Date(publishTimestamp.getTime());
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public Date getPublishTimestamp() {
        return publishTimestamp;
    }

    public void setPublishTimestamp(Date publishTimestamp) {
        this.publishTimestamp = publishTimestamp;
    }

    public Date getExecuteTimestamp() {
        return executeTimestamp;
    }

    public void setExecuteTimestamp(Date executeTimestamp) {
        this.executeTimestamp = executeTimestamp;
    }

    public String getExecutorResponse() {
        return executorResponse;
    }

    public void setExecutorResponse(String executorResponse) {
        this.executorResponse = executorResponse;
    }

    public String toString() {
        return "PublishParameters [taskName=" + taskName + ", publisherName=" + publisherName + ", publishTimestamp="
                + publishTimestamp + ", executeTimestamp=" + executeTimestamp + ", executorResponse=" + executorResponse
                + "]";
    }

}
