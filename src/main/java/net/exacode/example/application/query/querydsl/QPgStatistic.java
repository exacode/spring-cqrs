package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgStatistic is a Querydsl query type for QPgStatistic
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgStatistic extends com.mysema.query.sql.RelationalPathBase<QPgStatistic> {

    private static final long serialVersionUID = 1943396437;

    public static final QPgStatistic pgStatistic = new QPgStatistic("pg_statistic");

    public final NumberPath<Short> staattnum = createNumber("staattnum", Short.class);

    public final NumberPath<Float> stadistinct = createNumber("stadistinct", Float.class);

    public final BooleanPath stainherit = createBoolean("stainherit");

    public final NumberPath<Short> stakind1 = createNumber("stakind1", Short.class);

    public final NumberPath<Short> stakind2 = createNumber("stakind2", Short.class);

    public final NumberPath<Short> stakind3 = createNumber("stakind3", Short.class);

    public final NumberPath<Short> stakind4 = createNumber("stakind4", Short.class);

    public final NumberPath<Float> stanullfrac = createNumber("stanullfrac", Float.class);

    public final SimplePath<Object[]> stanumbers1 = createSimple("stanumbers1", Object[].class);

    public final SimplePath<Object[]> stanumbers2 = createSimple("stanumbers2", Object[].class);

    public final SimplePath<Object[]> stanumbers3 = createSimple("stanumbers3", Object[].class);

    public final SimplePath<Object[]> stanumbers4 = createSimple("stanumbers4", Object[].class);

    public final NumberPath<Long> staop1 = createNumber("staop1", Long.class);

    public final NumberPath<Long> staop2 = createNumber("staop2", Long.class);

    public final NumberPath<Long> staop3 = createNumber("staop3", Long.class);

    public final NumberPath<Long> staop4 = createNumber("staop4", Long.class);

    public final NumberPath<Long> starelid = createNumber("starelid", Long.class);

    public final SimplePath<Object> stavalues1 = createSimple("stavalues1", Object.class);

    public final SimplePath<Object> stavalues2 = createSimple("stavalues2", Object.class);

    public final SimplePath<Object> stavalues3 = createSimple("stavalues3", Object.class);

    public final SimplePath<Object> stavalues4 = createSimple("stavalues4", Object.class);

    public final NumberPath<Integer> stawidth = createNumber("stawidth", Integer.class);

    public QPgStatistic(String variable) {
        super(QPgStatistic.class, forVariable(variable), "pg_catalog", "pg_statistic");
    }

    @SuppressWarnings("all")
    public QPgStatistic(Path<? extends QPgStatistic> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_statistic");
    }

    public QPgStatistic(PathMetadata<?> metadata) {
        super(QPgStatistic.class, metadata, "pg_catalog", "pg_statistic");
    }

}

