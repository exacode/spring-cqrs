package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgCastSourceTargetIndex is a Querydsl query type for QPgCastSourceTargetIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgCastSourceTargetIndex extends com.mysema.query.sql.RelationalPathBase<QPgCastSourceTargetIndex> {

    private static final long serialVersionUID = 1941806252;

    public static final QPgCastSourceTargetIndex pgCastSourceTargetIndex = new QPgCastSourceTargetIndex("pg_cast_source_target_index");

    public final NumberPath<Long> castsource = createNumber("castsource", Long.class);

    public final NumberPath<Long> casttarget = createNumber("casttarget", Long.class);

    public QPgCastSourceTargetIndex(String variable) {
        super(QPgCastSourceTargetIndex.class, forVariable(variable), "pg_catalog", "pg_cast_source_target_index");
    }

    @SuppressWarnings("all")
    public QPgCastSourceTargetIndex(Path<? extends QPgCastSourceTargetIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_cast_source_target_index");
    }

    public QPgCastSourceTargetIndex(PathMetadata<?> metadata) {
        super(QPgCastSourceTargetIndex.class, metadata, "pg_catalog", "pg_cast_source_target_index");
    }

}

