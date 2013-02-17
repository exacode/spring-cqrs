package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgAggregateFnoidIndex is a Querydsl query type for QPgAggregateFnoidIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgAggregateFnoidIndex extends com.mysema.query.sql.RelationalPathBase<QPgAggregateFnoidIndex> {

    private static final long serialVersionUID = 1672116692;

    public static final QPgAggregateFnoidIndex pgAggregateFnoidIndex = new QPgAggregateFnoidIndex("pg_aggregate_fnoid_index");

    public final SimplePath<Object> aggfnoid = createSimple("aggfnoid", Object.class);

    public QPgAggregateFnoidIndex(String variable) {
        super(QPgAggregateFnoidIndex.class, forVariable(variable), "pg_catalog", "pg_aggregate_fnoid_index");
    }

    @SuppressWarnings("all")
    public QPgAggregateFnoidIndex(Path<? extends QPgAggregateFnoidIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_aggregate_fnoid_index");
    }

    public QPgAggregateFnoidIndex(PathMetadata<?> metadata) {
        super(QPgAggregateFnoidIndex.class, metadata, "pg_catalog", "pg_aggregate_fnoid_index");
    }

}

