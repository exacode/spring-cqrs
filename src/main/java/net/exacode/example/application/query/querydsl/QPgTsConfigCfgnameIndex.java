package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgTsConfigCfgnameIndex is a Querydsl query type for QPgTsConfigCfgnameIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgTsConfigCfgnameIndex extends com.mysema.query.sql.RelationalPathBase<QPgTsConfigCfgnameIndex> {

    private static final long serialVersionUID = -164065729;

    public static final QPgTsConfigCfgnameIndex pgTsConfigCfgnameIndex = new QPgTsConfigCfgnameIndex("pg_ts_config_cfgname_index");

    public final SimplePath<Object> cfgname = createSimple("cfgname", Object.class);

    public final NumberPath<Long> cfgnamespace = createNumber("cfgnamespace", Long.class);

    public QPgTsConfigCfgnameIndex(String variable) {
        super(QPgTsConfigCfgnameIndex.class, forVariable(variable), "pg_catalog", "pg_ts_config_cfgname_index");
    }

    @SuppressWarnings("all")
    public QPgTsConfigCfgnameIndex(Path<? extends QPgTsConfigCfgnameIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_ts_config_cfgname_index");
    }

    public QPgTsConfigCfgnameIndex(PathMetadata<?> metadata) {
        super(QPgTsConfigCfgnameIndex.class, metadata, "pg_catalog", "pg_ts_config_cfgname_index");
    }

}

