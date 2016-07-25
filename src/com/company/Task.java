package com.company;


import java.util.Date;


public class Task {
    private String text;
    private Date date;
    private String status = "unassigned";

    /**
     * Constructor initializes all Task data memebers to argument values
     *
     * @param  text
     * @param  date
     * @param status
     */
    public Task(String text, Date date, String status) {
        this.text = text;
        this.date = date;
        this.status = status;
    }

    /**
     * Returns the Task's text data member's value
     *
     * @return {String}
     */
    public String getText() {
        return text;
    }

    /**
     * Set's the Task's text value to arguement's value
     *
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Returns the Task's text data member's value
     *
     * @return {Date}
     */
    public Date getDate() {
        return date;
    }

    /**
     * Set's the Task's date value to argument's value
     *
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Returns the Task's text data member's value
     *
     * @return {String}
     */
    public String getStatus() {
        return status;
    }

    /**
     * Set's the Task's status value to argument's value
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Returns a string of the Task's data members as an object
     *
     * @return {String}
     */
    @Override
    public String toString() {
        return "Task{" +
                "text='" + text + '\'' +
                ", date=" + date +
                ", status='" + status + '\'' +
                '}';
    }

    /**
     * Copy the Tasks's data members into the argument's data members
     *
     * @param  aTask
     * @return Task object
     */
    public Task copyTo(Task aTask) {
        return new Task(this.text, this.date, this.status);
    }

    /**
     * Copy the argument's data members into the Tasks's data members
     *
     * @param  aTask
     * @return boolean
     */
    public boolean copyFrom(Task aTask) {
        this.text = aTask.text;
        this.date = aTask.date;
        this.status = aTask.status;
        return true;
    }

    /**
     * Determine if the argument task is equal to the current task in value
     *
     * @param  o object to compare with
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;

        if (text != null ? !text.equals(task.text) : task.text != null) return false;
        if (date != null ? !date.equals(task.date) : task.date != null) return false;
        return status != null ? status.equals(task.status) : task.status == null;

    }

}


