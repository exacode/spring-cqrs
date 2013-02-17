package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgStatUserIndexes is a Querydsl query type for QPgStatUserIndexes
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgStatUserIndexes extends com.mysema.query.sql.RelationalPathBase<QPgStatUserIndexes> {

    private static final long serialVersionUID = 997039878;

    public static final QPgStatUserIndexes pgStatUserIndexes = new QPgStatUserIndexes("pg_stat_user_indexes");

    public final NumberPath<Long> idxScan = createNumber("idx_scan", Long.class);

    public final NumberPath<Long> idxTupFetch = createNumber("idx_tup_fetch", Long.class);

    public final NumberPath<Long> idxTupRead = createNumber("idx_tup_read", Long.class);

    public final NumberPath<Long> indexrelid = createNumber("indexrelid", Long.class);

    public final StringPath indexrelname = createString("indexrelname");

    public final NumberPath<Long> relid = createNumber("relid", Long.class);

    public final StringPath relname = createString("relname");

    public final StringPath schemaname = createString("schemaname");

    public QPgStatUserIndexes(String variable) {
        super(QPgStatUserIndexes.class, forVariable(variable), "pg_catalog", "pg_stat_user_indexes");
    }

    @SuppressWarnings("all")
    public QPgStatUserIndexes(Path<? extends QPgStatUserIndexes> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_stat_user_indexes");
    }

    public QPgStatUserIndexes(PathMetadata<?> metadata) {
        super(QPgStatUserIndexes.class, metadata, "pg_catalog", "pg_stat_user_indexes");
    }

}

