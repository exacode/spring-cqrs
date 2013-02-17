package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgCursors is a Querydsl query type for QPgCursors
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgCursors extends com.mysema.query.sql.RelationalPathBase<QPgCursors> {

    private static final long serialVersionUID = -799556574;

    public static final QPgCursors pgCursors = new QPgCursors("pg_cursors");

    public final DateTimePath<java.sql.Timestamp> creationTime = createDateTime("creation_time", java.sql.Timestamp.class);

    public final BooleanPath isBinary = createBoolean("is_binary");

    public final BooleanPath isHoldable = createBoolean("is_holdable");

    public final BooleanPath isScrollable = createBoolean("is_scrollable");

    public final StringPath name = createString("name");

    public final StringPath statement = createString("statement");

    public QPgCursors(String variable) {
        super(QPgCursors.class, forVariable(variable), "pg_catalog", "pg_cursors");
    }

    @SuppressWarnings("all")
    public QPgCursors(Path<? extends QPgCursors> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_cursors");
    }

    public QPgCursors(PathMetadata<?> metadata) {
        super(QPgCursors.class, metadata, "pg_catalog", "pg_cursors");
    }

}

