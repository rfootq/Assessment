/*
 * This file is generated by jOOQ.
 */
package domains.tables.records;


import domains.tables.Employeeanswers;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EmployeeanswersRecord extends TableRecordImpl<EmployeeanswersRecord> implements Record4<Integer, Integer, Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>EmployeeAnswers.testing</code>.
     */
    public void setTesting(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>EmployeeAnswers.testing</code>.
     */
    public Integer getTesting() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>EmployeeAnswers.question</code>.
     */
    public void setQuestion(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>EmployeeAnswers.question</code>.
     */
    public Integer getQuestion() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>EmployeeAnswers.employeeAnswer</code>.
     */
    public void setEmployeeanswer(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>EmployeeAnswers.employeeAnswer</code>.
     */
    public Integer getEmployeeanswer() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>EmployeeAnswers.cost</code>.
     */
    public void setCost(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>EmployeeAnswers.cost</code>.
     */
    public Integer getCost() {
        return (Integer) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, Integer, Integer, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Employeeanswers.EMPLOYEEANSWERS.TESTING;
    }

    @Override
    public Field<Integer> field2() {
        return Employeeanswers.EMPLOYEEANSWERS.QUESTION;
    }

    @Override
    public Field<Integer> field3() {
        return Employeeanswers.EMPLOYEEANSWERS.EMPLOYEEANSWER;
    }

    @Override
    public Field<Integer> field4() {
        return Employeeanswers.EMPLOYEEANSWERS.COST;
    }

    @Override
    public Integer component1() {
        return getTesting();
    }

    @Override
    public Integer component2() {
        return getQuestion();
    }

    @Override
    public Integer component3() {
        return getEmployeeanswer();
    }

    @Override
    public Integer component4() {
        return getCost();
    }

    @Override
    public Integer value1() {
        return getTesting();
    }

    @Override
    public Integer value2() {
        return getQuestion();
    }

    @Override
    public Integer value3() {
        return getEmployeeanswer();
    }

    @Override
    public Integer value4() {
        return getCost();
    }

    @Override
    public EmployeeanswersRecord value1(Integer value) {
        setTesting(value);
        return this;
    }

    @Override
    public EmployeeanswersRecord value2(Integer value) {
        setQuestion(value);
        return this;
    }

    @Override
    public EmployeeanswersRecord value3(Integer value) {
        setEmployeeanswer(value);
        return this;
    }

    @Override
    public EmployeeanswersRecord value4(Integer value) {
        setCost(value);
        return this;
    }

    @Override
    public EmployeeanswersRecord values(Integer value1, Integer value2, Integer value3, Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EmployeeanswersRecord
     */
    public EmployeeanswersRecord() {
        super(Employeeanswers.EMPLOYEEANSWERS);
    }

    /**
     * Create a detached, initialised EmployeeanswersRecord
     */
    public EmployeeanswersRecord(Integer testing, Integer question, Integer employeeanswer, Integer cost) {
        super(Employeeanswers.EMPLOYEEANSWERS);

        setTesting(testing);
        setQuestion(question);
        setEmployeeanswer(employeeanswer);
        setCost(cost);
    }
}