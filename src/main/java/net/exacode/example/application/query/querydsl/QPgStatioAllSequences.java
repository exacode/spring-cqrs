package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgStatioAllSequences is a Querydsl query type for QPgStatioAllSequences
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgStatioAllSequences extends com.mysema.query.sql.RelationalPathBase<QPgStatioAllSequences> {

    private static final long serialVersionUID = -1291037082;

    public static final QPgStatioAllSequences pgStatioAllSequences = new QPgStatioAllSequences("pg_statio_all_sequences");

    public final NumberPath<Long> blksHit = createNumber("blks_hit", Long.class);

    public final NumberPath<Long> blksRead = createNumber("blks_read", Long.class);

    public final NumberPath<Long> relid = createNumber("relid", Long.class);

    public final StringPath relname = createString("relname");

    public final StringPath schemaname = createString("schemaname");

    public QPgStatioAllSequences(String variable) {
        super(QPgStatioAllSequences.class, forVariable(variable), "pg_catalog", "pg_statio_all_sequences");
    }

    @SuppressWarnings("all")
    public QPgStatioAllSequences(Path<? extends QPgStatioAllSequences> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_statio_all_sequences");
    }

    public QPgStatioAllSequences(PathMetadata<?> metadata) {
        super(QPgStatioAllSequences.class, metadata, "pg_catalog", "pg_statio_all_sequences");
    }

}

