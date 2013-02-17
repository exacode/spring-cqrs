package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgConstraintOidIndex is a Querydsl query type for QPgConstraintOidIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgConstraintOidIndex extends com.mysema.query.sql.RelationalPathBase<QPgConstraintOidIndex> {

    private static final long serialVersionUID = -82996032;

    public static final QPgConstraintOidIndex pgConstraintOidIndex = new QPgConstraintOidIndex("pg_constraint_oid_index");

    public final NumberPath<Long> oid = createNumber("oid", Long.class);

    public QPgConstraintOidIndex(String variable) {
        super(QPgConstraintOidIndex.class, forVariable(variable), "pg_catalog", "pg_constraint_oid_index");
    }

    @SuppressWarnings("all")
    public QPgConstraintOidIndex(Path<? extends QPgConstraintOidIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_constraint_oid_index");
    }

    public QPgConstraintOidIndex(PathMetadata<?> metadata) {
        super(QPgConstraintOidIndex.class, metadata, "pg_catalog", "pg_constraint_oid_index");
    }

}

