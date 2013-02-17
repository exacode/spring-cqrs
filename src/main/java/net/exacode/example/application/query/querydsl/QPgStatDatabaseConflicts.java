package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgStatDatabaseConflicts is a Querydsl query type for QPgStatDatabaseConflicts
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgStatDatabaseConflicts extends com.mysema.query.sql.RelationalPathBase<QPgStatDatabaseConflicts> {

    private static final long serialVersionUID = 653724471;

    public static final QPgStatDatabaseConflicts pgStatDatabaseConflicts = new QPgStatDatabaseConflicts("pg_stat_database_conflicts");

    public final NumberPath<Long> conflBufferpin = createNumber("confl_bufferpin", Long.class);

    public final NumberPath<Long> conflDeadlock = createNumber("confl_deadlock", Long.class);

    public final NumberPath<Long> conflLock = createNumber("confl_lock", Long.class);

    public final NumberPath<Long> conflSnapshot = createNumber("confl_snapshot", Long.class);

    public final NumberPath<Long> conflTablespace = createNumber("confl_tablespace", Long.class);

    public final NumberPath<Long> datid = createNumber("datid", Long.class);

    public final StringPath datname = createString("datname");

    public QPgStatDatabaseConflicts(String variable) {
        super(QPgStatDatabaseConflicts.class, forVariable(variable), "pg_catalog", "pg_stat_database_conflicts");
    }

    @SuppressWarnings("all")
    public QPgStatDatabaseConflicts(Path<? extends QPgStatDatabaseConflicts> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_stat_database_conflicts");
    }

    public QPgStatDatabaseConflicts(PathMetadata<?> metadata) {
        super(QPgStatDatabaseConflicts.class, metadata, "pg_catalog", "pg_stat_database_conflicts");
    }

}

