package ch.hearc.ig.guideresto.business;

import javax.persistence.*;

@Entity
@Table(name = "NOTES")
public class Grade {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,
            generator="SEQ_GRADES")
    @SequenceGenerator(name="SEQ_GRADES",
            sequenceName="SEQ_NOTES",
            initialValue=1,
            allocationSize=1)
    @Column(name = "NUMERO")
    private Integer id;
    @Column(name = "NOTE")
    private Integer grade;
    @ManyToOne
    @JoinColumn(name = "FK_COMM")
    private CompleteEvaluation evaluation;
    @ManyToOne
    @JoinColumn(name = "FK_CRIT")
    private EvaluationCriteria criteria;

    public Grade(Integer id, Integer grade, CompleteEvaluation evaluation, EvaluationCriteria criteria) {
        this.id = id;
        this.grade = grade;
        this.evaluation = evaluation;
        this.criteria = criteria;
    }

    public Grade() {

    }

    public Integer getGrade() {
        return grade;
    }

    public EvaluationCriteria getCriteria() {
        return criteria;
    }

    public Evaluation getEvaluation() {
        return evaluation;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEvaluation(CompleteEvaluation completeEvaluation) {
        this.evaluation = completeEvaluation;
    }
}