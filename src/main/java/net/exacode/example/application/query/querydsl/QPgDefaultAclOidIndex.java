package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgDefaultAclOidIndex is a Querydsl query type for QPgDefaultAclOidIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgDefaultAclOidIndex extends com.mysema.query.sql.RelationalPathBase<QPgDefaultAclOidIndex> {

    private static final long serialVersionUID = -1292629652;

    public static final QPgDefaultAclOidIndex pgDefaultAclOidIndex = new QPgDefaultAclOidIndex("pg_default_acl_oid_index");

    public final NumberPath<Long> oid = createNumber("oid", Long.class);

    public QPgDefaultAclOidIndex(String variable) {
        super(QPgDefaultAclOidIndex.class, forVariable(variable), "pg_catalog", "pg_default_acl_oid_index");
    }

    @SuppressWarnings("all")
    public QPgDefaultAclOidIndex(Path<? extends QPgDefaultAclOidIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_default_acl_oid_index");
    }

    public QPgDefaultAclOidIndex(PathMetadata<?> metadata) {
        super(QPgDefaultAclOidIndex.class, metadata, "pg_catalog", "pg_default_acl_oid_index");
    }

}

