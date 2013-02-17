package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgIndexes is a Querydsl query type for QPgIndexes
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgIndexes extends com.mysema.query.sql.RelationalPathBase<QPgIndexes> {

    private static final long serialVersionUID = 16756037;

    public static final QPgIndexes pgIndexes = new QPgIndexes("pg_indexes");

    public final StringPath indexdef = createString("indexdef");

    public final StringPath indexname = createString("indexname");

    public final StringPath schemaname = createString("schemaname");

    public final StringPath tablename = createString("tablename");

    public final StringPath tablespace = createString("tablespace");

    public QPgIndexes(String variable) {
        super(QPgIndexes.class, forVariable(variable), "pg_catalog", "pg_indexes");
    }

    @SuppressWarnings("all")
    public QPgIndexes(Path<? extends QPgIndexes> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_indexes");
    }

    public QPgIndexes(PathMetadata<?> metadata) {
        super(QPgIndexes.class, metadata, "pg_catalog", "pg_indexes");
    }

}

