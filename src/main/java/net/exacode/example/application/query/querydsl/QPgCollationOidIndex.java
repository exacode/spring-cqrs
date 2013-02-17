package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgCollationOidIndex is a Querydsl query type for QPgCollationOidIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgCollationOidIndex extends com.mysema.query.sql.RelationalPathBase<QPgCollationOidIndex> {

    private static final long serialVersionUID = -68291114;

    public static final QPgCollationOidIndex pgCollationOidIndex = new QPgCollationOidIndex("pg_collation_oid_index");

    public final NumberPath<Long> oid = createNumber("oid", Long.class);

    public QPgCollationOidIndex(String variable) {
        super(QPgCollationOidIndex.class, forVariable(variable), "pg_catalog", "pg_collation_oid_index");
    }

    @SuppressWarnings("all")
    public QPgCollationOidIndex(Path<? extends QPgCollationOidIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_collation_oid_index");
    }

    public QPgCollationOidIndex(PathMetadata<?> metadata) {
        super(QPgCollationOidIndex.class, metadata, "pg_catalog", "pg_collation_oid_index");
    }

}

