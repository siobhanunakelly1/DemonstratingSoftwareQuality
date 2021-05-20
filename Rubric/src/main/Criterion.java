package main;
public class Criterion {
    private String criterionName;

    public Criterion(String name){
        this.criterionName = name;
    }

    public String getCriterion() {
        return criterionName;
    }

    public void setCriterion(String criterion) {
        this.criterionName = criterion;
    }
}
