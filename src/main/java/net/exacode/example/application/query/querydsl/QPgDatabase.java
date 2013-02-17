package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgDatabase is a Querydsl query type for QPgDatabase
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgDatabase extends com.mysema.query.sql.RelationalPathBase<QPgDatabase> {

    private static final long serialVersionUID = -2098580010;

    public static final QPgDatabase pgDatabase = new QPgDatabase("pg_database");

    public final SimplePath<Object[]> datacl = createSimple("datacl", Object[].class);

    public final BooleanPath datallowconn = createBoolean("datallowconn");

    public final StringPath datcollate = createString("datcollate");

    public final NumberPath<Integer> datconnlimit = createNumber("datconnlimit", Integer.class);

    public final StringPath datctype = createString("datctype");

    public final NumberPath<Long> datdba = createNumber("datdba", Long.class);

    public final SimplePath<Object> datfrozenxid = createSimple("datfrozenxid", Object.class);

    public final BooleanPath datistemplate = createBoolean("datistemplate");

    public final NumberPath<Long> datlastsysoid = createNumber("datlastsysoid", Long.class);

    public final StringPath datname = createString("datname");

    public final NumberPath<Long> dattablespace = createNumber("dattablespace", Long.class);

    public final NumberPath<Integer> encoding = createNumber("encoding", Integer.class);

    public QPgDatabase(String variable) {
        super(QPgDatabase.class, forVariable(variable), "pg_catalog", "pg_database");
    }

    @SuppressWarnings("all")
    public QPgDatabase(Path<? extends QPgDatabase> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_database");
    }

    public QPgDatabase(PathMetadata<?> metadata) {
        super(QPgDatabase.class, metadata, "pg_catalog", "pg_database");
    }

}

