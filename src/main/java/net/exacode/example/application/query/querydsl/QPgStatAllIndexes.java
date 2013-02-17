package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgStatAllIndexes is a Querydsl query type for QPgStatAllIndexes
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgStatAllIndexes extends com.mysema.query.sql.RelationalPathBase<QPgStatAllIndexes> {

    private static final long serialVersionUID = 2066660782;

    public static final QPgStatAllIndexes pgStatAllIndexes = new QPgStatAllIndexes("pg_stat_all_indexes");

    public final NumberPath<Long> idxScan = createNumber("idx_scan", Long.class);

    public final NumberPath<Long> idxTupFetch = createNumber("idx_tup_fetch", Long.class);

    public final NumberPath<Long> idxTupRead = createNumber("idx_tup_read", Long.class);

    public final NumberPath<Long> indexrelid = createNumber("indexrelid", Long.class);

    public final StringPath indexrelname = createString("indexrelname");

    public final NumberPath<Long> relid = createNumber("relid", Long.class);

    public final StringPath relname = createString("relname");

    public final StringPath schemaname = createString("schemaname");

    public QPgStatAllIndexes(String variable) {
        super(QPgStatAllIndexes.class, forVariable(variable), "pg_catalog", "pg_stat_all_indexes");
    }

    @SuppressWarnings("all")
    public QPgStatAllIndexes(Path<? extends QPgStatAllIndexes> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_stat_all_indexes");
    }

    public QPgStatAllIndexes(PathMetadata<?> metadata) {
        super(QPgStatAllIndexes.class, metadata, "pg_catalog", "pg_stat_all_indexes");
    }

}

