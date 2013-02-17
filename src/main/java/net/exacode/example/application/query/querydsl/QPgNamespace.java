package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgNamespace is a Querydsl query type for QPgNamespace
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgNamespace extends com.mysema.query.sql.RelationalPathBase<QPgNamespace> {

    private static final long serialVersionUID = 981908576;

    public static final QPgNamespace pgNamespace = new QPgNamespace("pg_namespace");

    public final SimplePath<Object[]> nspacl = createSimple("nspacl", Object[].class);

    public final StringPath nspname = createString("nspname");

    public final NumberPath<Long> nspowner = createNumber("nspowner", Long.class);

    public QPgNamespace(String variable) {
        super(QPgNamespace.class, forVariable(variable), "pg_catalog", "pg_namespace");
    }

    @SuppressWarnings("all")
    public QPgNamespace(Path<? extends QPgNamespace> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_namespace");
    }

    public QPgNamespace(PathMetadata<?> metadata) {
        super(QPgNamespace.class, metadata, "pg_catalog", "pg_namespace");
    }

}

