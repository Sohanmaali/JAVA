package com.map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/*
 * @author Sohan_Maali
 */
@Entity
public class Answer {

    @Id
    private int ansId;
    private String ans;

    @ManyToOne
    private Question q;

    public Question getQ() {
        return q;
    }

    public void setQ(Question q) {
        this.q = q;
    }

    public Answer(int ansId, String ans, Question q) {
        this.ansId = ansId;
        this.ans = ans;
        this.q = q;
    }

    public Answer(int ansId, String ans) {
        this.ansId = ansId;
        this.ans = ans;
    }

    public Answer() {
    }

    public int getAnsId() {
        return ansId;
    }

    public void setAnsId(int ansId) {
        this.ansId = ansId;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

}
