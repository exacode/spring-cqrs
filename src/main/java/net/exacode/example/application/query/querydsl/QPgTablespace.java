package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgTablespace is a Querydsl query type for QPgTablespace
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgTablespace extends com.mysema.query.sql.RelationalPathBase<QPgTablespace> {

    private static final long serialVersionUID = -1275764845;

    public static final QPgTablespace pgTablespace = new QPgTablespace("pg_tablespace");

    public final SimplePath<Object[]> spcacl = createSimple("spcacl", Object[].class);

    public final StringPath spclocation = createString("spclocation");

    public final StringPath spcname = createString("spcname");

    public final SimplePath<Object[]> spcoptions = createSimple("spcoptions", Object[].class);

    public final NumberPath<Long> spcowner = createNumber("spcowner", Long.class);

    public QPgTablespace(String variable) {
        super(QPgTablespace.class, forVariable(variable), "pg_catalog", "pg_tablespace");
    }

    @SuppressWarnings("all")
    public QPgTablespace(Path<? extends QPgTablespace> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_tablespace");
    }

    public QPgTablespace(PathMetadata<?> metadata) {
        super(QPgTablespace.class, metadata, "pg_catalog", "pg_tablespace");
    }

}

