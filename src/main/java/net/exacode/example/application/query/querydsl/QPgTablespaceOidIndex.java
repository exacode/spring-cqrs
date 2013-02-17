package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgTablespaceOidIndex is a Querydsl query type for QPgTablespaceOidIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgTablespaceOidIndex extends com.mysema.query.sql.RelationalPathBase<QPgTablespaceOidIndex> {

    private static final long serialVersionUID = -415622693;

    public static final QPgTablespaceOidIndex pgTablespaceOidIndex = new QPgTablespaceOidIndex("pg_tablespace_oid_index");

    public final NumberPath<Long> oid = createNumber("oid", Long.class);

    public QPgTablespaceOidIndex(String variable) {
        super(QPgTablespaceOidIndex.class, forVariable(variable), "pg_catalog", "pg_tablespace_oid_index");
    }

    @SuppressWarnings("all")
    public QPgTablespaceOidIndex(Path<? extends QPgTablespaceOidIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_tablespace_oid_index");
    }

    public QPgTablespaceOidIndex(PathMetadata<?> metadata) {
        super(QPgTablespaceOidIndex.class, metadata, "pg_catalog", "pg_tablespace_oid_index");
    }

}

