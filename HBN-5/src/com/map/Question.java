/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.map;

import java.util.List;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author Sohan_Maali
 */
@Entity
public class Question {

    @Id
    private int qId;
    private String question;

    @OneToMany(mappedBy = "q")
    private List<Answer> ans;

    public Question() {
        super();
    }

    public Question(int qId, String question, List<Answer> ans) {
        this.qId = qId;
        this.question = question;
        this.ans = ans;
    }

    public int getqId() {
        return qId;
    }

    public void setqId(int qId) {
        this.qId = qId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Answer> getAns() {
        return ans;
    }

    public void setAns(List<Answer> ans) {
        this.ans = ans;
    }
}
