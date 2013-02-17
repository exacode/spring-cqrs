package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgRewriteOidIndex is a Querydsl query type for QPgRewriteOidIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgRewriteOidIndex extends com.mysema.query.sql.RelationalPathBase<QPgRewriteOidIndex> {

    private static final long serialVersionUID = 34550297;

    public static final QPgRewriteOidIndex pgRewriteOidIndex = new QPgRewriteOidIndex("pg_rewrite_oid_index");

    public final NumberPath<Long> oid = createNumber("oid", Long.class);

    public QPgRewriteOidIndex(String variable) {
        super(QPgRewriteOidIndex.class, forVariable(variable), "pg_catalog", "pg_rewrite_oid_index");
    }

    @SuppressWarnings("all")
    public QPgRewriteOidIndex(Path<? extends QPgRewriteOidIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_rewrite_oid_index");
    }

    public QPgRewriteOidIndex(PathMetadata<?> metadata) {
        super(QPgRewriteOidIndex.class, metadata, "pg_catalog", "pg_rewrite_oid_index");
    }

}

