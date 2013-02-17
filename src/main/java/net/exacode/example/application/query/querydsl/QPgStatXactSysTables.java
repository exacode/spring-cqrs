package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgStatXactSysTables is a Querydsl query type for QPgStatXactSysTables
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgStatXactSysTables extends com.mysema.query.sql.RelationalPathBase<QPgStatXactSysTables> {

    private static final long serialVersionUID = 1390786473;

    public static final QPgStatXactSysTables pgStatXactSysTables = new QPgStatXactSysTables("pg_stat_xact_sys_tables");

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

    public QPgStatXactSysTables(String variable) {
        super(QPgStatXactSysTables.class, forVariable(variable), "pg_catalog", "pg_stat_xact_sys_tables");
    }

    @SuppressWarnings("all")
    public QPgStatXactSysTables(Path<? extends QPgStatXactSysTables> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_stat_xact_sys_tables");
    }

    public QPgStatXactSysTables(PathMetadata<?> metadata) {
        super(QPgStatXactSysTables.class, metadata, "pg_catalog", "pg_stat_xact_sys_tables");
    }

}

