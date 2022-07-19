/*
 * This file is generated by jOOQ.
 */
package domains.tables;


import domains.DefaultSchema;
import domains.Indexes;
import domains.Keys;
import domains.tables.records.EmployeeanswersRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Employeeanswers extends TableImpl<EmployeeanswersRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>EmployeeAnswers</code>
     */
    public static final Employeeanswers EMPLOYEEANSWERS = new Employeeanswers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EmployeeanswersRecord> getRecordType() {
        return EmployeeanswersRecord.class;
    }

    /**
     * The column <code>EmployeeAnswers.testing</code>.
     */
    public final TableField<EmployeeanswersRecord, Integer> TESTING = createField(DSL.name("testing"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>EmployeeAnswers.question</code>.
     */
    public final TableField<EmployeeanswersRecord, Integer> QUESTION = createField(DSL.name("question"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>EmployeeAnswers.employeeAnswer</code>.
     */
    public final TableField<EmployeeanswersRecord, Integer> EMPLOYEEANSWER = createField(DSL.name("employeeAnswer"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>EmployeeAnswers.cost</code>.
     */
    public final TableField<EmployeeanswersRecord, Integer> COST = createField(DSL.name("cost"), SQLDataType.INTEGER, this, "");

    private Employeeanswers(Name alias, Table<EmployeeanswersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Employeeanswers(Name alias, Table<EmployeeanswersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>EmployeeAnswers</code> table reference
     */
    public Employeeanswers(String alias) {
        this(DSL.name(alias), EMPLOYEEANSWERS);
    }

    /**
     * Create an aliased <code>EmployeeAnswers</code> table reference
     */
    public Employeeanswers(Name alias) {
        this(alias, EMPLOYEEANSWERS);
    }

    /**
     * Create a <code>EmployeeAnswers</code> table reference
     */
    public Employeeanswers() {
        this(DSL.name("EmployeeAnswers"), null);
    }

    public <O extends Record> Employeeanswers(Table<O> child, ForeignKey<O, EmployeeanswersRecord> key) {
        super(child, key, EMPLOYEEANSWERS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.EMPLOYEEANSWERS_TESTING_UINDEX);
    }

    @Override
    public List<ForeignKey<EmployeeanswersRecord, ?>> getReferences() {
        return Arrays.asList(Keys.EMPLOYEEANSWERS__FK_EMPLOYEEANSWERS_QUESTIONS_PK);
    }

    private transient Questions _questions;

    public Questions questions() {
        if (_questions == null)
            _questions = new Questions(this, Keys.EMPLOYEEANSWERS__FK_EMPLOYEEANSWERS_QUESTIONS_PK);

        return _questions;
    }

    @Override
    public Employeeanswers as(String alias) {
        return new Employeeanswers(DSL.name(alias), this);
    }

    @Override
    public Employeeanswers as(Name alias) {
        return new Employeeanswers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Employeeanswers rename(String name) {
        return new Employeeanswers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Employeeanswers rename(Name name) {
        return new Employeeanswers(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
