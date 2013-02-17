package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgCast is a Querydsl query type for QPgCast
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgCast extends com.mysema.query.sql.RelationalPathBase<QPgCast> {

    private static final long serialVersionUID = 692978970;

    public static final QPgCast pgCast = new QPgCast("pg_cast");

    public final StringPath castcontext = createString("castcontext");

    public final NumberPath<Long> castfunc = createNumber("castfunc", Long.class);

    public final StringPath castmethod = createString("castmethod");

    public final NumberPath<Long> castsource = createNumber("castsource", Long.class);

    public final NumberPath<Long> casttarget = createNumber("casttarget", Long.class);

    public QPgCast(String variable) {
        super(QPgCast.class, forVariable(variable), "pg_catalog", "pg_cast");
    }

    @SuppressWarnings("all")
    public QPgCast(Path<? extends QPgCast> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_cast");
    }

    public QPgCast(PathMetadata<?> metadata) {
        super(QPgCast.class, metadata, "pg_catalog", "pg_cast");
    }

}

