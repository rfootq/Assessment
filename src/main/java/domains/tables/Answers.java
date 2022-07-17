/*
 * This file is generated by jOOQ.
 */
package domains.tables;


import domains.DefaultSchema;
import domains.Keys;
import domains.tables.records.AnswersRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Answers extends TableImpl<AnswersRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>Answers</code>
     */
    public static final Answers ANSWERS = new Answers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AnswersRecord> getRecordType() {
        return AnswersRecord.class;
    }

    /**
     * The column <code>Answers.answer_id</code>.
     */
    public final TableField<AnswersRecord, Integer> ANSWER_ID = createField(DSL.name("answer_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Answers.question</code>.
     */
    public final TableField<AnswersRecord, Integer> QUESTION = createField(DSL.name("question"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Answers.is_right</code>.
     */
    public final TableField<AnswersRecord, Integer> IS_RIGHT = createField(DSL.name("is_right"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>Answers.answer</code>.
     */
    public final TableField<AnswersRecord, String> ANSWER = createField(DSL.name("answer"), SQLDataType.CLOB.nullable(false), this, "");

    private Answers(Name alias, Table<AnswersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Answers(Name alias, Table<AnswersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>Answers</code> table reference
     */
    public Answers(String alias) {
        this(DSL.name(alias), ANSWERS);
    }

    /**
     * Create an aliased <code>Answers</code> table reference
     */
    public Answers(Name alias) {
        this(alias, ANSWERS);
    }

    /**
     * Create a <code>Answers</code> table reference
     */
    public Answers() {
        this(DSL.name("Answers"), null);
    }

    public <O extends Record> Answers(Table<O> child, ForeignKey<O, AnswersRecord> key) {
        super(child, key, ANSWERS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public UniqueKey<AnswersRecord> getPrimaryKey() {
        return Keys.ANSWERS__ANSWERS_PK;
    }

    @Override
    public Answers as(String alias) {
        return new Answers(DSL.name(alias), this);
    }

    @Override
    public Answers as(Name alias) {
        return new Answers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Answers rename(String name) {
        return new Answers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Answers rename(Name name) {
        return new Answers(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, Integer, Integer, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}