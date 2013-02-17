package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgStatXactAllTables is a Querydsl query type for QPgStatXactAllTables
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgStatXactAllTables extends com.mysema.query.sql.RelationalPathBase<QPgStatXactAllTables> {

    private static final long serialVersionUID = 760939389;

    public static final QPgStatXactAllTables pgStatXactAllTables = new QPgStatXactAllTables("pg_stat_xact_all_tables");

    public final NumberPath<Long> idxScan = createNumber("idx_scan", Long.class);

    public final NumberPath<Long> idxTupFetch = createNumber("idx_tup_fetch", Long.class);

    public final NumberPath<Long> nTupDel = createNumber("n_tup_del", Long.class);

    public final NumberPath<Long> nTupHotUpd = createNumber("n_tup_hot_upd", Long.class);

    public final NumberPath<Long> nTupIns = createNumber("n_tup_ins", Long.class);

    public final NumberPath<Long> nTupUpd = createNumber("n_tup_upd", Long.class);

    public final NumberPath<Long> relid = createNumber("relid", Long.class);

    public final StringPath relname = createString("relname");

    public final StringPath schemaname = createString("schemaname");

    public final NumberPath<Long> seqScan = createNumber("seq_scan", Long.class);

    public final NumberPath<Long> seqTupRead = createNumber("seq_tup_read", Long.class);

    public QPgStatXactAllTables(String variable) {
        super(QPgStatXactAllTables.class, forVariable(variable), "pg_catalog", "pg_stat_xact_all_tables");
    }

    @SuppressWarnings("all")
    public QPgStatXactAllTables(Path<? extends QPgStatXactAllTables> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_stat_xact_all_tables");
    }

    public QPgStatXactAllTables(PathMetadata<?> metadata) {
        super(QPgStatXactAllTables.class, metadata, "pg_catalog", "pg_stat_xact_all_tables");
    }

}

