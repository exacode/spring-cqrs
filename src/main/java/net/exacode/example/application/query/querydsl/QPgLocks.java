package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgLocks is a Querydsl query type for QPgLocks
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgLocks extends com.mysema.query.sql.RelationalPathBase<QPgLocks> {

    private static final long serialVersionUID = 16224813;

    public static final QPgLocks pgLocks = new QPgLocks("pg_locks");

    public final NumberPath<Long> classid = createNumber("classid", Long.class);

    public final NumberPath<Long> database = createNumber("database", Long.class);

    public final BooleanPath granted = createBoolean("granted");

    public final StringPath locktype = createString("locktype");

    public final StringPath mode = createString("mode");

    public final NumberPath<Long> objid = createNumber("objid", Long.class);

    public final NumberPath<Short> objsubid = createNumber("objsubid", Short.class);

    public final NumberPath<Integer> page = createNumber("page", Integer.class);

    public final NumberPath<Integer> pid = createNumber("pid", Integer.class);

    public final NumberPath<Long> relation = createNumber("relation", Long.class);

    public final SimplePath<Object> transactionid = createSimple("transactionid", Object.class);

    public final NumberPath<Short> tuple = createNumber("tuple", Short.class);

    public final StringPath virtualtransaction = createString("virtualtransaction");

    public final StringPath virtualxid = createString("virtualxid");

    public QPgLocks(String variable) {
        super(QPgLocks.class, forVariable(variable), "pg_catalog", "pg_locks");
    }

    @SuppressWarnings("all")
    public QPgLocks(Path<? extends QPgLocks> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_locks");
    }

    public QPgLocks(PathMetadata<?> metadata) {
        super(QPgLocks.class, metadata, "pg_catalog", "pg_locks");
    }

}

