package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgStats is a Querydsl query type for QPgStats
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgStats extends com.mysema.query.sql.RelationalPathBase<QPgStats> {

    private static final long serialVersionUID = 22836772;

    public static final QPgStats pgStats = new QPgStats("pg_stats");

    public final StringPath attname = createString("attname");

    public final NumberPath<Integer> avgWidth = createNumber("avg_width", Integer.class);

    public final NumberPath<Float> correlation = createNumber("correlation", Float.class);

    public final SimplePath<Object> histogramBounds = createSimple("histogram_bounds", Object.class);

    public final BooleanPath inherited = createBoolean("inherited");

    public final SimplePath<Object[]> mostCommonFreqs = createSimple("most_common_freqs", Object[].class);

    public final SimplePath<Object> mostCommonVals = createSimple("most_common_vals", Object.class);

    public final NumberPath<Float> nDistinct = createNumber("n_distinct", Float.class);

    public final NumberPath<Float> nullFrac = createNumber("null_frac", Float.class);

    public final StringPath schemaname = createString("schemaname");

    public final StringPath tablename = createString("tablename");

    public QPgStats(String variable) {
        super(QPgStats.class, forVariable(variable), "pg_catalog", "pg_stats");
    }

    @SuppressWarnings("all")
    public QPgStats(Path<? extends QPgStats> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_stats");
    }

    public QPgStats(PathMetadata<?> metadata) {
        super(QPgStats.class, metadata, "pg_catalog", "pg_stats");
    }

}

