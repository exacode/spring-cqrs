package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgViews is a Querydsl query type for QPgViews
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgViews extends com.mysema.query.sql.RelationalPathBase<QPgViews> {

    private static final long serialVersionUID = 25283571;

    public static final QPgViews pgViews = new QPgViews("pg_views");

    public final StringPath definition = createString("definition");

    public final StringPath schemaname = createString("schemaname");

    public final StringPath viewname = createString("viewname");

    public final StringPath viewowner = createString("viewowner");

    public QPgViews(String variable) {
        super(QPgViews.class, forVariable(variable), "pg_catalog", "pg_views");
    }

    @SuppressWarnings("all")
    public QPgViews(Path<? extends QPgViews> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_views");
    }

    public QPgViews(PathMetadata<?> metadata) {
        super(QPgViews.class, metadata, "pg_catalog", "pg_views");
    }

}

