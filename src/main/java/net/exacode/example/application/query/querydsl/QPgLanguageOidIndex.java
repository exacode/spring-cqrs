package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgLanguageOidIndex is a Querydsl query type for QPgLanguageOidIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgLanguageOidIndex extends com.mysema.query.sql.RelationalPathBase<QPgLanguageOidIndex> {

    private static final long serialVersionUID = -66170373;

    public static final QPgLanguageOidIndex pgLanguageOidIndex = new QPgLanguageOidIndex("pg_language_oid_index");

    public final NumberPath<Long> oid = createNumber("oid", Long.class);

    public QPgLanguageOidIndex(String variable) {
        super(QPgLanguageOidIndex.class, forVariable(variable), "pg_catalog", "pg_language_oid_index");
    }

    @SuppressWarnings("all")
    public QPgLanguageOidIndex(Path<? extends QPgLanguageOidIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_language_oid_index");
    }

    public QPgLanguageOidIndex(PathMetadata<?> metadata) {
        super(QPgLanguageOidIndex.class, metadata, "pg_catalog", "pg_language_oid_index");
    }

}

