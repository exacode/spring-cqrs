package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgAmOidIndex is a Querydsl query type for QPgAmOidIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgAmOidIndex extends com.mysema.query.sql.RelationalPathBase<QPgAmOidIndex> {

    private static final long serialVersionUID = 759731983;

    public static final QPgAmOidIndex pgAmOidIndex = new QPgAmOidIndex("pg_am_oid_index");

    public final NumberPath<Long> oid = createNumber("oid", Long.class);

    public QPgAmOidIndex(String variable) {
        super(QPgAmOidIndex.class, forVariable(variable), "pg_catalog", "pg_am_oid_index");
    }

    @SuppressWarnings("all")
    public QPgAmOidIndex(Path<? extends QPgAmOidIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_am_oid_index");
    }

    public QPgAmOidIndex(PathMetadata<?> metadata) {
        super(QPgAmOidIndex.class, metadata, "pg_catalog", "pg_am_oid_index");
    }

}

