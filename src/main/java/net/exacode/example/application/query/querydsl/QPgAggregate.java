package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgAggregate is a Querydsl query type for QPgAggregate
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgAggregate extends com.mysema.query.sql.RelationalPathBase<QPgAggregate> {

    private static final long serialVersionUID = -95132476;

    public static final QPgAggregate pgAggregate = new QPgAggregate("pg_aggregate");

    public final SimplePath<Object> aggfinalfn = createSimple("aggfinalfn", Object.class);

    public final SimplePath<Object> aggfnoid = createSimple("aggfnoid", Object.class);

    public final StringPath agginitval = createString("agginitval");

    public final NumberPath<Long> aggsortop = createNumber("aggsortop", Long.class);

    public final SimplePath<Object> aggtransfn = createSimple("aggtransfn", Object.class);

    public final NumberPath<Long> aggtranstype = createNumber("aggtranstype", Long.class);

    public QPgAggregate(String variable) {
        super(QPgAggregate.class, forVariable(variable), "pg_catalog", "pg_aggregate");
    }

    @SuppressWarnings("all")
    public QPgAggregate(Path<? extends QPgAggregate> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_aggregate");
    }

    public QPgAggregate(PathMetadata<?> metadata) {
        super(QPgAggregate.class, metadata, "pg_catalog", "pg_aggregate");
    }

}

