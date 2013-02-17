package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * Q_pgForeignTables is a Querydsl query type for Q_pgForeignTables
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class Q_pgForeignTables extends com.mysema.query.sql.RelationalPathBase<Q_pgForeignTables> {

    private static final long serialVersionUID = -167432313;

    public static final Q_pgForeignTables PgForeignTables = new Q_pgForeignTables("_pg_foreign_tables");

    public final SimplePath<Object> authorizationIdentifier = createSimple("authorization_identifier", Object.class);

    public final SimplePath<Object> foreignServerCatalog = createSimple("foreign_server_catalog", Object.class);

    public final SimplePath<Object> foreignServerName = createSimple("foreign_server_name", Object.class);

    public final SimplePath<Object> foreignTableCatalog = createSimple("foreign_table_catalog", Object.class);

    public final StringPath foreignTableName = createString("foreign_table_name");

    public final StringPath foreignTableSchema = createString("foreign_table_schema");

    public final SimplePath<Object[]> ftoptions = createSimple("ftoptions", Object[].class);

    public Q_pgForeignTables(String variable) {
        super(Q_pgForeignTables.class, forVariable(variable), "information_schema", "_pg_foreign_tables");
    }

    @SuppressWarnings("all")
    public Q_pgForeignTables(Path<? extends Q_pgForeignTables> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "_pg_foreign_tables");
    }

    public Q_pgForeignTables(PathMetadata<?> metadata) {
        super(Q_pgForeignTables.class, metadata, "information_schema", "_pg_foreign_tables");
    }

}

