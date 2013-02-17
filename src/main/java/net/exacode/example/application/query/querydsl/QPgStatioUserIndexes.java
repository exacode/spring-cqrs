package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgStatioUserIndexes is a Querydsl query type for QPgStatioUserIndexes
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgStatioUserIndexes extends com.mysema.query.sql.RelationalPathBase<QPgStatioUserIndexes> {

    private static final long serialVersionUID = -1863277088;

    public static final QPgStatioUserIndexes pgStatioUserIndexes = new QPgStatioUserIndexes("pg_statio_user_indexes");

    public final NumberPath<Long> idxBlksHit = createNumber("idx_blks_hit", Long.class);

    public final NumberPath<Long> idxBlksRead = createNumber("idx_blks_read", Long.class);

    public final NumberPath<Long> indexrelid = createNumber("indexrelid", Long.class);

    public final StringPath indexrelname = createString("indexrelname");

    public final NumberPath<Long> relid = createNumber("relid", Long.class);

    public final StringPath relname = createString("relname");

    public final StringPath schemaname = createString("schemaname");

    public QPgStatioUserIndexes(String variable) {
        super(QPgStatioUserIndexes.class, forVariable(variable), "pg_catalog", "pg_statio_user_indexes");
    }

    @SuppressWarnings("all")
    public QPgStatioUserIndexes(Path<? extends QPgStatioUserIndexes> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_statio_user_indexes");
    }

    public QPgStatioUserIndexes(PathMetadata<?> metadata) {
        super(QPgStatioUserIndexes.class, metadata, "pg_catalog", "pg_statio_user_indexes");
    }

}

