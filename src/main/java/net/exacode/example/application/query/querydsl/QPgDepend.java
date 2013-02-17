package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgDepend is a Querydsl query type for QPgDepend
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgDepend extends com.mysema.query.sql.RelationalPathBase<QPgDepend> {

    private static final long serialVersionUID = 265082247;

    public static final QPgDepend pgDepend = new QPgDepend("pg_depend");

    public final NumberPath<Long> classid = createNumber("classid", Long.class);

    public final StringPath deptype = createString("deptype");

    public final NumberPath<Long> objid = createNumber("objid", Long.class);

    public final NumberPath<Integer> objsubid = createNumber("objsubid", Integer.class);

    public final NumberPath<Long> refclassid = createNumber("refclassid", Long.class);

    public final NumberPath<Long> refobjid = createNumber("refobjid", Long.class);

    public final NumberPath<Integer> refobjsubid = createNumber("refobjsubid", Integer.class);

    public QPgDepend(String variable) {
        super(QPgDepend.class, forVariable(variable), "pg_catalog", "pg_depend");
    }

    @SuppressWarnings("all")
    public QPgDepend(Path<? extends QPgDepend> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_depend");
    }

    public QPgDepend(PathMetadata<?> metadata) {
        super(QPgDepend.class, metadata, "pg_catalog", "pg_depend");
    }

}

