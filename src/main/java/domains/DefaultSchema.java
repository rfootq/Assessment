/*
 * This file is generated by jOOQ.
 */
package domains;


import domains.tables.Answers;
import domains.tables.Branches;
import domains.tables.Employees;
import domains.tables.Organizations;
import domains.tables.Positions;
import domains.tables.Questions;
import domains.tables.Roles;
import domains.tables.SqliteSequence;
import domains.tables.Testing;
import domains.tables.Tests;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DefaultSchema extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>DEFAULT_SCHEMA</code>
     */
    public static final DefaultSchema DEFAULT_SCHEMA = new DefaultSchema();

    /**
     * The table <code>Answers</code>.
     */
    public final Answers ANSWERS = Answers.ANSWERS;

    /**
     * The table <code>Branches</code>.
     */
    public final Branches BRANCHES = Branches.BRANCHES;

    /**
     * The table <code>Employees</code>.
     */
    public final Employees EMPLOYEES = Employees.EMPLOYEES;

    /**
     * The table <code>Organizations</code>.
     */
    public final Organizations ORGANIZATIONS = Organizations.ORGANIZATIONS;

    /**
     * The table <code>Positions</code>.
     */
    public final Positions POSITIONS = Positions.POSITIONS;

    /**
     * The table <code>Questions</code>.
     */
    public final Questions QUESTIONS = Questions.QUESTIONS;

    /**
     * The table <code>Roles</code>.
     */
    public final Roles ROLES = Roles.ROLES;

    /**
     * The table <code>sqlite_sequence</code>.
     */
    public final SqliteSequence SQLITE_SEQUENCE = SqliteSequence.SQLITE_SEQUENCE;

    /**
     * The table <code>Testing</code>.
     */
    public final Testing TESTING = Testing.TESTING;

    /**
     * The table <code>Tests</code>.
     */
    public final Tests TESTS = Tests.TESTS;

    /**
     * No further instances allowed
     */
    private DefaultSchema() {
        super("", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Answers.ANSWERS,
            Branches.BRANCHES,
            Employees.EMPLOYEES,
            Organizations.ORGANIZATIONS,
            Positions.POSITIONS,
            Questions.QUESTIONS,
            Roles.ROLES,
            SqliteSequence.SQLITE_SEQUENCE,
            Testing.TESTING,
            Tests.TESTS
        );
    }
}