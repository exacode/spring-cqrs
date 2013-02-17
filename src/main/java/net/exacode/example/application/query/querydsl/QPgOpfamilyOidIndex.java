package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgOpfamilyOidIndex is a Querydsl query type for QPgOpfamilyOidIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgOpfamilyOidIndex extends com.mysema.query.sql.RelationalPathBase<QPgOpfamilyOidIndex> {

    private static final long serialVersionUID = 50265640;

    public static final QPgOpfamilyOidIndex pgOpfamilyOidIndex = new QPgOpfamilyOidIndex("pg_opfamily_oid_index");

    public final NumberPath<Long> oid = createNumber("oid", Long.class);

    public QPgOpfamilyOidIndex(String variable) {
        super(QPgOpfamilyOidIndex.class, forVariable(variable), "pg_catalog", "pg_opfamily_oid_index");
    }

    @SuppressWarnings("all")
    public QPgOpfamilyOidIndex(Path<? extends QPgOpfamilyOidIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_opfamily_oid_index");
    }

    public QPgOpfamilyOidIndex(PathMetadata<?> metadata) {
        super(QPgOpfamilyOidIndex.class, metadata, "pg_catalog", "pg_opfamily_oid_index");
    }

}

