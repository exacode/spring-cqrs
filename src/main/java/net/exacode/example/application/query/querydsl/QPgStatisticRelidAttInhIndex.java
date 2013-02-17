package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgStatisticRelidAttInhIndex is a Querydsl query type for QPgStatisticRelidAttInhIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgStatisticRelidAttInhIndex extends com.mysema.query.sql.RelationalPathBase<QPgStatisticRelidAttInhIndex> {

    private static final long serialVersionUID = 631788241;

    public static final QPgStatisticRelidAttInhIndex pgStatisticRelidAttInhIndex = new QPgStatisticRelidAttInhIndex("pg_statistic_relid_att_inh_index");

    public final NumberPath<Short> staattnum = createNumber("staattnum", Short.class);

    public final BooleanPath stainherit = createBoolean("stainherit");

    public final NumberPath<Long> starelid = createNumber("starelid", Long.class);

    public QPgStatisticRelidAttInhIndex(String variable) {
        super(QPgStatisticRelidAttInhIndex.class, forVariable(variable), "pg_catalog", "pg_statistic_relid_att_inh_index");
    }

    @SuppressWarnings("all")
    public QPgStatisticRelidAttInhIndex(Path<? extends QPgStatisticRelidAttInhIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_statistic_relid_att_inh_index");
    }

    public QPgStatisticRelidAttInhIndex(PathMetadata<?> metadata) {
        super(QPgStatisticRelidAttInhIndex.class, metadata, "pg_catalog", "pg_statistic_relid_att_inh_index");
    }

}

