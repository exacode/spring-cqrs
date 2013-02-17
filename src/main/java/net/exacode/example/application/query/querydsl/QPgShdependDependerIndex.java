package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgShdependDependerIndex is a Querydsl query type for QPgShdependDependerIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgShdependDependerIndex extends com.mysema.query.sql.RelationalPathBase<QPgShdependDependerIndex> {

    private static final long serialVersionUID = 835254333;

    public static final QPgShdependDependerIndex pgShdependDependerIndex = new QPgShdependDependerIndex("pg_shdepend_depender_index");

    public final NumberPath<Long> classid = createNumber("classid", Long.class);

    public final NumberPath<Long> dbid = createNumber("dbid", Long.class);

    public final NumberPath<Long> objid = createNumber("objid", Long.class);

    public final NumberPath<Integer> objsubid = createNumber("objsubid", Integer.class);

    public QPgShdependDependerIndex(String variable) {
        super(QPgShdependDependerIndex.class, forVariable(variable), "pg_catalog", "pg_shdepend_depender_index");
    }

    @SuppressWarnings("all")
    public QPgShdependDependerIndex(Path<? extends QPgShdependDependerIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_shdepend_depender_index");
    }

    public QPgShdependDependerIndex(PathMetadata<?> metadata) {
        super(QPgShdependDependerIndex.class, metadata, "pg_catalog", "pg_shdepend_depender_index");
    }

}

