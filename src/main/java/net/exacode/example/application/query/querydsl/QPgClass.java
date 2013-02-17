package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgClass is a Querydsl query type for QPgClass
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgClass extends com.mysema.query.sql.RelationalPathBase<QPgClass> {

    private static final long serialVersionUID = 7822077;

    public static final QPgClass pgClass = new QPgClass("pg_class");

    public final SimplePath<Object[]> relacl = createSimple("relacl", Object[].class);

    public final NumberPath<Long> relam = createNumber("relam", Long.class);

    public final NumberPath<Short> relchecks = createNumber("relchecks", Short.class);

    public final NumberPath<Long> relfilenode = createNumber("relfilenode", Long.class);

    public final SimplePath<Object> relfrozenxid = createSimple("relfrozenxid", Object.class);

    public final BooleanPath relhasindex = createBoolean("relhasindex");

    public final BooleanPath relhasoids = createBoolean("relhasoids");

    public final BooleanPath relhaspkey = createBoolean("relhaspkey");

    public final BooleanPath relhasrules = createBoolean("relhasrules");

    public final BooleanPath relhassubclass = createBoolean("relhassubclass");

    public final BooleanPath relhastriggers = createBoolean("relhastriggers");

    public final BooleanPath relisshared = createBoolean("relisshared");

    public final StringPath relkind = createString("relkind");

    public final StringPath relname = createString("relname");

    public final NumberPath<Long> relnamespace = createNumber("relnamespace", Long.class);

    public final NumberPath<Short> relnatts = createNumber("relnatts", Short.class);

    public final NumberPath<Long> reloftype = createNumber("reloftype", Long.class);

    public final SimplePath<Object[]> reloptions = createSimple("reloptions", Object[].class);

    public final NumberPath<Long> relowner = createNumber("relowner", Long.class);

    public final NumberPath<Integer> relpages = createNumber("relpages", Integer.class);

    public final StringPath relpersistence = createString("relpersistence");

    public final NumberPath<Long> reltablespace = createNumber("reltablespace", Long.class);

    public final NumberPath<Long> reltoastidxid = createNumber("reltoastidxid", Long.class);

    public final NumberPath<Long> reltoastrelid = createNumber("reltoastrelid", Long.class);

    public final NumberPath<Float> reltuples = createNumber("reltuples", Float.class);

    public final NumberPath<Long> reltype = createNumber("reltype", Long.class);

    public QPgClass(String variable) {
        super(QPgClass.class, forVariable(variable), "pg_catalog", "pg_class");
    }

    @SuppressWarnings("all")
    public QPgClass(Path<? extends QPgClass> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_class");
    }

    public QPgClass(PathMetadata<?> metadata) {
        super(QPgClass.class, metadata, "pg_catalog", "pg_class");
    }

}

