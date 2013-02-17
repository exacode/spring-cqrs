package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgTables is a Querydsl query type for QPgTables
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgTables extends com.mysema.query.sql.RelationalPathBase<QPgTables> {

    private static final long serialVersionUID = 719043968;

    public static final QPgTables pgTables = new QPgTables("pg_tables");

    public final BooleanPath hasindexes = createBoolean("hasindexes");

    public final BooleanPath hasrules = createBoolean("hasrules");

    public final BooleanPath hastriggers = createBoolean("hastriggers");

    public final StringPath schemaname = createString("schemaname");

    public final StringPath tablename = createString("tablename");

    public final StringPath tableowner = createString("tableowner");

    public final StringPath tablespace = createString("tablespace");

    public QPgTables(String variable) {
        super(QPgTables.class, forVariable(variable), "pg_catalog", "pg_tables");
    }

    @SuppressWarnings("all")
    public QPgTables(Path<? extends QPgTables> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_tables");
    }

    public QPgTables(PathMetadata<?> metadata) {
        super(QPgTables.class, metadata, "pg_catalog", "pg_tables");
    }

}

