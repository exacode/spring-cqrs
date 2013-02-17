package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgTsConfig is a Querydsl query type for QPgTsConfig
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgTsConfig extends com.mysema.query.sql.RelationalPathBase<QPgTsConfig> {

    private static final long serialVersionUID = 1717208828;

    public static final QPgTsConfig pgTsConfig = new QPgTsConfig("pg_ts_config");

    public final StringPath cfgname = createString("cfgname");

    public final NumberPath<Long> cfgnamespace = createNumber("cfgnamespace", Long.class);

    public final NumberPath<Long> cfgowner = createNumber("cfgowner", Long.class);

    public final NumberPath<Long> cfgparser = createNumber("cfgparser", Long.class);

    public QPgTsConfig(String variable) {
        super(QPgTsConfig.class, forVariable(variable), "pg_catalog", "pg_ts_config");
    }

    @SuppressWarnings("all")
    public QPgTsConfig(Path<? extends QPgTsConfig> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_ts_config");
    }

    public QPgTsConfig(PathMetadata<?> metadata) {
        super(QPgTsConfig.class, metadata, "pg_catalog", "pg_ts_config");
    }

}

