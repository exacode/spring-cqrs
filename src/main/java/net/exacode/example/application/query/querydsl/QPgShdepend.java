package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgShdepend is a Querydsl query type for QPgShdepend
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgShdepend extends com.mysema.query.sql.RelationalPathBase<QPgShdepend> {

    private static final long serialVersionUID = -262621860;

    public static final QPgShdepend pgShdepend = new QPgShdepend("pg_shdepend");

    public final NumberPath<Long> classid = createNumber("classid", Long.class);

    public final NumberPath<Long> dbid = createNumber("dbid", Long.class);

    public final StringPath deptype = createString("deptype");

    public final NumberPath<Long> objid = createNumber("objid", Long.class);

    public final NumberPath<Integer> objsubid = createNumber("objsubid", Integer.class);

    public final NumberPath<Long> refclassid = createNumber("refclassid", Long.class);

    public final NumberPath<Long> refobjid = createNumber("refobjid", Long.class);

    public QPgShdepend(String variable) {
        super(QPgShdepend.class, forVariable(variable), "pg_catalog", "pg_shdepend");
    }

    @SuppressWarnings("all")
    public QPgShdepend(Path<? extends QPgShdepend> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_shdepend");
    }

    public QPgShdepend(PathMetadata<?> metadata) {
        super(QPgShdepend.class, metadata, "pg_catalog", "pg_shdepend");
    }

}

