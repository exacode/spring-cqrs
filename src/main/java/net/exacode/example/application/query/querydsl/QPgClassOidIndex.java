package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgClassOidIndex is a Querydsl query type for QPgClassOidIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgClassOidIndex extends com.mysema.query.sql.RelationalPathBase<QPgClassOidIndex> {

    private static final long serialVersionUID = -1612248251;

    public static final QPgClassOidIndex pgClassOidIndex = new QPgClassOidIndex("pg_class_oid_index");

    public final NumberPath<Long> oid = createNumber("oid", Long.class);

    public QPgClassOidIndex(String variable) {
        super(QPgClassOidIndex.class, forVariable(variable), "pg_catalog", "pg_class_oid_index");
    }

    @SuppressWarnings("all")
    public QPgClassOidIndex(Path<? extends QPgClassOidIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_class_oid_index");
    }

    public QPgClassOidIndex(PathMetadata<?> metadata) {
        super(QPgClassOidIndex.class, metadata, "pg_catalog", "pg_class_oid_index");
    }

}

