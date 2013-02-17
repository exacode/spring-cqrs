package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgForeignServer is a Querydsl query type for QPgForeignServer
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgForeignServer extends com.mysema.query.sql.RelationalPathBase<QPgForeignServer> {

    private static final long serialVersionUID = -383120964;

    public static final QPgForeignServer pgForeignServer = new QPgForeignServer("pg_foreign_server");

    public final SimplePath<Object[]> srvacl = createSimple("srvacl", Object[].class);

    public final NumberPath<Long> srvfdw = createNumber("srvfdw", Long.class);

    public final StringPath srvname = createString("srvname");

    public final SimplePath<Object[]> srvoptions = createSimple("srvoptions", Object[].class);

    public final NumberPath<Long> srvowner = createNumber("srvowner", Long.class);

    public final StringPath srvtype = createString("srvtype");

    public final StringPath srvversion = createString("srvversion");

    public QPgForeignServer(String variable) {
        super(QPgForeignServer.class, forVariable(variable), "pg_catalog", "pg_foreign_server");
    }

    @SuppressWarnings("all")
    public QPgForeignServer(Path<? extends QPgForeignServer> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_foreign_server");
    }

    public QPgForeignServer(PathMetadata<?> metadata) {
        super(QPgForeignServer.class, metadata, "pg_catalog", "pg_foreign_server");
    }

}

