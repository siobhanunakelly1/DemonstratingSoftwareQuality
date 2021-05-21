package main;

public class Grade {
    private int score;
    private Criterion criterion;

    public Grade(int score, Criterion cr){
        this.score = score;
        this.criterion = cr;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Criterion getCriterion() {
        return criterion;
    }

    public void setCriterion(Criterion criterion) {
        this.criterion = criterion;
    }

    public String getCriterionName(){
        return criterion.getCriterion();
    }
    
}
