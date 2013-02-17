package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgStatioUserSequences is a Querydsl query type for QPgStatioUserSequences
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgStatioUserSequences extends com.mysema.query.sql.RelationalPathBase<QPgStatioUserSequences> {

    private static final long serialVersionUID = 85403058;

    public static final QPgStatioUserSequences pgStatioUserSequences = new QPgStatioUserSequences("pg_statio_user_sequences");

    public final NumberPath<Long> blksHit = createNumber("blks_hit", Long.class);

    public final NumberPath<Long> blksRead = createNumber("blks_read", Long.class);

    public final NumberPath<Long> relid = createNumber("relid", Long.class);

    public final StringPath relname = createString("relname");

    public final StringPath schemaname = createString("schemaname");

    public QPgStatioUserSequences(String variable) {
        super(QPgStatioUserSequences.class, forVariable(variable), "pg_catalog", "pg_statio_user_sequences");
    }

    @SuppressWarnings("all")
    public QPgStatioUserSequences(Path<? extends QPgStatioUserSequences> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_statio_user_sequences");
    }

    public QPgStatioUserSequences(PathMetadata<?> metadata) {
        super(QPgStatioUserSequences.class, metadata, "pg_catalog", "pg_statio_user_sequences");
    }

}

