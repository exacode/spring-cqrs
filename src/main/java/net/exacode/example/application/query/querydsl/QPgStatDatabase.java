package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgStatDatabase is a Querydsl query type for QPgStatDatabase
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgStatDatabase extends com.mysema.query.sql.RelationalPathBase<QPgStatDatabase> {

    private static final long serialVersionUID = 702113482;

    public static final QPgStatDatabase pgStatDatabase = new QPgStatDatabase("pg_stat_database");

    public final NumberPath<Long> blksHit = createNumber("blks_hit", Long.class);

    public final NumberPath<Long> blksRead = createNumber("blks_read", Long.class);

    public final NumberPath<Long> conflicts = createNumber("conflicts", Long.class);

    public final NumberPath<Long> datid = createNumber("datid", Long.class);

    public final StringPath datname = createString("datname");

    public final NumberPath<Integer> numbackends = createNumber("numbackends", Integer.class);

    public final DateTimePath<java.sql.Timestamp> statsReset = createDateTime("stats_reset", java.sql.Timestamp.class);

    public final NumberPath<Long> tupDeleted = createNumber("tup_deleted", Long.class);

    public final NumberPath<Long> tupFetched = createNumber("tup_fetched", Long.class);

    public final NumberPath<Long> tupInserted = createNumber("tup_inserted", Long.class);

    public final NumberPath<Long> tupReturned = createNumber("tup_returned", Long.class);

    public final NumberPath<Long> tupUpdated = createNumber("tup_updated", Long.class);

    public final NumberPath<Long> xactCommit = createNumber("xact_commit", Long.class);

    public final NumberPath<Long> xactRollback = createNumber("xact_rollback", Long.class);

    public QPgStatDatabase(String variable) {
        super(QPgStatDatabase.class, forVariable(variable), "pg_catalog", "pg_stat_database");
    }

    @SuppressWarnings("all")
    public QPgStatDatabase(Path<? extends QPgStatDatabase> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_stat_database");
    }

    public QPgStatDatabase(PathMetadata<?> metadata) {
        super(QPgStatDatabase.class, metadata, "pg_catalog", "pg_stat_database");
    }

}

