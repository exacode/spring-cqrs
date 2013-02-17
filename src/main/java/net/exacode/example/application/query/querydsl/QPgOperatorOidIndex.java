package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgOperatorOidIndex is a Querydsl query type for QPgOperatorOidIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgOperatorOidIndex extends com.mysema.query.sql.RelationalPathBase<QPgOperatorOidIndex> {

    private static final long serialVersionUID = -799941817;

    public static final QPgOperatorOidIndex pgOperatorOidIndex = new QPgOperatorOidIndex("pg_operator_oid_index");

    public final NumberPath<Long> oid = createNumber("oid", Long.class);

    public QPgOperatorOidIndex(String variable) {
        super(QPgOperatorOidIndex.class, forVariable(variable), "pg_catalog", "pg_operator_oid_index");
    }

    @SuppressWarnings("all")
    public QPgOperatorOidIndex(Path<? extends QPgOperatorOidIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_operator_oid_index");
    }

    public QPgOperatorOidIndex(PathMetadata<?> metadata) {
        super(QPgOperatorOidIndex.class, metadata, "pg_catalog", "pg_operator_oid_index");
    }

}

