/*
 * This file is generated by jOOQ.
 */
package domains.tables.records;


import domains.tables.Positions;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PositionsRecord extends UpdatableRecordImpl<PositionsRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>Positions.positions_id</code>.
     */
    public void setPositionsId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Positions.positions_id</code>.
     */
    public Integer getPositionsId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Positions.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Positions.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Positions.POSITIONS.POSITIONS_ID;
    }

    @Override
    public Field<String> field2() {
        return Positions.POSITIONS.NAME;
    }

    @Override
    public Integer component1() {
        return getPositionsId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public Integer value1() {
        return getPositionsId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public PositionsRecord value1(Integer value) {
        setPositionsId(value);
        return this;
    }

    @Override
    public PositionsRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public PositionsRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PositionsRecord
     */
    public PositionsRecord() {
        super(Positions.POSITIONS);
    }

    /**
     * Create a detached, initialised PositionsRecord
     */
    public PositionsRecord(Integer positionsId, String name) {
        super(Positions.POSITIONS);

        setPositionsId(positionsId);
        setName(name);
    }
}
