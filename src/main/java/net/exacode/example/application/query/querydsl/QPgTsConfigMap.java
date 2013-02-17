package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgTsConfigMap is a Querydsl query type for QPgTsConfigMap
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgTsConfigMap extends com.mysema.query.sql.RelationalPathBase<QPgTsConfigMap> {

    private static final long serialVersionUID = 12809408;

    public static final QPgTsConfigMap pgTsConfigMap = new QPgTsConfigMap("pg_ts_config_map");

    public final NumberPath<Long> mapcfg = createNumber("mapcfg", Long.class);

    public final NumberPath<Long> mapdict = createNumber("mapdict", Long.class);

    public final NumberPath<Integer> mapseqno = createNumber("mapseqno", Integer.class);

    public final NumberPath<Integer> maptokentype = createNumber("maptokentype", Integer.class);

    public QPgTsConfigMap(String variable) {
        super(QPgTsConfigMap.class, forVariable(variable), "pg_catalog", "pg_ts_config_map");
    }

    @SuppressWarnings("all")
    public QPgTsConfigMap(Path<? extends QPgTsConfigMap> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_ts_config_map");
    }

    public QPgTsConfigMap(PathMetadata<?> metadata) {
        super(QPgTsConfigMap.class, metadata, "pg_catalog", "pg_ts_config_map");
    }

}

