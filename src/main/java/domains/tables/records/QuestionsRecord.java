/*
 * This file is generated by jOOQ.
 */
package domains.tables.records;


import domains.tables.Questions;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class QuestionsRecord extends UpdatableRecordImpl<QuestionsRecord> implements Record5<Integer, Integer, String, Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>Questions.question_id</code>.
     */
    public void setQuestionId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Questions.question_id</code>.
     */
    public Integer getQuestionId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Questions.test</code>.
     */
    public void setTest(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Questions.test</code>.
     */
    public Integer getTest() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Questions.question</code>.
     */
    public void setQuestion(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Questions.question</code>.
     */
    public String getQuestion() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Questions.answers</code>.
     */
    public void setAnswers(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Questions.answers</code>.
     */
    public Integer getAnswers() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>Questions.cost</code>.
     */
    public void setCost(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>Questions.cost</code>.
     */
    public Integer getCost() {
        return (Integer) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, Integer, String, Integer, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, Integer, String, Integer, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Questions.QUESTIONS.QUESTION_ID;
    }

    @Override
    public Field<Integer> field2() {
        return Questions.QUESTIONS.TEST;
    }

    @Override
    public Field<String> field3() {
        return Questions.QUESTIONS.QUESTION;
    }

    @Override
    public Field<Integer> field4() {
        return Questions.QUESTIONS.ANSWERS;
    }

    @Override
    public Field<Integer> field5() {
        return Questions.QUESTIONS.COST;
    }

    @Override
    public Integer component1() {
        return getQuestionId();
    }

    @Override
    public Integer component2() {
        return getTest();
    }

    @Override
    public String component3() {
        return getQuestion();
    }

    @Override
    public Integer component4() {
        return getAnswers();
    }

    @Override
    public Integer component5() {
        return getCost();
    }

    @Override
    public Integer value1() {
        return getQuestionId();
    }

    @Override
    public Integer value2() {
        return getTest();
    }

    @Override
    public String value3() {
        return getQuestion();
    }

    @Override
    public Integer value4() {
        return getAnswers();
    }

    @Override
    public Integer value5() {
        return getCost();
    }

    @Override
    public QuestionsRecord value1(Integer value) {
        setQuestionId(value);
        return this;
    }

    @Override
    public QuestionsRecord value2(Integer value) {
        setTest(value);
        return this;
    }

    @Override
    public QuestionsRecord value3(String value) {
        setQuestion(value);
        return this;
    }

    @Override
    public QuestionsRecord value4(Integer value) {
        setAnswers(value);
        return this;
    }

    @Override
    public QuestionsRecord value5(Integer value) {
        setCost(value);
        return this;
    }

    @Override
    public QuestionsRecord values(Integer value1, Integer value2, String value3, Integer value4, Integer value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached QuestionsRecord
     */
    public QuestionsRecord() {
        super(Questions.QUESTIONS);
    }

    /**
     * Create a detached, initialised QuestionsRecord
     */
    public QuestionsRecord(Integer questionId, Integer test, String question, Integer answers, Integer cost) {
        super(Questions.QUESTIONS);

        setQuestionId(questionId);
        setTest(test);
        setQuestion(question);
        setAnswers(answers);
        setCost(cost);
    }
}