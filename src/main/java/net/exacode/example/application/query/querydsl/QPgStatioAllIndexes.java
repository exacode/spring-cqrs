package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgStatioAllIndexes is a Querydsl query type for QPgStatioAllIndexes
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgStatioAllIndexes extends com.mysema.query.sql.RelationalPathBase<QPgStatioAllIndexes> {

    private static final long serialVersionUID = 1143108500;

    public static final QPgStatioAllIndexes pgStatioAllIndexes = new QPgStatioAllIndexes("pg_statio_all_indexes");

    public final NumberPath<Long> idxBlksHit = createNumber("idx_blks_hit", Long.class);

    public final NumberPath<Long> idxBlksRead = createNumber("idx_blks_read", Long.class);

    public final NumberPath<Long> indexrelid = createNumber("indexrelid", Long.class);

    public final StringPath indexrelname = createString("indexrelname");

    public final NumberPath<Long> relid = createNumber("relid", Long.class);

    public final StringPath relname = createString("relname");

    public final StringPath schemaname = createString("schemaname");

    public QPgStatioAllIndexes(String variable) {
        super(QPgStatioAllIndexes.class, forVariable(variable), "pg_catalog", "pg_statio_all_indexes");
    }

    @SuppressWarnings("all")
    public QPgStatioAllIndexes(Path<? extends QPgStatioAllIndexes> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_statio_all_indexes");
    }

    public QPgStatioAllIndexes(PathMetadata<?> metadata) {
        super(QPgStatioAllIndexes.class, metadata, "pg_catalog", "pg_statio_all_indexes");
    }

}

