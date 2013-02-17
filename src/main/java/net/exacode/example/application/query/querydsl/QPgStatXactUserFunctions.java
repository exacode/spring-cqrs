package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgStatXactUserFunctions is a Querydsl query type for QPgStatXactUserFunctions
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgStatXactUserFunctions extends com.mysema.query.sql.RelationalPathBase<QPgStatXactUserFunctions> {

    private static final long serialVersionUID = 412502183;

    public static final QPgStatXactUserFunctions pgStatXactUserFunctions = new QPgStatXactUserFunctions("pg_stat_xact_user_functions");

    public final NumberPath<Long> calls = createNumber("calls", Long.class);

    public final NumberPath<Long> funcid = createNumber("funcid", Long.class);

    public final StringPath funcname = createString("funcname");

    public final StringPath schemaname = createString("schemaname");

    public final NumberPath<Long> selfTime = createNumber("self_time", Long.class);

    public final NumberPath<Long> totalTime = createNumber("total_time", Long.class);

    public QPgStatXactUserFunctions(String variable) {
        super(QPgStatXactUserFunctions.class, forVariable(variable), "pg_catalog", "pg_stat_xact_user_functions");
    }

    @SuppressWarnings("all")
    public QPgStatXactUserFunctions(Path<? extends QPgStatXactUserFunctions> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_stat_xact_user_functions");
    }

    public QPgStatXactUserFunctions(PathMetadata<?> metadata) {
        super(QPgStatXactUserFunctions.class, metadata, "pg_catalog", "pg_stat_xact_user_functions");
    }

}

