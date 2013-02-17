package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgPreparedXacts is a Querydsl query type for QPgPreparedXacts
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgPreparedXacts extends com.mysema.query.sql.RelationalPathBase<QPgPreparedXacts> {

    private static final long serialVersionUID = 1436325089;

    public static final QPgPreparedXacts pgPreparedXacts = new QPgPreparedXacts("pg_prepared_xacts");

    public final StringPath database = createString("database");

    public final StringPath gid = createString("gid");

    public final StringPath owner = createString("owner");

    public final DateTimePath<java.sql.Timestamp> prepared = createDateTime("prepared", java.sql.Timestamp.class);

    public final SimplePath<Object> transaction = createSimple("transaction", Object.class);

    public QPgPreparedXacts(String variable) {
        super(QPgPreparedXacts.class, forVariable(variable), "pg_catalog", "pg_prepared_xacts");
    }

    @SuppressWarnings("all")
    public QPgPreparedXacts(Path<? extends QPgPreparedXacts> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_prepared_xacts");
    }

    public QPgPreparedXacts(PathMetadata<?> metadata) {
        super(QPgPreparedXacts.class, metadata, "pg_catalog", "pg_prepared_xacts");
    }

}

