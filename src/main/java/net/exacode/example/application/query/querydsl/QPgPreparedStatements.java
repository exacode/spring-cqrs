package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgPreparedStatements is a Querydsl query type for QPgPreparedStatements
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgPreparedStatements extends com.mysema.query.sql.RelationalPathBase<QPgPreparedStatements> {

    private static final long serialVersionUID = 859880348;

    public static final QPgPreparedStatements pgPreparedStatements = new QPgPreparedStatements("pg_prepared_statements");

    public final BooleanPath fromSql = createBoolean("from_sql");

    public final StringPath name = createString("name");

    public final SimplePath<Object[]> parameterTypes = createSimple("parameter_types", Object[].class);

    public final DateTimePath<java.sql.Timestamp> prepareTime = createDateTime("prepare_time", java.sql.Timestamp.class);

    public final StringPath statement = createString("statement");

    public QPgPreparedStatements(String variable) {
        super(QPgPreparedStatements.class, forVariable(variable), "pg_catalog", "pg_prepared_statements");
    }

    @SuppressWarnings("all")
    public QPgPreparedStatements(Path<? extends QPgPreparedStatements> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_prepared_statements");
    }

    public QPgPreparedStatements(PathMetadata<?> metadata) {
        super(QPgPreparedStatements.class, metadata, "pg_catalog", "pg_prepared_statements");
    }

}

