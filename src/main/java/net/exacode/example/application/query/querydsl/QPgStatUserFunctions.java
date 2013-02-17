package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgStatUserFunctions is a Querydsl query type for QPgStatUserFunctions
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgStatUserFunctions extends com.mysema.query.sql.RelationalPathBase<QPgStatUserFunctions> {

    private static final long serialVersionUID = 1044050977;

    public static final QPgStatUserFunctions pgStatUserFunctions = new QPgStatUserFunctions("pg_stat_user_functions");

    public final NumberPath<Long> calls = createNumber("calls", Long.class);

    public final NumberPath<Long> funcid = createNumber("funcid", Long.class);

    public final StringPath funcname = createString("funcname");

    public final StringPath schemaname = createString("schemaname");

    public final NumberPath<Long> selfTime = createNumber("self_time", Long.class);

    public final NumberPath<Long> totalTime = createNumber("total_time", Long.class);

    public QPgStatUserFunctions(String variable) {
        super(QPgStatUserFunctions.class, forVariable(variable), "pg_catalog", "pg_stat_user_functions");
    }

    @SuppressWarnings("all")
    public QPgStatUserFunctions(Path<? extends QPgStatUserFunctions> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_stat_user_functions");
    }

    public QPgStatUserFunctions(PathMetadata<?> metadata) {
        super(QPgStatUserFunctions.class, metadata, "pg_catalog", "pg_stat_user_functions");
    }

}

