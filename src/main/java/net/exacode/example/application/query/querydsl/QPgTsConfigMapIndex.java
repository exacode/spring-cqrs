package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgTsConfigMapIndex is a Querydsl query type for QPgTsConfigMapIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgTsConfigMapIndex extends com.mysema.query.sql.RelationalPathBase<QPgTsConfigMapIndex> {

    private static final long serialVersionUID = 1059044338;

    public static final QPgTsConfigMapIndex pgTsConfigMapIndex = new QPgTsConfigMapIndex("pg_ts_config_map_index");

    public final NumberPath<Long> mapcfg = createNumber("mapcfg", Long.class);

    public final NumberPath<Integer> mapseqno = createNumber("mapseqno", Integer.class);

    public final NumberPath<Integer> maptokentype = createNumber("maptokentype", Integer.class);

    public QPgTsConfigMapIndex(String variable) {
        super(QPgTsConfigMapIndex.class, forVariable(variable), "pg_catalog", "pg_ts_config_map_index");
    }

    @SuppressWarnings("all")
    public QPgTsConfigMapIndex(Path<? extends QPgTsConfigMapIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_ts_config_map_index");
    }

    public QPgTsConfigMapIndex(PathMetadata<?> metadata) {
        super(QPgTsConfigMapIndex.class, metadata, "pg_catalog", "pg_ts_config_map_index");
    }

}

