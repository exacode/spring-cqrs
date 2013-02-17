package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgStatUserTables is a Querydsl query type for QPgStatUserTables
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgStatUserTables extends com.mysema.query.sql.RelationalPathBase<QPgStatUserTables> {

    private static final long serialVersionUID = 335024031;

    public static final QPgStatUserTables pgStatUserTables = new QPgStatUserTables("pg_stat_user_tables");

    public final NumberPath<Long> analyzeCount = createNumber("analyze_count", Long.class);

    public final NumberPath<Long> autoanalyzeCount = createNumber("autoanalyze_count", Long.class);

    public final NumberPath<Long> autovacuumCount = createNumber("autovacuum_count", Long.class);

    public final NumberPath<Long> idxScan = createNumber("idx_scan", Long.class);

    public final NumberPath<Long> idxTupFetch = createNumber("idx_tup_fetch", Long.class);

    public final DateTimePath<java.sql.Timestamp> lastAnalyze = createDateTime("last_analyze", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> lastAutoanalyze = createDateTime("last_autoanalyze", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> lastAutovacuum = createDateTime("last_autovacuum", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> lastVacuum = createDateTime("last_vacuum", java.sql.Timestamp.class);

    public final NumberPath<Long> nDeadTup = createNumber("n_dead_tup", Long.class);

    public final NumberPath<Long> nLiveTup = createNumber("n_live_tup", Long.class);

    public final NumberPath<Long> nTupDel = createNumber("n_tup_del", Long.class);

    public final NumberPath<Long> nTupHotUpd = createNumber("n_tup_hot_upd", Long.class);

    public final NumberPath<Long> nTupIns = createNumber("n_tup_ins", Long.class);

    public final NumberPath<Long> nTupUpd = createNumber("n_tup_upd", Long.class);

    public final NumberPath<Long> relid = createNumber("relid", Long.class);

    public final StringPath relname = createString("relname");

    public final StringPath schemaname = createString("schemaname");

    public final NumberPath<Long> seqScan = createNumber("seq_scan", Long.class);

    public final NumberPath<Long> seqTupRead = createNumber("seq_tup_read", Long.class);

    public final NumberPath<Long> vacuumCount = createNumber("vacuum_count", Long.class);

    public QPgStatUserTables(String variable) {
        super(QPgStatUserTables.class, forVariable(variable), "pg_catalog", "pg_stat_user_tables");
    }

    @SuppressWarnings("all")
    public QPgStatUserTables(Path<? extends QPgStatUserTables> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_stat_user_tables");
    }

    public QPgStatUserTables(PathMetadata<?> metadata) {
        super(QPgStatUserTables.class, metadata, "pg_catalog", "pg_stat_user_tables");
    }

}

