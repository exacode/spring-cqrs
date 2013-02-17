package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgDatabaseDatnameIndex is a Querydsl query type for QPgDatabaseDatnameIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgDatabaseDatnameIndex extends com.mysema.query.sql.RelationalPathBase<QPgDatabaseDatnameIndex> {

    private static final long serialVersionUID = 1698409542;

    public static final QPgDatabaseDatnameIndex pgDatabaseDatnameIndex = new QPgDatabaseDatnameIndex("pg_database_datname_index");

    public final SimplePath<Object> datname = createSimple("datname", Object.class);

    public QPgDatabaseDatnameIndex(String variable) {
        super(QPgDatabaseDatnameIndex.class, forVariable(variable), "pg_catalog", "pg_database_datname_index");
    }

    @SuppressWarnings("all")
    public QPgDatabaseDatnameIndex(Path<? extends QPgDatabaseDatnameIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_database_datname_index");
    }

    public QPgDatabaseDatnameIndex(PathMetadata<?> metadata) {
        super(QPgDatabaseDatnameIndex.class, metadata, "pg_catalog", "pg_database_datname_index");
    }

}

