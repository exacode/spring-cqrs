package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgLargeobjectMetadata is a Querydsl query type for QPgLargeobjectMetadata
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgLargeobjectMetadata extends com.mysema.query.sql.RelationalPathBase<QPgLargeobjectMetadata> {

    private static final long serialVersionUID = -1205800882;

    public static final QPgLargeobjectMetadata pgLargeobjectMetadata = new QPgLargeobjectMetadata("pg_largeobject_metadata");

    public final SimplePath<Object[]> lomacl = createSimple("lomacl", Object[].class);

    public final NumberPath<Long> lomowner = createNumber("lomowner", Long.class);

    public QPgLargeobjectMetadata(String variable) {
        super(QPgLargeobjectMetadata.class, forVariable(variable), "pg_catalog", "pg_largeobject_metadata");
    }

    @SuppressWarnings("all")
    public QPgLargeobjectMetadata(Path<? extends QPgLargeobjectMetadata> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_largeobject_metadata");
    }

    public QPgLargeobjectMetadata(PathMetadata<?> metadata) {
        super(QPgLargeobjectMetadata.class, metadata, "pg_catalog", "pg_largeobject_metadata");
    }

}

