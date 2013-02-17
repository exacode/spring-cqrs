package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgAmopOidIndex is a Querydsl query type for QPgAmopOidIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgAmopOidIndex extends com.mysema.query.sql.RelationalPathBase<QPgAmopOidIndex> {

    private static final long serialVersionUID = -1722687952;

    public static final QPgAmopOidIndex pgAmopOidIndex = new QPgAmopOidIndex("pg_amop_oid_index");

    public final NumberPath<Long> oid = createNumber("oid", Long.class);

    public QPgAmopOidIndex(String variable) {
        super(QPgAmopOidIndex.class, forVariable(variable), "pg_catalog", "pg_amop_oid_index");
    }

    @SuppressWarnings("all")
    public QPgAmopOidIndex(Path<? extends QPgAmopOidIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_amop_oid_index");
    }

    public QPgAmopOidIndex(PathMetadata<?> metadata) {
        super(QPgAmopOidIndex.class, metadata, "pg_catalog", "pg_amop_oid_index");
    }

}

