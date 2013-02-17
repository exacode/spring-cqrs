package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgShdependReferenceIndex is a Querydsl query type for QPgShdependReferenceIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgShdependReferenceIndex extends com.mysema.query.sql.RelationalPathBase<QPgShdependReferenceIndex> {

    private static final long serialVersionUID = 891338947;

    public static final QPgShdependReferenceIndex pgShdependReferenceIndex = new QPgShdependReferenceIndex("pg_shdepend_reference_index");

    public final NumberPath<Long> refclassid = createNumber("refclassid", Long.class);

    public final NumberPath<Long> refobjid = createNumber("refobjid", Long.class);

    public QPgShdependReferenceIndex(String variable) {
        super(QPgShdependReferenceIndex.class, forVariable(variable), "pg_catalog", "pg_shdepend_reference_index");
    }

    @SuppressWarnings("all")
    public QPgShdependReferenceIndex(Path<? extends QPgShdependReferenceIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_shdepend_reference_index");
    }

    public QPgShdependReferenceIndex(PathMetadata<?> metadata) {
        super(QPgShdependReferenceIndex.class, metadata, "pg_catalog", "pg_shdepend_reference_index");
    }

}

